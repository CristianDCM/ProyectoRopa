import java.util.List;

public class VistaDatosCliente {
    public void verDatosCliente(ClienteRopa cliente) {
        System.out.println("Datos del Cliente:");
        System.out.println("ID Cliente: " + cliente.getIdCliente());
        System.out.println("Identificacion: " + cliente.getCedulaCliente());
        System.out.println("Nombre: " + cliente.getNombreCliente());
        System.out.println("Genero: " + cliente.getGeneroCliente());
        System.out.println("Calificacion de ropa Masculina: " + cliente.getCalificacionRopaMasculina());
        System.out.println("Calificacion de ropa Femenina: " + cliente.getCalificacionRopaFemenina());
        System.out.println("Calificacion de ropa Unisex: " + cliente.getCalificacionRopaUnisex());
        System.out.println("Promedio: " + cliente.promedioCliente()); //Promedio Individual
    }

    public void verDatosClientes(List<ClienteRopa> clientes) {
        System.out.println("Datos de los Clientes:");
        double promedioClientes = 0;
        for (ClienteRopa cliente : clientes) {
            verDatosCliente(cliente);
            promedioClientes += cliente.promedioCliente(); //Suma los promedios individuales
            System.out.println();
        }
        promedioClientes /= clientes.size(); //Divide la suma de los promedios individuales entre el tamaño de la lista de clientes
        
        System.out.println("Promedio General: " + promedioClientes);
    }
}