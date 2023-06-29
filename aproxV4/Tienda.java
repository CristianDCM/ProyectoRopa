public class Tienda
{
    private final String nit;
    private String nombreTienda;
    private String direccion;
    private Cliente[] cliente;
    private int numClientes;
    
    public Tienda(String nit,String nombreTienda,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreTienda(nombreTienda);
        setDireccion(direccion);        
        cliente = new Cliente[50];
        numClientes = 0;
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
    
    public int getNumClientes(){
        return numClientes;
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numClientes; i++){
            promedio = promedio + cliente[i].calcularPromedio() / numClientes;
        }
        return promedio;
    }
    
    public void adicionarCliente(String identificacion, String nombre, String genero, double notauno, double notados, double notatres){
        Cliente e = new Cliente(identificacion, nombre, genero, notauno, notados, notatres);
        cliente[numClientes] = e;
        numClientes++;
    }
}   