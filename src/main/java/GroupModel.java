import java.util.List;

public class GroupModel {
    private Long years;
    private Long project_id;
    private List<Model> models;

    public GroupModel(Long projectId, Long year, List<Model> models) {
        this.years = year;
        this.project_id = projectId;
        this.models = models;
    }

    public boolean isComplyWithPrevious(GroupModel prevYearGroupModel) {
        for (Model model : models) {
            for (Model model1 : prevYearGroupModel.getModels()) {
                if (model.getUncert_lvl().equals(model1.getUncert_lvl())) {
                    if (!(isValueEquals(model.getRec_oil_prev(), model1.getRec_oil())
                            && isValueEquals(model.getRec_con_prev(), model1.getRec_con())
                            && isValueEquals(model.getRec_ga_prev(), model1.getRec_ga())
                            && isValueEquals(model.getRec_gn_prev(), model1.getRec_gn())
                            && isValueEquals(model.getRes_oil_prev(), model1.getRes_oil())
                            && isValueEquals(model.getRes_con_prev(), model1.getRes_con())
                            && isValueEquals(model.getRes_ga_prev(), model1.getRes_ga())
                            && isValueEquals(model.getRes_gn_prev(), model1.getRes_gn()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean isValueEquals(Double v1, Double v2) {
        return (v1 == null && v2 == null) || (v1 != null && v1.equals(v2));
    }

    public Long getYears() {
        return years;
    }

    public void setYears(Long years) {
        this.years = years;
    }

    public Long getProject_id() {
        return project_id;
    }

    public void setProject_id(Long project_id) {
        this.project_id = project_id;
    }

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }


    @Override
    public String toString() {
        return "GroupModel{" +
                "years=" + years +
                ", project_id=" + project_id +
                '}';
    }
}
