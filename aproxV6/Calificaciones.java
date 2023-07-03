import java.util.Scanner;

public class Calificaciones{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Tienda miTienda = new Tienda("","","");
        String identificacion, nombre, genero;
        double promedio = 0;

        System.out.println("Digite la cantidad de clientes del Este: ");
        int numeroClientes1 = sc.nextInt();

        for(int i = 0; i < numeroClientes1; i++){
            double calificacion1, calificacion2;
            System.out.println("Digite la identificacion del Cliente");
            identificacion = sc.nextLine();
            System.out.println("Digite el nombre del cliente:");
            nombre = sc.nextLine();
            System.out.println("Digite el genero del cliente: ");
            genero = sc.nextLine();
            System.out.println("Digite la calificacion 1 del Cliente:");
            calificacion1 = sc.nextInt();
            System.out.println("Digite la calificacion 2 del Cliente:");
            calificacion2 = sc.nextInt();
            miTienda.adicionarClienteEste(identificacion, nombre, genero, calificacion1, calificacion2);
        }

        System.out.println("Digite la cantidad de clientes del Norte: ");
        int numeroClientes2 = sc.nextInt();
        for (int i = 0; i < numeroClientes2; i++) {
            double calificacion1, calificacion2, calificacion3;
            System.out.println("Digite la identificacion del Cliente");
            identificacion = sc.nextLine();
            System.out.println("Digite el nombre del cliente:");
            nombre = sc.nextLine();
            System.out.println("Digite el genero del cliente: ");
            genero = sc.nextLine();
            System.out.println("Digite la calificacion 1 del Cliente:");
            calificacion1 = sc.nextInt();
            System.out.println("Digite la calificacion 2 del Cliente:");
            calificacion2 = sc.nextInt();
            System.out.println("Digite la calificacion 3 del Cliente:");
            calificacion3 = sc.nextInt();
            miTienda.adicionarClienteNorte(identificacion, nombre, genero, calificacion1, calificacion2,
                    calificacion3);
        }

        System.out.println("Digite la cantidad de clientes del Sur: ");
        int numeroClientes3 = sc.nextInt();
        for (int i = 0; i < numeroClientes3; i++) {
            double calificacion1, calificacion2, calificacion3, calificacion4;
            System.out.println("Digite la identificacion del Cliente");
            identificacion = sc.nextLine();
            System.out.println("Digite el nombre del cliente:");
            nombre = sc.nextLine();
            System.out.println("Digite el genero del cliente: ");
            genero = sc.nextLine();
            System.out.println("Digite la calificacion 1 del Cliente:");
            calificacion1 = sc.nextInt();
            System.out.println("Digite la calificacion 2 del Cliente:");
            calificacion2 = sc.nextInt();
            System.out.println("Digite la calificacion 3 del Cliente:");
            calificacion3 = sc.nextInt();
            System.out.println("Digite la calificacion 4 del Cliente:");
            calificacion4 = sc.nextInt();
            miTienda.adicionarClienteSur(identificacion, nombre, genero, calificacion1, calificacion2,
                    calificacion3, calificacion4);
        }
        promedio = miTienda.calcularPromedioGeneral();
        System.out.println("El promedio de calificacion es: " + promedio);
    }
}
