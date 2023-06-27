
public class ClienteNorte extends Cliente {
    private double clasificacionuno;
    private double clasificaciondos;
    private double clasificaciontres;

    ClienteNorte(String identificacion, String nombre, String curso, double notauno, double notados, double notatres) {
        super(identificacion, nombre, curso);
        setClasificacionuno(clasificacionuno);
        setClasificaciondos(clasificaciondos);
        setClasificaciontres(clasificaciontres);
    }

    double calcularPromedio() {
        return (clasificacionuno + clasificaciondos) / 2;

    }

    public double getClasificacionuno() {
        return clasificacionuno;
    }

    public void setClasificacionuno(double clasificacionuno) {
        if (clasificacionuno >= 0)
            this.clasificacionuno = clasificacionuno;
        else
            this.clasificacionuno = 0;
    }

    public double getClasificaciondos() {
        return clasificaciondos;
    }

    public void setClasificaciondos(double clasificaciondos) {
        if (clasificaciondos >= 0)
            this.clasificaciondos = clasificaciondos;
        else
            this.clasificaciondos = 0;

    }

    public double getClasificaciontres() {
        return clasificaciondos;
    }

    public void setClasificaciontres(double clasificaciontres) {
        if (clasificaciondos >= 0)
            this.clasificaciontres = clasificaciontres;
        else
            this.clasificaciontres = 0;

    }
}
