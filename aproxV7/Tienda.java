import java.util.ArrayList;

public class Tienda
{
    private final String nit;
    private String nombreTienda;
    private String direccion;
    private ArrayList cliente;
    
    public Tienda(String nit,String nombreTienda,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreTienda(nombreTienda);
        setDireccion(direccion);        
        cliente = cliente = new ArrayList();
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreTienda(){
        return nombreTienda;
    }
    public void setNombreTienda(String nombreTienda){
        if(nombreTienda != null){
            this.nombreTienda = nombreTienda;
        }else{
            this.nombreTienda = "";
        }        
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
        
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < cliente.size(); i++){
            promedio += ((Cliente)cliente.get(i)).calcularPromedio();
        }

        return promedio / 3;
    }
    
    public void adicionarCliente(String identificacion, String nombre, String genero, double calificacionuno, double calificaciondos)throws Exception{
        cliente.add(new ClienteEste(identificacion, nombre, genero, calificacionuno, calificaciondos));
    }
    
    public void adicionarCliente(String identificacion, String nombre, String genero, double calificacionuno, double calificaciondos, double calificaciontres)throws Exception{
        cliente.add(new ClienteNorte(identificacion, nombre, genero, calificacionuno, calificaciondos, calificaciontres));
    }
    
    public void adicionarCliente(String identificacion, String nombre, String genero, double calificacionuno, double calificaciondos, double calificaciontres, double calificacioncuatro)throws Exception{
        cliente.add(new ClienteSur(identificacion, nombre, genero, calificacionuno, calificaciondos, calificaciontres, calificacioncuatro));
    }
}    
