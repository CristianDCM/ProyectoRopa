import java.util.List;

public class ControllerEstudiante {
    private final ViewEstudiante vista;
    private final EstudianteDao dao;

    public ControllerEstudiante() throws DAOException {
        this.vista = new ViewEstudiante();
        this.dao = EstudianteDAOFactory.creaEstudianteDAO();
    }

    public void registrar(Estudiante estudiante) {
        try {
            dao.registrarEstudiante(estudiante);
        } catch (DAOException e) {
            mostrarError("Error al registrar el estudiante", e);
        }
    }

    public void actualizar(Estudiante estudiante) {
        try {
            dao.actualizarEstudiante(estudiante);
        } catch (DAOException e) {
            mostrarError("Error al actualizar el estudiante", e);
        }
    }

    public void eliminar(Estudiante estudiante) {
        try {
            dao.eliminarEstudiante(estudiante);
        } catch (DAOException e) {
            mostrarError("Error al eliminar el estudiante", e);
        }
    }
    
    public void verEstudiantes() {
        try {
            List<Estudiante> estudiantes = dao.obtenerEstudiantes();
            vista.verEstudiantes(estudiantes);
        } catch (DAOException e) {
            mostrarError("Error al obtener los estudiantes", e);
        }
    }

    public Estudiante obtenerEstudiantePorId(int id) {
        try {
            return dao.obtenerEstudiantePorId(id);
        } catch (DAOException e) {
            mostrarError("Error al obtener el estudiante por ID", e);
            return null;
        }
    }

    private void mostrarError(String mensaje, Exception e) {
        System.out.println(mensaje);
        e.printStackTrace();
    }
}






