import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ImplementacionClienteDAO implements InterfazClienteDAO {

    private static final String insertarClienteQuery = "INSERT INTO cliente (cedulaCliente, nombreCliente, generoCliente, calificacionRopaMasculina, calificacionRopaFemenina, calificacionRopaUnisex) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String seleccionarTodosClientesQuery = "SELECT * FROM cliente ORDER BY idCliente";
    private static final String actualizarClienteQuery = "UPDATE cliente SET cedulaCliente=?, nombreCliente=?, generoCliente=?, calificacionRopaMasculina=?, calificacionRopaFemenina=?, calificacionRopaUnisex=? WHERE idCliente=?";
    private static final String eliminarClienteQuery = "DELETE FROM cliente WHERE idCliente=?";
    private static final String seleccionarClientePorIdQuery = "SELECT * FROM cliente WHERE idCliente = ?";

    @Override
    public boolean guardarCliente(ClienteRopa cliente) throws BDExcepcionDAO {
        try (Connection con = ConexionBD.abrirConexion();
             PreparedStatement pstmt = con.prepareStatement(insertarClienteQuery)) {
            pstmt.setString(1, cliente.getCedulaCliente());
            pstmt.setString(2, cliente.getNombreCliente());
            pstmt.setString(3, cliente.getGeneroCliente());
            pstmt.setDouble(4, cliente.getCalificacionRopaMasculina());
            pstmt.setDouble(5, cliente.getCalificacionRopaFemenina());
            pstmt.setDouble(6, cliente.getCalificacionRopaUnisex());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new BDExcepcionDAO("Error al registrar el cliente", e);
        }
    }

    @Override
    public List<ClienteRopa> obtenerClientes() throws BDExcepcionDAO {
        List<ClienteRopa> listaCliente = new ArrayList<>();

        try (Connection con = ConexionBD.abrirConexion();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(seleccionarTodosClientesQuery)) {
            while (rs.next()) {
                ClienteRopa cliente = obtenerClienteDesdeResultSet(rs);
                listaCliente.add(cliente);
            }
        } catch (SQLException e) {
            throw new BDExcepcionDAO("Error al obtener los clientes", e);
        }

        return listaCliente;
    }

    @Override
    public boolean modificarCliente(ClienteRopa cliente) throws BDExcepcionDAO {
        try (Connection con = ConexionBD.abrirConexion();
             PreparedStatement pstmt = con.prepareStatement(actualizarClienteQuery)) {
            pstmt.setString(1, cliente.getCedulaCliente());
            pstmt.setString(2, cliente.getNombreCliente());
            pstmt.setString(3, cliente.getGeneroCliente());
            pstmt.setDouble(4, cliente.getCalificacionRopaMasculina());
            pstmt.setDouble(5, cliente.getCalificacionRopaFemenina());
            pstmt.setDouble(6, cliente.getCalificacionRopaUnisex());
            pstmt.setInt(7, cliente.getIdCliente());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new BDExcepcionDAO("Error al modificar el cliente", e);
        }
    }

    @Override
    public boolean eliminarCliente(ClienteRopa cliente) throws BDExcepcionDAO {
        try (Connection con = ConexionBD.abrirConexion();
             PreparedStatement pstmt = con.prepareStatement(eliminarClienteQuery)) {
            pstmt.setInt(1, cliente.getIdCliente());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new BDExcepcionDAO("Error al eliminar el cliente", e);
        }
    }

    @Override
    public ClienteRopa obtenerClientePorSuId(int idCliente) throws BDExcepcionDAO {
        try (Connection con = ConexionBD.abrirConexion();
             PreparedStatement pstmt = con.prepareStatement(seleccionarClientePorIdQuery)) {
            pstmt.setInt(1, idCliente);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return obtenerClienteDesdeResultSet(rs);
                }
            }
        } catch (SQLException e) {
            throw new BDExcepcionDAO("Error al obtener el cliente por ID", e);
        }
        return null;
    }

    private ClienteRopa obtenerClienteDesdeResultSet(ResultSet rs) throws SQLException {
        int idCliente = rs.getInt("idCliente");
        String cedulaCliente = rs.getString("cedulaCliente");
        String nombreCliente = rs.getString("nombreCliente");
        String generoCliente = rs.getString("generoCliente");
        double calificacionRopaMasculina = rs.getDouble("calificacionRopaMasculina");
        double calificacionRopaFemenina = rs.getDouble("calificacionRopaFemenina");
        double calificacionRopaUnisex = rs.getDouble("calificacionRopaUnisex");
        return new ClienteRopa(idCliente, cedulaCliente, nombreCliente, generoCliente, calificacionRopaMasculina, calificacionRopaFemenina, calificacionRopaUnisex);
    }
}


