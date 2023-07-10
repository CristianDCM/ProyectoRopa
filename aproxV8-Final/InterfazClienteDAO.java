import java.util.List;

public interface InterfazClienteDAO {
    boolean guardarCliente(ClienteRopa cliente) throws BDExcepcionDAO;
    List<ClienteRopa> obtenerClientes() throws BDExcepcionDAO;
    boolean modificarCliente(ClienteRopa cliente) throws BDExcepcionDAO;
    boolean eliminarCliente(ClienteRopa cliente) throws BDExcepcionDAO;
    ClienteRopa obtenerClientePorSuId(int idCliente) throws BDExcepcionDAO;
}