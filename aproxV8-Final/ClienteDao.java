import java.util.List;

public interface ClienteDao {
    boolean registrarCliente(Cliente cliente) throws DAOException;
    List<Cliente> obtenerClientes() throws DAOException;
    boolean actualizarCliente(Cliente cliente) throws DAOException;
    boolean eliminarCliente(Cliente cliente) throws DAOException;
    Cliente obtenerClientePorId(int id) throws DAOException;
}