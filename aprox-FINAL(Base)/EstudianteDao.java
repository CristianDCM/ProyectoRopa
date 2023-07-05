import java.util.List;

public interface EstudianteDao {
    boolean registrarEstudiante(Estudiante estudiante) throws DAOException;
    List<Estudiante> obtenerEstudiantes() throws DAOException;
    boolean actualizarEstudiante(Estudiante estudiante) throws DAOException;
    boolean eliminarEstudiante(Estudiante estudiante) throws DAOException;
    Estudiante obtenerEstudiantePorId(int id) throws DAOException;
}