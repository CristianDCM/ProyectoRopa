import java.text.Normalizer;
import java.util.Scanner;

public class Clasificaciones
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Tienda miTienda = new Tienda("","","");
        String identificacion, nombre, genero;
        double promedio = 0;

        System.out.println("Digite la camtidad de clientes del Norte: ");
        int numeroClientes1 = sc.nextInt();

        for(int i = 0; i < numeroClientes1; i++){
            double clasificacion1, clasificacion2, clasificacion3;
            System.out.println("Digite la identificacion del Cliente");
            identificacion = sc.nextLine();
            System.out.println("Digite el nombre del cliente:");
            nombre = sc.nextLine();
            System.out.println("Digite el generon del estudiante: ");
            genero = sc.nextLine();
            System.out.println("Digite la clasificacion 1 del Cliente:");
            clasificacion1 = sc.nextInt();
            System.out.println("Digite la clasificacion 2 del Cliente:");
            clasificacion2 = sc.nextInt();
            System.out.println("Digite la clasificacion 3 del Cliente:");
            clasificacion3 = sc.nextInt();
            miTienda.adiccionarClienteNorte(identificacion, nombre, genero, clasificacion1, clasificacion2 , clasificacion3);
        }

    }
}
