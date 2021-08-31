import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) throws SQLException {
        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        Connection conn = null;
        try {
             conn = DriverManager.getConnection(urlConnection,"root", "rangel14");
            System.out.println("Sucesso");
        }catch (Exception e){
            System.out.println(e);
        } finally {
            conn.close();
        }
    }
}
