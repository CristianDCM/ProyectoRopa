public class ClienteDAOFactory {
    public static ClienteDao creaClienteDAO() throws DAOException {
        return new ClienteDaoImpl();
    }
}