import java.util.Scanner;

public class Clasificaciones
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Tienda miTienda = new Tienda("","","");
        String identificacion, nombre, genero;
        double promedio = 0;

        System.out.println("Digite la cantidad de clientes del Este: ");
        int numeroClientes1 = sc.nextInt();

        for(int i = 0; i < numeroClientes1; i++){
            double clasificacion1, clasificacion2;
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
            miTienda.adiccionarClienteEste(identificacion, nombre, genero, clasificacion1, clasificacion2);
        }

        System.out.println("Digite la cantidad de clientes del Norte: ");
        int numeroClientes2 = sc.nextInt();
        for (int i = 0; i < numeroClientes2; i++) {
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
            miTienda.adiccionarClienteNorte(identificacion, nombre, genero, clasificacion1, clasificacion2,
                    clasificacion3);
        }

        System.out.println("Digite la cantidad de clientes del Sur: ");
        int numeroClientes3 = sc.nextInt();
        for (int i = 0; i < numeroClientes3; i++) {
            double clasificacion1, clasificacion2, clasificacion3, clasificacion4;
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
            System.out.println("Digite la clasificacion 4 del Cliente:");
            clasificacion4 = sc.nextInt();
            miTienda.adiccionarClienteSur(identificacion, nombre, genero, clasificacion1, clasificacion2,
                    clasificacion3, clasificacion4);
        }
    }
}
