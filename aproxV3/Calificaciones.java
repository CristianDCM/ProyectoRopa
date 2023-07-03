import java.util.Scanner;
public class Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numClientes;
        Cliente[] losClientes = new Cliente[50];
        String identificacion, nombre;
        String genero;
        double calificacion1, calificacion2, calificacion3;
        double promedio = 0;

        System.out.println("Digite la cantidad de clientes: ");
        numClientes = sc.nextInt();
        for (int i = 0; i < numClientes; i++) {
            System.out.println("Digite la identificacion del Cliente");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Cliente");
            nombre = sc.next();
            System.out.println("Digite la genero del Cliente");
            genero = sc.next();
            System.out.println("Digite la Calificacion 1 del cliente");
            calificacion1 = sc.nextDouble();
            System.out.println("Digite la Calificacion 2 del cliente");
            calificacion2 = sc.nextDouble();
            System.out.println("Digite la Calificacion 3 del cliente");
            calificacion3 = sc.nextDouble();
            Cliente unCliente = new Cliente(identificacion, nombre, genero, calificacion1, calificacion2,
                    calificacion3);
            losClientes[i] = unCliente;
        }
        for (int i = 0; i < numClientes; i++) {
            promedio = promedio + losClientes[i].calcularPromedio() / numClientes;
            System.out.println("El promedio de las calificaciones es: " + promedio);
        }
    }
}