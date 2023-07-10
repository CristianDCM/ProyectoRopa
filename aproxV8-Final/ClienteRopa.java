public class ClienteRopa {
    private int idCliente;
    private String cedulaCliente;
    private String nombreCliente;
    private String generoCliente;
    private double calificacionRopaMasculina;
    private double calificacionRopaFemenina;
    private double calificacionRopaUnisex;

    public ClienteRopa(int idCliente, String cedulaCliente, String nombreCliente, String generoCliente, double calificacionRopaMasculina, double calificacionRopaFemenina, double calificacionRopaUnisex) {
        this.idCliente = idCliente;
        this.cedulaCliente = cedulaCliente;
        this.nombreCliente = nombreCliente;
        this.generoCliente = generoCliente;
        this.calificacionRopaMasculina = calificacionRopaMasculina;
        this.calificacionRopaFemenina = calificacionRopaFemenina;
        this.calificacionRopaUnisex = calificacionRopaUnisex;
    }
    
    public ClienteRopa(String cedulaCliente, String nombreCliente, String generoCliente, double calificacionRopaMasculina, double calificacionRopaFemenina, double calificacionRopaUnisex) {
        this.cedulaCliente = cedulaCliente;
        this.nombreCliente = nombreCliente;
        this.generoCliente = generoCliente;
        this.calificacionRopaMasculina = calificacionRopaMasculina;
        this.calificacionRopaFemenina = calificacionRopaFemenina;
        this.calificacionRopaUnisex = calificacionRopaUnisex;
    }

    public double promedioCliente() {

        return (calificacionRopaMasculina + calificacionRopaFemenina + calificacionRopaUnisex) / 3;
    }

    public int getIdCliente() {
        return idCliente; 
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getGeneroCliente() {
        return generoCliente;
    }

    public double getCalificacionRopaMasculina() {
        return calificacionRopaMasculina;
    }

    public double getCalificacionRopaFemenina() {
        return calificacionRopaFemenina;
    }

    public double getCalificacionRopaUnisex() {
        return calificacionRopaUnisex;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdentificacion(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public void setNombre(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setGenero(String generoCliente) {
        this.generoCliente = generoCliente;
    }

    public void setcalifiCacionPrendasHombres(double calificacionRopaMasculina) {
        this.calificacionRopaMasculina = calificacionRopaMasculina;
    }

    public void setcalifiCacionPrendasFemeninas(double calificacionRopaFemenina) {
        this.calificacionRopaFemenina = calificacionRopaFemenina;
    }

    public void setcalifiCacionPrendasUnisex(double calificacionRopaUnisex) {
        this.calificacionRopaUnisex = calificacionRopaUnisex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID Cliente: ").append(idCliente)
          .append("\nCedula Identificacion: ").append(cedulaCliente)
          .append("\nNombre: ").append(nombreCliente)
          .append("\nGenero: ").append(generoCliente)
          .append("\nCalificacion Ropa Masculina: ").append(calificacionRopaMasculina)
          .append("\nCalificacion Ropa Femenina: ").append(calificacionRopaMasculina)
          .append("\nCalificacion Ropa Unisex: ").append(calificacionRopaUnisex);
        return sb.toString();
    }
}