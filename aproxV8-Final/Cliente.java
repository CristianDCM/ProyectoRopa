public class Cliente {
    private int id;
    private String identificacion;
    private String nombre;
    private String genero;
    private double calificacionPrendasMasculinas;
    private double calificacionPrendasFemeninas;
    private double calificacionPrendasUnisex;

    public Cliente(int id, String identificacion, String nombre, String genero, double calificacionPrendasMasculinas, double calificacionPrendasFemeninas, double calificacionPrendasUnisex) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.genero = genero;
        this.calificacionPrendasMasculinas = calificacionPrendasMasculinas;
        this.calificacionPrendasFemeninas = calificacionPrendasFemeninas;
        this.calificacionPrendasUnisex = calificacionPrendasUnisex;
    }
    
    public Cliente(String identificacion, String nombre, String genero, double calificacionPrendasMasculinas, double calificacionPrendasFemeninas, double calificacionPrendasUnisex) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.genero = genero;
        this.calificacionPrendasMasculinas = calificacionPrendasMasculinas;
        this.calificacionPrendasFemeninas = calificacionPrendasFemeninas;
        this.calificacionPrendasUnisex = calificacionPrendasUnisex;
    }

    public double promedioI() {
        return (calificacionPrendasMasculinas + calificacionPrendasFemeninas + calificacionPrendasUnisex) / 3;
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

    public double getCalificacionPrendasMasculinas() {
        return calificacionPrendasMasculinas;
    }

    public double getCalificacionPrendasFemeninas() {
        return calificacionPrendasFemeninas;
    }

    public double getCalificacionPrendasUnisex() {
        return calificacionPrendasUnisex;
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

    public void setcalifiCacionPrendasHombres(double calificacionPrendasMasculinas) {
        this.calificacionPrendasMasculinas = calificacionPrendasMasculinas;
    }

    public void setcalifiCacionPrendasFemeninas(double calificacionPrendasFemeninas) {
        this.calificacionPrendasFemeninas = calificacionPrendasFemeninas;
    }

    public void setcalifiCacionPrendasUnisex(double calificacionPrendasUnisex) {
        this.calificacionPrendasUnisex = calificacionPrendasUnisex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id)
          .append("\nIdentificación: ").append(identificacion)
          .append("\nNombre: ").append(nombre)
          .append("\nGenero: ").append(genero)
          .append("\nCalificacion Prendas Masculinas: ").append(calificacionPrendasMasculinas)
          .append("\nCalificacion Prendas Femeninas: ").append(calificacionPrendasMasculinas)
          .append("\nCalificacion Prendas Unisex: ").append(calificacionPrendasUnisex);
        return sb.toString();
    }
}