import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class Model {
    private Long id;
    private Long years;
    private Long project_id;
    private Long report_id;
    private String remark;
    private String project_name;
    private String uncert_lvl;
    private Double rec_oil;
    private Double rec_con;
    private Double rec_ga;
    private Double rec_gn;
    private Double res_oil;
    private Double res_con;
    private Double res_ga;
    private Double res_gn;
    private Double rec_oil_prev;
    private Double rec_con_prev;
    private Double rec_ga_prev;
    private Double rec_gn_prev;
    private Double res_oil_prev;
    private Double res_con_prev;
    private Double res_ga_prev;
    private Double res_gn_prev;

    public Model(ResultSet rs) throws SQLException {
        id = rs.getLong("id");
        years = rs.getLong("years");
        project_id = rs.getLong("project_id");
        report_id = rs.getLong("report_id");
        remark = rs.getString("remark");
        project_name = rs.getString("project_name");
        uncert_lvl = rs.getString("uncert_lvl");
        rec_oil = Util.getDoubleNicelyFromResultSet(rs, "rec_oil");
        rec_con = Util.getDoubleNicelyFromResultSet(rs, "rec_con");
        rec_ga = Util.getDoubleNicelyFromResultSet(rs, "rec_ga");
        rec_gn = Util.getDoubleNicelyFromResultSet(rs, "rec_gn");
        res_oil = Util.getDoubleNicelyFromResultSet(rs, "res_oil");
        res_con = Util.getDoubleNicelyFromResultSet(rs, "res_con");
        res_ga = Util.getDoubleNicelyFromResultSet(rs, "res_ga");
        res_gn = Util.getDoubleNicelyFromResultSet(rs, "res_gn");
        rec_oil_prev = Util.getDoubleNicelyFromResultSet(rs, "rec_oil_prev");
        rec_con_prev = Util.getDoubleNicelyFromResultSet(rs, "rec_con_prev");
        rec_ga_prev = Util.getDoubleNicelyFromResultSet(rs, "rec_ga_prev");
        rec_gn_prev = Util.getDoubleNicelyFromResultSet(rs, "rec_gn_prev");
        res_oil_prev = Util.getDoubleNicelyFromResultSet(rs, "res_oil_prev");
        res_con_prev = Util.getDoubleNicelyFromResultSet(rs, "res_con_prev");
        res_ga_prev = Util.getDoubleNicelyFromResultSet(rs, "res_ga_prev");
        res_gn_prev = Util.getDoubleNicelyFromResultSet(rs, "res_gn_prev");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getReport_id() {
        return report_id;
    }

    public void setReport_id(Long report_id) {
        this.report_id = report_id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getUncert_lvl() {
        return uncert_lvl;
    }

    public void setUncert_lvl(String uncert_lvl) {
        this.uncert_lvl = uncert_lvl;
    }

    public Double getRec_oil() {
        return rec_oil;
    }

    public void setRec_oil(Double rec_oil) {
        this.rec_oil = rec_oil;
    }

    public Double getRec_con() {
        return rec_con;
    }

    public void setRec_con(Double rec_con) {
        this.rec_con = rec_con;
    }

    public Double getRec_ga() {
        return rec_ga;
    }

    public void setRec_ga(Double rec_ga) {
        this.rec_ga = rec_ga;
    }

    public Double getRec_gn() {
        return rec_gn;
    }

    public void setRec_gn(Double rec_gn) {
        this.rec_gn = rec_gn;
    }

    public Double getRes_oil() {
        return res_oil;
    }

    public void setRes_oil(Double res_oil) {
        this.res_oil = res_oil;
    }

    public Double getRes_con() {
        return res_con;
    }

    public void setRes_con(Double res_con) {
        this.res_con = res_con;
    }

    public Double getRes_ga() {
        return res_ga;
    }

    public void setRes_ga(Double res_ga) {
        this.res_ga = res_ga;
    }

    public Double getRes_gn() {
        return res_gn;
    }

    public void setRes_gn(Double res_gn) {
        this.res_gn = res_gn;
    }

    public Double getRec_oil_prev() {
        return rec_oil_prev;
    }

    public void setRec_oil_prev(Double rec_oil_prev) {
        this.rec_oil_prev = rec_oil_prev;
    }

    public Double getRec_con_prev() {
        return rec_con_prev;
    }

    public void setRec_con_prev(Double rec_con_prev) {
        this.rec_con_prev = rec_con_prev;
    }

    public Double getRec_ga_prev() {
        return rec_ga_prev;
    }

    public void setRec_ga_prev(Double rec_ga_prev) {
        this.rec_ga_prev = rec_ga_prev;
    }

    public Double getRec_gn_prev() {
        return rec_gn_prev;
    }

    public void setRec_gn_prev(Double rec_gn_prev) {
        this.rec_gn_prev = rec_gn_prev;
    }

    public Double getRes_oil_prev() {
        return res_oil_prev;
    }

    public void setRes_oil_prev(Double res_oil_prev) {
        this.res_oil_prev = res_oil_prev;
    }

    public Double getRes_con_prev() {
        return res_con_prev;
    }

    public void setRes_con_prev(Double res_con_prev) {
        this.res_con_prev = res_con_prev;
    }

    public Double getRes_ga_prev() {
        return res_ga_prev;
    }

    public void setRes_ga_prev(Double res_ga_prev) {
        this.res_ga_prev = res_ga_prev;
    }

    public Double getRes_gn_prev() {
        return res_gn_prev;
    }

    public void setRes_gn_prev(Double res_gn_prev) {
        this.res_gn_prev = res_gn_prev;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Objects.equals(id, model.id) && Objects.equals(years, model.years) && Objects.equals(project_id, model.project_id) && Objects.equals(report_id, model.report_id) && Objects.equals(remark, model.remark) && Objects.equals(project_name, model.project_name) && Objects.equals(uncert_lvl, model.uncert_lvl) && Objects.equals(rec_oil, model.rec_oil) && Objects.equals(rec_con, model.rec_con) && Objects.equals(rec_ga, model.rec_ga) && Objects.equals(rec_gn, model.rec_gn) && Objects.equals(res_oil, model.res_oil) && Objects.equals(res_con, model.res_con) && Objects.equals(res_ga, model.res_ga) && Objects.equals(res_gn, model.res_gn) && Objects.equals(rec_oil_prev, model.rec_oil_prev) && Objects.equals(rec_con_prev, model.rec_con_prev) && Objects.equals(rec_ga_prev, model.rec_ga_prev) && Objects.equals(rec_gn_prev, model.rec_gn_prev) && Objects.equals(res_oil_prev, model.res_oil_prev) && Objects.equals(res_con_prev, model.res_con_prev) && Objects.equals(res_ga_prev, model.res_ga_prev) && Objects.equals(res_gn_prev, model.res_gn_prev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, years, project_id, report_id, remark, project_name, uncert_lvl, rec_oil, rec_con, rec_ga, rec_gn, res_oil, res_con, res_ga, res_gn, rec_oil_prev, rec_con_prev, rec_ga_prev, rec_gn_prev, res_oil_prev, res_con_prev, res_ga_prev, res_gn_prev);
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", years=" + years +
                ", project_id=" + project_id +
                ", report_id=" + report_id +
                ", remark='" + remark + '\'' +
                ", project_name='" + project_name + '\'' +
                ", uncert_lvl='" + uncert_lvl + '\'' +
                ", rec_oil=" + rec_oil +
                ", rec_con=" + rec_con +
                ", rec_ga=" + rec_ga +
                ", rec_gn=" + rec_gn +
                ", res_oil=" + res_oil +
                ", res_con=" + res_con +
                ", res_ga=" + res_ga +
                ", res_gn=" + res_gn +
                ", rec_oil_prev=" + rec_oil_prev +
                ", rec_con_prev=" + rec_con_prev +
                ", rec_ga_prev=" + rec_ga_prev +
                ", rec_gn_prev=" + rec_gn_prev +
                ", res_oil_prev=" + res_oil_prev +
                ", res_con_prev=" + res_con_prev +
                ", res_ga_prev=" + res_ga_prev +
                ", res_gn_prev=" + res_gn_prev +
                '}';
    }
}
