public class Estudiante {
    private int id;
    private String identificacion;
    private String nombre;
    private String curso;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudiante(int id, String identificacion, String nombre, String curso, double nota1, double nota2, double nota3) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public Estudiante(String identificacion, String nombre, String curso, double nota1, double nota2, double nota3) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public int getId() {
        return id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id)
          .append("\nIdentificación: ").append(identificacion)
          .append("\nNombre: ").append(nombre)
          .append("\nCurso: ").append(curso)
          .append("\nNota 1: ").append(nota1)
          .append("\nNota 2: ").append(nota2)
          .append("\nNota 3: ").append(nota3);
        return sb.toString();
    }
}