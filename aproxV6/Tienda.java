public class Tienda {
    private final String nit;
    private String nombreTienda;
    private String direccion;
    private Cliente[] cliente;
    private int numeroClientes;

    public Tienda(String nit, String nombre, String direccion) {
        if (nit != null)
            this.nit = nit;
        else
            this.nit = "";
        setNombreTienda(nombreTienda);
        setDireccion(direccion);
        cliente = new Cliente[10];
        numeroClientes = 0;
    }

    public String getNit() {
        return nit;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        if (nombreTienda != null)
            this.nombreTienda = nombreTienda;
        else
            this.nombreTienda = "";
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion != null)
            this.direccion = direccion;
        else
            this.direccion = "";
    }

    public double calcularPromedioGeneral() {
        double promedio = 0;
        for (int i = 0; i < numeroClientes; i++)
            promedio = promedio + cliente[i].calcularPromedio();
        return promedio / 3;
    }

    public void adicionarClienteEste(String identificacion, String nombre, String genero, double calificacionuno,
            double calificaciondos) {
        cliente[numeroClientes] = new ClienteEste(identificacion, nombre, genero, calificacionuno, calificaciondos);
        numeroClientes++;
    }

    public void adicionarClienteNorte(String identificacion, String nombre, String genero, double calificacionuno,
            double calificaciondos, double calificaciontres) {
        cliente[numeroClientes] = new ClienteNorte(identificacion, nombre, genero, calificacionuno, calificaciondos,
                calificaciontres);
        numeroClientes++;
    }

    public void adicionarClienteSur(String identificacion, String nombre, String genero, double calificacionuno,
            double calificaciondos, double calificaciontres, double calificacioncuatro) {
        cliente[numeroClientes] = new ClienteSur(identificacion, nombre, genero, calificacionuno, calificaciondos,
                calificaciontres, calificacioncuatro);
        numeroClientes++;
    }
}
