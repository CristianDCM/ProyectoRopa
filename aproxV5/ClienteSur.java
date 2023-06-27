public class ClienteSur{
    private final String identificacion;
    private String nombre;
    private String genero;
    private double calificacionUno;
    private double calificacionDos;
    private double calificacionTres;
    private double calificacionCuatro;
    
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
    public void setCurso(String genero){
        if(genero != null) this.genero = genero;
        else this.genero = "";
    }
    
    public double getCalificacionuno(){
        return calificacionUno;
    }
    public void setCalificacionuno(double calificacionUno){
        if(calificacionUno >= 0) this.calificacionUno = calificacionUno;
        else this.calificacionUno = 0;
    }
    
    public double getCalificaciondos(){
        return calificacionDos;
    }
    public void setCalificaciondos(double calificacionDos){
        if(calificacionDos >= 0) this.calificacionDos = calificacionDos;
        else this.calificacionDos = 0;
    }
    
    public double getCalificaciontres(){
        return calificacionTres;
    }
    public void setCalificaciontres(double calificacionTres){
        if(calificacionTres >= 0) this.calificacionTres = calificacionTres;
        else this.calificacionTres = 0;
    }

    public double getCalificacioncuatro(){
        return calificacionCuatro;
    }
    public void setCalificacioncuatro(double calificacionCuatro){
        if(calificacionCuatro >= 0) this.calificacionCuatro = calificacionCuatro;
        else this.calificacionCuatro = 0;
    }
    
    ClienteSur(String identificacion, String nombre, String genero, double calificacionUno, double calificacionDos, double calificacionTres, double calificacionCuatro){
        if(identificacion != null) this.identificacion = identificacion;
        else this.identificacion = "";
        setNombre(nombre);
        setCurso(genero);
        setCalificacionuno(calificacionUno);
        setCalificaciondos(calificacionDos);
        setCalificaciontres(calificacionTres);
        setCalificacioncuatro(calificacionCuatro);
    }
    
    double calcularPromedio(){
        return (calificacionUno + calificacionDos + calificacionTres + calificacionCuatro) / 3;
    }
}


