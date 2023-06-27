public class ClienteEste{
    private final  String identificacion;
    private String nombre;
    private String genero;
    private double calificacionuno;
    private double calificaciondos;
    
    public String getIdentificacion(){
        return identificacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
    
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        if(genero != null) this.genero = genero;
        else this.genero = "";
    }
    
    public double getCalificacionuno(){
        return calificacionuno;
    }
    public void setCalificacionuno(double calificacionuno){
        if(calificacionuno >= 0) this.calificacionuno = calificacionuno;
        else this.calificacionuno = 0;
    }
    
    public double getCalificaciondos(){
        return calificaciondos;
    }
    public void setNotados(double calificaciondos){
        if(calificaciondos >= 0) this.calificaciondos = calificaciondos;
        else this.calificaciondos = 0;
    }
    
    ClienteEste(String identificacion, String nombre, String genero, double calificacionuno, double calificaciondos){
        if(identificacion != null) this.identificacion = identificacion;
        else this.identificacion = "";
        setNombre(nombre);
        setGenero(genero);
        setCalificacionuno(calificacionuno);
        setNotados(calificaciondos);
    }
    
    double calcularPromedio(){
        return (calificacionuno + calificaciondos) / 2;
    }
}
