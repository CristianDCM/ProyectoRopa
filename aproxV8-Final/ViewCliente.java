import java.util.List;

public class ViewCliente {
    public void verCliente(Cliente cliente) {
        System.out.println("Datos del Cliente:");
        System.out.println("ID: " + cliente.getId());
        System.out.println("Identificación: " + cliente.getIdentificacion());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Genero: " + cliente.getGenero());
        System.out.println("Calificacion 1: " + cliente.getCalificacion1());
        System.out.println("Calificacion 2: " + cliente.getCalificacion2());
        System.out.println("Calificacion 3: " + cliente.getCalificacion3());
        System.out.println("Promedio: " + cliente.promedioI()); //Promedio Individual
    }

    public void verClientes(List<Cliente> clientes) {
        System.out.println("Datos de los Clientes:");
        for (Cliente cliente : clientes) {
            verCliente(cliente);
            System.out.println();
        }
        //Promedio General
        double promedio = 0;
        for (Cliente cliente : clientes) { //Recorre la lista de clientes
            promedio += cliente.promedioI(); //Suma los promedios individuales
        }
        promedio /= clientes.size(); //Divide la suma de los promedios individuales entre el tamaño de la lista de clientes
        System.out.println("Promedio General: " + promedio);
    }
}