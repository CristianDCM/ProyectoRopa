import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoImpl implements ClienteDao {

    private static final String INSERT_QUERY = "INSERT INTO cliente (identificacion, nombre, genero, calificacion1, calificacion2, calificacion3) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SELECT_ALL_QUERY = "SELECT * FROM cliente ORDER BY id";
    private static final String UPDATE_QUERY = "UPDATE cliente SET identificacion=?, nombre=?, genero=?, calificacion1=?, calificacion2=?, calificacion3=? WHERE id=?";
    private static final String DELETE_QUERY = "DELETE FROM cliente WHERE id=?";
    private static final String SELECT_BY_ID_QUERY = "SELECT * FROM cliente WHERE id = ?";

    @Override
    public boolean registrarCliente(Cliente cliente) throws DAOException {
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(INSERT_QUERY)) {
            pstmt.setString(1, cliente.getIdentificacion());
            pstmt.setString(2, cliente.getNombre());
            pstmt.setString(3, cliente.getGenero());
            pstmt.setDouble(4, cliente.getCalificacion1());
            pstmt.setDouble(5, cliente.getCalificacion2());
            pstmt.setDouble(6, cliente.getCalificacion3());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new DAOException("Error al registrar el cliente", e);
        }
    }

    @Override
    public List<Cliente> obtenerClientes() throws DAOException {
        List<Cliente> listaCliente = new ArrayList<>();

        try (Connection con = Conexion.conectar();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(SELECT_ALL_QUERY)) {
            while (rs.next()) {
                Cliente cliente = obtenerClienteDesdeResultSet(rs);
                listaCliente.add(cliente);
            }
        } catch (SQLException e) {
            throw new DAOException("Error al obtener los clientes", e);
        }

        return listaCliente;
    }

    @Override
    public boolean actualizarCliente(Cliente cliente) throws DAOException {
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(UPDATE_QUERY)) {
            pstmt.setString(1, cliente.getIdentificacion());
            pstmt.setString(2, cliente.getNombre());
            pstmt.setString(3, cliente.getGenero());
            pstmt.setDouble(4, cliente.getCalificacion1());
            pstmt.setDouble(5, cliente.getCalificacion2());
            pstmt.setDouble(6, cliente.getCalificacion3());
            pstmt.setInt(7, cliente.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new DAOException("Error al actualizar el cliente", e);
        }
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) throws DAOException {
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(DELETE_QUERY)) {
            pstmt.setInt(1, cliente.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new DAOException("Error al eliminar el cliente", e);
        }
    }

    @Override
    public Cliente obtenerClientePorId(int id) throws DAOException {
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(SELECT_BY_ID_QUERY)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return obtenerClienteDesdeResultSet(rs);
                }
            }
        } catch (SQLException e) {
            throw new DAOException("Error al obtener el cliente por ID", e);
        }
        return null;
    }

    private Cliente obtenerClienteDesdeResultSet(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String identificacion = rs.getString("identificacion");
        String nombre = rs.getString("nombre");
        String genero = rs.getString("genero");
        double calificacion1 = rs.getDouble("calificacion1");
        double calificacion2 = rs.getDouble("calificacion2");
        double calificacion3 = rs.getDouble("calificacion3");
        return new Cliente(id, identificacion, nombre, genero, calificacion1, calificacion2, calificacion3);
    }
}


