public class EstudianteDAOFactory {
    public static EstudianteDao creaEstudianteDAO() throws DAOException {
        return new EstudianteDaoImpl();
    }
}