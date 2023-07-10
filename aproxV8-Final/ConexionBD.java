import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Driver;
import java.sql.SQLException;

public class ConexionBD {
    private static final String usuarioBD = "root";
    private static final String contrasenaBD = "";
    private static final String urlConexionBD = "jdbc:mysql://localhost:3306/tiendaropa?user=" + usuarioBD + "&password=" + contrasenaBD;

    public static Connection abrirConexion() {
        try {
            return DriverManager.getConnection(urlConexionBD);
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
            return null;
        }
    }

    public static void cerrarConexion(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión");
                e.printStackTrace();
            }
        }
    }
}