import java.util.List;

public class ViewCliente {
    public void verCliente(Cliente cliente) {
        System.out.println("Datos del Cliente:");
        System.out.println("ID: " + cliente.getId());
        System.out.println("Identificación: " + cliente.getIdentificacion());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Genero: " + cliente.getGenero());
        System.out.println("Calificacion de prendas Masculinas: " + cliente.getCalificacionPrendasMasculinas());
        System.out.println("Calificacion de prendas Femeninas: " + cliente.getCalificacionPrendasFemeninas());
        System.out.println("Calificacion de prendas Unisex: " + cliente.getCalificacionPrendasUnisex());
        System.out.println("Promedio: " + cliente.promedioI()); //Promedio Individual
    }

    public void verClientes(List<Cliente> clientes) {
        System.out.println("Datos de los Clientes:");
        double promedio = 0;
        for (Cliente cliente : clientes) {
            verCliente(cliente);
            promedio += cliente.promedioI(); //Suma los promedios individuales
            System.out.println();
        }
        promedio /= clientes.size(); //Divide la suma de los promedios individuales entre el tamaño de la lista de clientes
        System.out.println("Promedio General: " + promedio);
    }
}