import java.util.List;

public class ControladorCliente {
    private final VistaDatosCliente vista;
    private final InterfazClienteDAO dao;

    public ControladorCliente() throws BDExcepcionDAO {
        this.vista = new VistaDatosCliente();
        this.dao = FabricaClienteDAO.creaClienteDAO();
    }

    public void guardarDato(ClienteRopa cliente) {
        try {
            dao.guardarCliente(cliente);
        } catch (BDExcepcionDAO e) {
            mostrarError("Error al registrar cliente", e);
        }
    }

    public void modificarDato(ClienteRopa cliente) {
        try {
            dao.modificarCliente(cliente);
        } catch (BDExcepcionDAO e) {
            mostrarError("Error al modificar el cliente", e);
        }
    }

    public void eliminarDato(ClienteRopa cliente) {
        try {
            dao.eliminarCliente(cliente);
        } catch (BDExcepcionDAO e) {
            mostrarError("Error al eliminar el cliente", e);
        }
    }
    
    public void verDatosClientes() {
        try {
            List<ClienteRopa> clientes = dao.obtenerClientes();
            vista.verDatosClientes(clientes);
        } catch (BDExcepcionDAO e) {
            mostrarError("Error al obtener los clientes", e);
        }
    }

    public ClienteRopa obtenerClientePorSuId(int idCliente) {
        try {
            return dao.obtenerClientePorSuId(idCliente);
        } catch (BDExcepcionDAO e) {
            mostrarError("Error al obtener el cliente por ID", e);
            return null;
        }
    }

    private void mostrarError(String mensaje, Exception e) {
        System.out.println(mensaje);
        e.printStackTrace();
    }
}