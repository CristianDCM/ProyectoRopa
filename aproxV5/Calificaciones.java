import java.util.Scanner;
public class Calificaciones{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Tienda miTienda = new Tienda("123456","Gucci Mane","Suba");
        String identificacion, nombre, genero;
        
        double promedio = 0;
        
        System.out.println("Digite el numero de clientes del Este: ");
        int numClientes1 = sc.nextInt();
        for(int i = 0; i < numClientes1; i++){
            double calificaciones1, calificaciones2;
            System.out.println("Digite la Identificacion del Cliente: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Cliente: ");
            nombre = sc.next();
            System.out.println("Digite el genero del Cliente: ");
            genero = sc.next();
            System.out.println("Digite primera nota del cliente: ");
            calificaciones1 = sc.nextDouble();
            System.out.println("Digite segunda nota del cliente: ");
            calificaciones2 = sc.nextDouble();            
            miTienda.adicionarClienteEste(identificacion, nombre, genero, promedio, numClientes1);
        }
                
        System.out.println("Digite el numero de clientes del Norte: ");
        int numClientes2 = sc.nextInt();
        for(int i = 0; i < numClientes2; i++){
            double calificaciones1, calificaciones2, nota3;
            System.out.println("Digite la Identificacion del Cliente: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Cliente: ");
            nombre = sc.next();
            System.out.println("Digite el genero del Cliente: ");
            genero = sc.next();
            System.out.println("Digite primera nota del cliente: ");
            calificaciones1 = sc.nextDouble();
            System.out.println("Digite segunda nota del cliente: ");
            calificaciones2 = sc.nextDouble();            
            System.out.println("Digite tercera nota del cliente: ");
            nota3 = sc.nextDouble();
            miTienda.adicionarClienteNorte(identificacion, nombre, genero, calificaciones1, calificaciones2, nota3);
        }
        
        System.out.println("Digite el numero de clientes del Sur:");
        int numClientes3 = sc.nextInt();
        for(int i = 0; i < numClientes3; i++){
            double calificaciones1, calificaciones2, nota3, nota4;            
            System.out.println("Digite la Identificacion del Cliente: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Cliente: ");
            nombre = sc.next();
            System.out.println("Digite el genero del Cliente: ");
            genero = sc.next();
            System.out.println("Digite primera nota del cliente: ");
            calificaciones1 = sc.nextDouble();
            System.out.println("Digite segunda nota del cliente: ");
            calificaciones2 = sc.nextDouble();            
            System.out.println("Digite tercera nota del cliente: ");
            nota3 = sc.nextDouble();
            System.out.println("Digite cuarta nota del cliente: ");
            nota4 = sc.nextDouble();            
            miTienda.adicionarClienteSur(identificacion, nombre, genero, calificaciones1, calificaciones2, nota3, nota4);
        }
        
        promedio = miTienda.calcularPromedioGeneral();
        System.out.println("\n El promedio de calificacion es: " + promedio); 
    }
}


