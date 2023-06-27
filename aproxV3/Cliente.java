public class Cliente
{
    private String identificacion;
    private String nombre;
    private String genero;
    private double calificacionUno;
    private double calificacionDos;
    private double calificacionTres;
    
    public String getIdentificacion(){
        return identificacion;
    }
    public void setIdentificacion(String identificacion){
        if(identificacion != null)this.identificacion = identificacion;
        else this.identificacion = "";
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
    
    public String getgenero(){
        return genero;
    }
    public void setgenero(String genero){
        if(genero != null) this.genero = genero;
        else this.genero = "";
    }
    
    public double getcalificacionUno(){
        return calificacionUno;
    }
    public void setcalificacionUno(double calificacionUno){
        if(calificacionUno >= 0) this.calificacionUno = calificacionUno;
        else this.calificacionUno = 0;
    }
    
    public double getcalificacionDos(){
        return calificacionDos;
    }
    public void setcalificacionDos(double calificacionDos){
        if(calificacionDos >= 0) this.calificacionDos = calificacionDos;
        else this.calificacionDos = 0;
    }
    
    public double getcalificacionTres(){
        return calificacionTres;
    }
    public void setcalificacionTres(double calificacionTres){
        if(calificacionTres >= 0) this.calificacionTres = calificacionTres;
        else this.calificacionTres = 0;
    }
    
    Cliente(String identificacion, String nombre, String genero, double calificacionUno, double calificacionDos, double calificacionTres){
        setIdentificacion(identificacion);
        setNombre(nombre);
        setgenero(genero);
        setcalificacionUno(calificacionUno);
        setcalificacionDos(calificacionDos);
        setcalificacionTres(calificacionTres);
    }
    
    double calcularPromedio(){
        return (calificacionUno + calificacionDos + calificacionTres) / 3;
    }
}
