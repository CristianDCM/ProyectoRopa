import java.util.List;

public class ViewEstudiante {

    public void verEstudiante(Estudiante estudiante) {
        System.out.println("Datos del Estudiante:");
        System.out.println("ID: " + estudiante.getId());
        System.out.println("Identificación: " + estudiante.getIdentificacion());
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Curso: " + estudiante.getCurso());
        System.out.println("Nota 1: " + estudiante.getNota1());
        System.out.println("Nota 2: " + estudiante.getNota2());
        System.out.println("Nota 3: " + estudiante.getNota3());
    }

    public void verEstudiantes(List<Estudiante> estudiantes) {
        System.out.println("Datos de los Estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            verEstudiante(estudiante);
            System.out.println();
        }
    }
}
