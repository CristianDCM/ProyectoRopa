public class ClienteEste extends Cliente{
    private double calificacionuno;
    private double calificaciondos;
    
    ClienteEste(String identificacion, String nombre, String genero, double calificacionuno, double calificaciondos)throws Exception{
        super(identificacion, nombre, genero);
        setNotauno(calificacionuno);
        setNotados(calificaciondos);
    }

    public double calcularPromedio(){
        return (calificacionuno + calificaciondos) / 2;
    }
    
    public double getNotauno(){
        return calificacionuno;
    }
    public void setNotauno(double calificacionuno){
        if(calificacionuno >= 0) this.calificacionuno = calificacionuno;
        else this.calificacionuno = 0;
    }
    
    public double getNotados(){
        return calificaciondos;
    }
    public void setNotados(double calificaciondos){
        if(calificaciondos >= 0) this.calificaciondos = calificaciondos;
        else this.calificaciondos = 0;
    }
}