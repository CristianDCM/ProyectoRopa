public class Tienda {
    private final String nit;
    private String nombreTienda;
    private String direccion;
    private ClienteEste[] cliente1;
    private ClienteNorte[] cliente2;
    private ClienteSur[] cliente3;
    private int numClientes1;
    private int numClientes2;
    private int numClientes3;

    public Tienda(String nit, String nombreTienda, String direccion) {
        if (nit != null)
            this.nit = nit;
        else
            this.nit = "";
        setNombreTienda(nombreTienda);
        setDireccion(direccion);
        cliente1 = new ClienteEste[50];
        cliente2 = new ClienteNorte[50];
        cliente3 = new ClienteSur[50];
        numClientes1 = 0;
        numClientes2 = 0;
        numClientes3 = 0;
    }

    public String getNit() {
        return nit;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        if (nombreTienda != null) {
            this.nombreTienda = nombreTienda;
        } else {
            this.nombreTienda = "";
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion != null) {
            this.direccion = direccion;
        } else {
            this.direccion = "";
        }
    }

    public int getNumClientes1() {
        return numClientes1;
    }

    public int getNumClientes2() {
        return numClientes2;
    }

    public int getNumClientes3() {
        return numClientes3;
    }

    public double calcularPromedioGeneral() {
        double promedio = 0;
        for (int i = 0; i < numClientes1; i++) {
            promedio = promedio + cliente1[i].calcularPromedio() / numClientes1;
        }
        for (int i = 0; i < numClientes2; i++) {
            promedio = promedio + cliente2[i].calcularPromedio() / numClientes2;
        }
        for (int i = 0; i < numClientes3; i++) {
            promedio = promedio + cliente3[i].calcularPromedio() / numClientes3;
        }
        return promedio / 3;
    }

    public void adicionarClienteEste(String identificacion, String nombre, String genero, double calificacionuno,
            double calificaciondos) {
        cliente1[numClientes1] = new ClienteEste(identificacion, nombre, genero, calificacionuno, calificaciondos);
        numClientes1++;
    }

    public void adicionarClienteNorte(String identificacion, String nombre, String genero, double calificacionuno,
            double calificaciondos, double calificaciontres) {
        cliente2[numClientes2] = new ClienteNorte(identificacion, nombre, genero, calificacionuno, calificaciondos,
                calificaciontres);
        numClientes2++;
    }

    public void adicionarClienteSur(String identificacion, String nombre, String genero, double calificacionuno,
            double calificaciondos, double calificaciontres, double calificacioncuatro) {
        cliente3[numClientes3] = new ClienteSur(identificacion, nombre, genero, calificacionuno, calificaciondos,
                calificaciontres, calificacioncuatro);
        numClientes3++;
    }
}
