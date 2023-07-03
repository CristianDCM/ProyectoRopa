public class ClienteNorte extends Cliente {
    private double calificacionuno;
    private double calificaciondos;
    private double calificaciontres;

    ClienteNorte(String identificacion, String nombre, String genero, double calificacionuno, double calificaciondos, double calificaciontres) {
        super(identificacion, nombre, genero);
        setCalificacionuno(calificacionuno);
        setCalificaciondos(calificaciondos);
        setCalificaciontres(calificaciontres);
    }

    double calcularPromedio() {
        return (calificacionuno + calificaciondos) / 2;

    }

    public double getCalificacionuno() {
        return calificacionuno;
    }

    public void setCalificacionuno(double calificacionuno) {
        if (calificacionuno >= 0)
            this.calificacionuno = calificacionuno;
        else
            this.calificacionuno = 0;
    }

    public double getCalificaciondos() {
        return calificaciondos;
    }

    public void setCalificaciondos(double calificaciondos) {
        if (calificaciondos >= 0)
            this.calificaciondos = calificaciondos;
        else
            this.calificaciondos = 0;
    }

    public double getCalificaciontres() {
        return calificaciontres;
    }

    public void setCalificaciontres(double calificaciontres) {
        if (calificaciondos >= 0)
            this.calificaciontres = calificaciontres;
        else
            this.calificaciontres = 0;
    }
}
