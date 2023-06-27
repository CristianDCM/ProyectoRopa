import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroClientes;
        Cliente[] losClientes = new Cliente[50];
        String identificacion, nombre;
        int edad;
        double calificacion1, calificacion2, calificacion3;
        double promedio = 0;

        System.out.println("Digita la cantidad de clientes: ");
        numeroClientes = sc.nextInt();
        for (int i = 0; i < numeroClientes; i++) {
            System.out.println("Digite la identificacion del Cliente");
            identificacion = sc.next();
            System.out.println("Digita el nombre del Cliente");
            nombre = sc.next();
            System.out.println("Digita la edad del Cliente");
            edad = sc.nextInt();
            System.out.println("Digita la Calificacion uno del estudiante");
            calificacion1 = sc.nextDouble();
            System.out.println("Digita la Calificacion dos del estudiante");
            calificacion2 = sc.nextDouble();
            System.out.println("Digita la Calificacion tres del estudiante");
            calificacion3 = sc.nextDouble();
            Cliente unCliente = new Cliente();
            unCliente.identificacion = identificacion;
            unCliente.nombre = nombre;
            unCliente.edad = edad;
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