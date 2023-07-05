import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDaoImpl implements EstudianteDao {

    private static final String INSERT_QUERY = "INSERT INTO estudiante (identificacion, nombre, curso, nota1, nota2, nota3) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SELECT_ALL_QUERY = "SELECT * FROM estudiante ORDER BY id";
    private static final String UPDATE_QUERY = "UPDATE estudiante SET identificacion=?, nombre=?, curso=?, nota1=?, nota2=?, nota3=? WHERE id=?";
    private static final String DELETE_QUERY = "DELETE FROM estudiante WHERE id=?";
    private static final String SELECT_BY_ID_QUERY = "SELECT * FROM estudiante WHERE id = ?";

    @Override
    public boolean registrarEstudiante(Estudiante estudiante) throws DAOException {
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(INSERT_QUERY)) {
            pstmt.setString(1, estudiante.getIdentificacion());
            pstmt.setString(2, estudiante.getNombre());
            pstmt.setString(3, estudiante.getCurso());
            pstmt.setDouble(4, estudiante.getNota1());
            pstmt.setDouble(5, estudiante.getNota2());
            pstmt.setDouble(6, estudiante.getNota3());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new DAOException("Error al registrar el estudiante", e);
        }
    }

    @Override
    public List<Estudiante> obtenerEstudiantes() throws DAOException {
        List<Estudiante> listaEstudiante = new ArrayList<>();

        try (Connection con = Conexion.conectar();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(SELECT_ALL_QUERY)) {
            while (rs.next()) {
                Estudiante estudiante = obtenerEstudianteDesdeResultSet(rs);
                listaEstudiante.add(estudiante);
            }
        } catch (SQLException e) {
            throw new DAOException("Error al obtener los estudiantes", e);
        }

        return listaEstudiante;
    }

    @Override
    public boolean actualizarEstudiante(Estudiante estudiante) throws DAOException {
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(UPDATE_QUERY)) {
            pstmt.setString(1, estudiante.getIdentificacion());
            pstmt.setString(2, estudiante.getNombre());
            pstmt.setString(3, estudiante.getCurso());
            pstmt.setDouble(4, estudiante.getNota1());
            pstmt.setDouble(5, estudiante.getNota2());
            pstmt.setDouble(6, estudiante.getNota3());
            pstmt.setInt(7, estudiante.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new DAOException("Error al actualizar el estudiante", e);
        }
    }

    @Override
    public boolean eliminarEstudiante(Estudiante estudiante) throws DAOException {
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(DELETE_QUERY)) {
            pstmt.setInt(1, estudiante.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new DAOException("Error al eliminar el estudiante", e);
        }
    }

    @Override
    public Estudiante obtenerEstudiantePorId(int id) throws DAOException {
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(SELECT_BY_ID_QUERY)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return obtenerEstudianteDesdeResultSet(rs);
                }
            }
        } catch (SQLException e) {
            throw new DAOException("Error al obtener el estudiante por ID", e);
        }
        return null;
    }

    private Estudiante obtenerEstudianteDesdeResultSet(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String identificacion = rs.getString("identificacion");
        String nombre = rs.getString("nombre");
        String curso = rs.getString("curso");
        double nota1 = rs.getDouble("nota1");
        double nota2 = rs.getDouble("nota2");
        double nota3 = rs.getDouble("nota3");
        return new Estudiante(id, identificacion, nombre, curso, nota1, nota2, nota3);
    }
    
    
}


