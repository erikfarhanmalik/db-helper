import java.sql.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    private final String url = "jdbc:postgresql://localhost/esdc";
    private final String user = "postgres";
    private final String password = "@D3lt44pp1234*";

    public Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public List<Model> doQuery(String query) throws SQLException {
        List<Model> result = new ArrayList<>();
        Statement stmt = getConnection().createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            result.add(new Model(rs));
        }
        return result;
    }

    private Map<String, List<Model>> createMappingGroupModel(List<Model> models) {
        Map<String, List<Model>> mappingGroupModel = new HashMap<>();
        models.forEach(model -> mappingGroupModel.merge(
                model.getProject_id() + "_" + model.getYears(),
                Stream.of(model).collect(Collectors.toList()),
                (l1, l2) -> {
                    l1.addAll(l2);
                    return l1;
                }));
        return mappingGroupModel;
    }

    private Map<Long, List<GroupModel>> createProjectMapping(Map<String, List<Model>> mappingGroupModel) {
        Map<Long, List<GroupModel>> projectMapping = new HashMap<>();
        for (String key : mappingGroupModel.keySet()) {
            Long projectId = Long.valueOf(key.split("_")[0]);
            Long year = Long.valueOf(key.split("_")[1]);
            projectMapping.merge(
                    projectId,
                    Stream.of(new GroupModel(projectId, year, mappingGroupModel.get(key))).collect(Collectors.toList()),
                    (l1, l2) -> {
                        l1.addAll(l2);
                        return l1;
                    });
        }
        return projectMapping;
    }

    private List<List<GroupModel>> findInvalidGroupModels(Map<Long, List<GroupModel>> projectMapping) {
        List<List<GroupModel>> invalids = new ArrayList<>();
        for (Map.Entry<Long, List<GroupModel>> entry : projectMapping.entrySet()) {
            List<GroupModel> groupModels = entry.getValue();
            if (groupModels.size() < 2) {
                continue;
            }
            GroupModel groupModel;
            GroupModel prevYearGroupModel;
            if (groupModels.get(0).getYears() > groupModels.get(1).getYears()) {
                groupModel = groupModels.get(0);
                prevYearGroupModel = groupModels.get(1);
            } else {
                groupModel = groupModels.get(1);
                prevYearGroupModel = groupModels.get(0);
            }

            if (!groupModel.isComplyWithPrevious(prevYearGroupModel)) {
                invalids.add(Arrays.asList(groupModel, prevYearGroupModel));
            }
        }
        return invalids;
    }

    public static void main(String[] args) throws SQLException {
        App app = new App();
        String query = "select rr.years, rv.* from app.resources_volumetric rv " +
                "join app.report_resources rr on rr.id = rv.report_id " +
                "order by id desc";
        List<Model> models = app.doQuery(query);
        Map<String, List<Model>> mappingGroupModel = app.createMappingGroupModel(models);
        Map<Long, List<GroupModel>> projectMapping = app.createProjectMapping(mappingGroupModel);
        List<List<GroupModel>> invalids = app.findInvalidGroupModels(projectMapping);

        System.out.println(invalids.size());
        invalids.forEach(invalid -> {
            System.out.println("invalid: " + invalid.get(0));
            System.out.println("prevData: " + invalid.get(1));
            System.out.println("=============================");
        });


//        next: fix the invalid to be valid
    }

}
