import java.util.Scanner;
public class Tienda
{
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        double promedio = 0;
        String[] identificaciones = new String[10], nombres = new String[10];
        int[] generos = new int[10];
        double[] calificacion1 = new double[10];
        double[] calificacion2 = new double[10];
        double[] calificacion3 = new double[10];
        System.out.println("Digite el numero de Clientes encuestados: ");
        int nClientes = sc.nextInt();
        for (int i = 0; i < nClientes; i++)
        {
            System.out.println("Digite la identificacion del cliente: ");
            String idCliente = sc.nextLine();
            System.out.println("Digite el nombre del cliente: ");
            String nombreCliente = sc.nextLine();
            System.out.println("Digite la edad del cliente: ");
            int generoCliente = sc.nextInt();
            System.out.println("Digite la calificacion 1 del cliente " + nombreCliente + ": ");
            double calificacionUno = sc.nextInt();
            System.out.println("Digite la calificacion 2 del cliente " + nombreCliente + ": ");
            double calificacionDos = sc.nextInt();
            System.out.println("Digite la calificacion 3 del cliente " + nombreCliente + ": ");
            double calificacionTres = sc.nextInt();
            identificaciones[i] = idCliente;
            nombres[i] = nombreCliente;
            generos[i] = generoCliente;
            calificacion1[i] = calificacionUno;
            calificacion2[i] = calificacionDos;
            calificacion3[i] = calificacionTres;
        }
        for (int i = 0; i < nClientes; i++)
        {
            promedio = promedio + ((calificacion1[i] + calificacion2[i] + calificacion3[i]) / 3) / nClientes;
        }
        System.out.println("El promedio de calificacion de los clientes es: " + promedio);
    }
}