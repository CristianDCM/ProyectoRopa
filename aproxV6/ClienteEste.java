public class ClienteEste extends Cliente {
    private double calificacionuno;
    private double calificaciondos;

    ClienteEste(String identificacion, String nombre, String genero, double calificacionuno, double calificaciondos) {
        super(identificacion, nombre, genero);
        setcalificacionuno(calificacionuno);
        setcalificaciondos(calificaciondos);
    }

    double calcularPromedio() {
        return (calificacionuno + calificaciondos) / 2;
    }

    public double getcalificacionuno() {
        return calificacionuno;
    }

    public void setcalificacionuno(double calificacionuno) {
        if (calificacionuno >= 0)
            this.calificacionuno = calificacionuno;
        else
            this.calificacionuno = 0;
    }

    public double getcalificaciondos() {
        return calificaciondos;
    }

    public void setcalificaciondos(double calificaciondos) {
        if (calificaciondos >= 0)
            this.calificaciondos = calificaciondos;
        else
            this.calificaciondos = 0;
    }
}
