import java.sql.ResultSet;
import java.sql.SQLException;

public class Util {
    public static Double getDoubleNicelyFromResultSet(ResultSet rs, String columnName) throws SQLException {
        return rs.getObject(columnName) != null ? rs.getDouble(columnName) : null;
    }
}
