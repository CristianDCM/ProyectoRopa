public class ClienteSur{
    private final String identificacion;
    private String nombre;
    private String genero;
    private double calificacionuno;
    private double calificaciondos;
    private double calificaciontres;
    private double calificacioncuatro;
    
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
    public void setCalificaciondos(double calificaciondos){
        if(calificaciondos >= 0) this.calificaciondos = calificaciondos;
        else this.calificaciondos = 0;
    }
    
    public double getCalificaciontres(){
        return calificaciontres;
    }
    public void setCalificaciontres(double calificaciontres){
        if(calificaciontres >= 0) this.calificaciontres = calificaciontres;
        else this.calificaciontres = 0;
    }
    
    public double getCalificacioncuatro(){
        return calificacioncuatro;
    }
    public void setCalificacioncuatro(double calificacioncuatro){
        if(calificacioncuatro >= 0) this.calificacioncuatro = calificacioncuatro;
        else this.calificacioncuatro = 0;
    }
    
    ClienteSur(String identificacion, String nombre, String genero, double calificacionuno, double calificaciondos, double calificaciontres, double calificacioncuatro){
        if(identificacion != null) this.identificacion = identificacion;
        else this.identificacion = "";
        setNombre(nombre);
        setGenero(genero);
        setCalificacionuno(calificacionuno);
        setCalificaciondos(calificaciondos);
        setCalificaciontres(calificaciontres);
        setCalificacioncuatro(calificacioncuatro);        
    }
    
    double calcularPromedio(){
        return (calificacionuno + calificaciondos + calificaciontres + calificacioncuatro) / 4;
    }
}
