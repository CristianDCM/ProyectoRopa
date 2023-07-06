public class Cliente {
    private int id;
    private String identificacion;
    private String nombre;
    private String genero;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;

    public Cliente(int id, String identificacion, String nombre, String genero, double calificacion1, double calificacion2, double calificacion3) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.genero = genero;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }
    
    public Cliente(String identificacion, String nombre, String genero, double calificacion1, double calificacion2, double calificacion3) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.genero = genero;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }

    public double promedioI() {
        return (calificacion1 + calificacion2 + calificacion3) / 3;
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

    public String getGenero() {
        return genero;
    }

    public double getCalificacion1() {
        return calificacion1;
    }

    public double getCalificacion2() {
        return calificacion2;
    }

    public double getCalificacion3() {
        return calificacion3;
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

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCalificacion1(double calificacion1) {
        this.calificacion1 = calificacion1;
    }

    public void setCalificacion2(double calificacion2) {
        this.calificacion2 = calificacion2;
    }

    public void setCalificacion3(double calificacion3) {
        this.calificacion3 = calificacion3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id)
          .append("\nIdentificación: ").append(identificacion)
          .append("\nNombre: ").append(nombre)
          .append("\nGenero: ").append(genero)
          .append("\nCalificacion 1: ").append(calificacion1)
          .append("\nCalificacion 2: ").append(calificacion2)
          .append("\nCalificacion 3: ").append(calificacion3);
        return sb.toString();
    }
}