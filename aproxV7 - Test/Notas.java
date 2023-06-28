import java.util.Scanner;
public class Notas{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Colegio miColegio = new Colegio("123456","IED GonzaloArango","Suba");
        String identificacion, nombre, curso;
        double nota1, nota2, nota3, nota4;
        double promedio = 0;
        int opcionMenu = 0;
        
        do{
            System.out.println("\nMenu de Opciones");
            System.out.println("[1]- Adicionar Estudiante de Jardin: ");
            System.out.println("[2]- Adicopnar Estudiante de Colegio: ");
            System.out.println("[3]- Adicionar Estudiante de Tecnico ");
            System.out.println("[4]- Calcular Promedio ");
            System.out.println("[5]- Salir \n");
            System.out.println("Escoja una Opcion: ");
            opcionMenu = sc.nextInt();
            switch(opcionMenu){
                case 1:
                        sc.nextLine();
                        System.out.println("Digite la Identificacion del Estudiante: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del Estudiante: ");
                        nombre = sc.next();
                        System.out.println("Digite el curso del Estudiante: ");
                        curso = sc.next();
                        System.out.println("Digite primera nota del estudiante: ");
                        nota1 = sc.nextDouble();
                        System.out.println("Digite segunda nota del estudiante: ");
                        nota2 = sc.nextDouble();
                        try{
                            miColegio.adicionarEstudiante(identificacion, nombre, curso, nota1, nota2);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 2:
                        sc.nextLine();
                        System.out.println("Digite la Identificacion del Estudiante: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del Estudiante: ");
                        nombre = sc.next();
                        System.out.println("Digite el curso del Estudiante: ");
                        curso = sc.next();
                        System.out.println("Digite primera nota del estudiante: ");
                        nota1 = sc.nextDouble();
                        System.out.println("Digite segunda nota del estudiante: ");
                        nota2 = sc.nextDouble();            
                        System.out.println("Digite tercera nota del estudiante: ");
                        nota3 = sc.nextDouble();
                        try{                        
                        miColegio.adicionarEstudiante(identificacion, nombre, curso, nota1, nota2, nota3);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 3:
                        sc.nextLine();                        
                        System.out.println("Digite la Identificacion del Estudiante: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del Estudiante: ");
                        nombre = sc.next();
                        System.out.println("Digite el curso del Estudiante: ");
                        curso = sc.next();
                        System.out.println("Digite primera nota del estudiante: ");
                        nota1 = sc.nextDouble();
                        System.out.println("Digite segunda nota del estudiante: ");
                        nota2 = sc.nextDouble();            
                        System.out.println("Digite tercera nota del estudiante: ");
                        nota3 = sc.nextDouble();
                        System.out.println("Digite cuarta nota del estudiante: ");
                        nota4 = sc.nextDouble();
                        try{                         
                        miColegio.adicionarEstudiante(identificacion, nombre, curso, nota1, nota2, nota3, nota4);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 4:
                        sc.nextLine();
                        promedio = miColegio.calcularPromedioGeneral();
                        System.out.println("\n El promedio de notas es: " + promedio); 
                        break;
                default:
                        System.out.println("Ha Seleccionado Salir");
                        
            }
        }while(opcionMenu != 5);
    }
}