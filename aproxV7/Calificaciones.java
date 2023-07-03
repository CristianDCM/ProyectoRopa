import java.util.Scanner;
public class Calificaciones{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Tienda miTienda = new Tienda("123456","Guccy mane","EEUU");
        String identificacion, nombre, genero;
        double calificacion1, calificacion2, calificacion3, calificacion4;
        double promedio = 0;
        int opcionMenu = 0;
        
        do{
            System.out.println("\nMenu de Opciones");
            System.out.println("[1]- Adicionar Cliente Este: ");
            System.out.println("[2]- Adicopnar Cliente Norte: ");
            System.out.println("[3]- Adicionar Cliente Sur ");
            System.out.println("[4]- Calcular Promedio ");
            System.out.println("[5]- Salir \n");
            System.out.println("Escoja una Opcion: ");
            opcionMenu = sc.nextInt();
            switch(opcionMenu){
                case 1:
                        sc.nextLine();
                        System.out.println("Digite la Identificacion del Cliente: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del Cliente: ");
                        nombre = sc.next();
                        System.out.println("Digite el genero del Cliente: ");
                        genero = sc.next();
                        System.out.println("Digite calificacion 1 del cliente: ");
                        calificacion1 = sc.nextDouble();
                        System.out.println("Digite calificacion 2 del cliente: ");
                        calificacion2 = sc.nextDouble();
                        try{
                            miTienda.adicionarCliente(identificacion, nombre, genero, calificacion1, calificacion2);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 2:
                        sc.nextLine();
                        System.out.println("Digite la Identificacion del Cliente: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del Cliente: ");
                        nombre = sc.next();
                        System.out.println("Digite el genero del Cliente: ");
                        genero = sc.next();
                        System.out.println("Digite calificacion 1 del cliente: ");
                        calificacion1 = sc.nextDouble();
                        System.out.println("Digite calificacion 2 del cliente: ");
                        calificacion2 = sc.nextDouble();            
                        System.out.println("Digite calificacion 3 del cliente: ");
                        calificacion3 = sc.nextDouble();
                        try{                        
                        miTienda.adicionarCliente(identificacion, nombre, genero, calificacion1, calificacion2, calificacion3);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 3:
                        sc.nextLine();                        
                        System.out.println("Digite la Identificacion del Cliente: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del Cliente: ");
                        nombre = sc.next();
                        System.out.println("Digite el genero del Cliente: ");
                        genero = sc.next();
                        System.out.println("Digite calificacion 1 del cliente: ");
                        calificacion1 = sc.nextDouble();
                        System.out.println("Digite calificacion 2 del cliente: ");
                        calificacion2 = sc.nextDouble();            
                        System.out.println("Digite calificacion 3 del cliente: ");
                        calificacion3 = sc.nextDouble();
                        System.out.println("Digite calificacion 4 del cliente: ");
                        calificacion4 = sc.nextDouble();
                        try{                         
                        miTienda.adicionarCliente(identificacion, nombre, genero, calificacion1, calificacion2, calificacion3, calificacion4);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 4:
                        sc.nextLine();
                        promedio = miTienda.calcularPromedioGeneral();
                        System.out.println("El promedio de calificaciones es: " + promedio); 
                        break;
                default:
                        System.out.println("Ha Seleccionado Salir");
                        
            }
        }while(opcionMenu != 5);
    }
}
