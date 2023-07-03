import java.util.Scanner;
public class Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroClientes;
        Cliente[] losClientes = new Cliente[50];
        String identificacion, nombre;
        int genero;
        double calificacion1, calificacion2, calificacion3;
        double promedio = 0;

        System.out.println("Digite la cantidad de clientes: ");
        numeroClientes = sc.nextInt();
        for (int i = 0; i < numeroClientes; i++) {
            System.out.println("Digite la identificacion del Cliente");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Cliente");
            nombre = sc.next();
            System.out.println("Digite el genero del Cliente");
            genero = sc.nextInt();
            System.out.println("Digita la Calificacion 1 del cliente");
            calificacion1 = sc.nextDouble();
            System.out.println("Digita la Calificacion 2 del cliente");
            calificacion2 = sc.nextDouble();
            System.out.println("Digita la Calificacion 3 del cliente");
            calificacion3 = sc.nextDouble();
            Cliente unCliente = new Cliente();
            unCliente.identificacion = identificacion;
            unCliente.nombre = nombre;
            unCliente.genero = genero;
            unCliente.calificacionUno = calificacion1;
            unCliente.calificacionDos = calificacion2;
            unCliente.calificacionTres = calificacion3;
            losClientes[i] = unCliente;
        }
        for (int i = 0; i < numeroClientes; i++) {
            double sum = (losClientes[i].calificacionUno + losClientes[i].calificacionDos
                    + losClientes[i].calificacionTres) / 3;
            promedio = promedio + sum / numeroClientes;
        }
        System.out.println("El promedio de la nota es:" + promedio);
    }
}