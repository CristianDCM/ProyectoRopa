
public class Cliente
{

    protected final String identificacion;
    private String nombre;
    private String genero;

    public Cliente(String identificacion, String nombre, String genero){
        if(identificacion!=null) this.identificacion = identificacion;
        else this.identificacion = "";
        setNombre(nombre);
        setGenero(genero);
    }

    double calcularPromedio(){
        return 0;
    }

    public String getIdentificacion(){
        return identificacion;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if (nombre!=null) this.nombre = nombre;
        else this.nombre = "";
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        if(genero!=null)this.genero = genero;
        else this.genero = "";
    }

}
