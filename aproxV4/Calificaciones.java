import java.util.Scanner;
public class Calificaciones{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numClientes;
        Tienda miTienda = new Tienda("123456","Gucci Mane","Suba");
        String identificacion, nombre, genero;
        double calificacion1, calificacion2, calificacion3;
        double promedio = 0;
        
        System.out.println("Digite el numero de clientes: ");
        numClientes = sc.nextInt();

        for(int i = 0; i < numClientes; i++){
            System.out.println("Digite la identificacion del Cliente: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Cliente: ");
            nombre = sc.next();
            System.out.println("Digite el genero del Cliente: ");
            genero = sc.next();
            System.out.println("Digite la calificacion 1 del cliente: ");
            calificacion1 = sc.nextDouble();
            System.out.println("Digite la calificacion 2 del cliente: ");
            calificacion2 = sc.nextDouble();            
            System.out.println("Digite la calificacion 3 del cliente: ");
            calificacion3 = sc.nextDouble();
            miTienda.adicionarCliente(identificacion, nombre, genero, calificacion1, calificacion2, calificacion3);
        }
        promedio = miTienda.calcularPromedioGeneral();        
        System.out.println("\n El promedio de calificacion es: " + promedio); 
    }
}
