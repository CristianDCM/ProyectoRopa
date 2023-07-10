public class FabricaClienteDAO {
    public static InterfazClienteDAO creaClienteDAO() throws BDExcepcionDAO {
        return new ImplementacionClienteDAO();
    }
}