import java.util.InputMismatchException;
import java.util.Scanner;

public class EstudianteCRUD {
    private static final ControllerEstudiante controller;
    private static final Scanner scanner = new Scanner(System.in);

    static {
        try {
            controller = new ControllerEstudiante();
        } catch (DAOException e) {
            System.out.println("Error al inicializar el controlador");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String action;
        while (true) {
            System.out.println("-------------------------");
            System.out.println("[L]istar | [C]onsultar por ID | [R]egistrar | [A]ctualizar | [E]liminar | [S]alir: ");
            action = scanner.next().toUpperCase();
            try {
                switch (action) {
                    case "L":
                        listarEstudiantes();
                        break;
                    case "C":
                        consultarEstudiantePorID();
                        break;
                    case "R":
                        registrarEstudiante();
                        break;
                    case "A":
                        actualizarEstudiante();
                        break;
                    case "E":
                        eliminarEstudiante();
                        break;
                    case "S":
                        return;
                    default:
                        System.out.println("Acción inválida");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void registrarEstudiante() {
        Estudiante estudiante = guardarEstudiante();
        controller.registrar(estudiante);
        System.out.println("Estudiante Ingresado Correctamente");
        System.out.println("Registro exitoso: " + estudiante.getId());
    }

    private static void actualizarEstudiante() {
        int id = leerId();
        Estudiante estudiante = controller.obtenerEstudiantePorId(id);
        if (estudiante != null) {
            System.out.println("------------Datos originales------------");
            System.out.println(estudiante);
            System.out.println("Ingrese los nuevos datos");

            String identificacion = leerString("Ingrese el número de identificación del estudiante: ");
            String nombre = leerString("Ingrese el nombre del estudiante: ");
            String curso = leerString("Ingrese el curso del estudiante: ");
            double nota1 = leerNota("Ingrese la nota 1: ");
            double nota2 = leerNota("Ingrese la nota 2: ");
            double nota3 = leerNota("Ingrese la nota 3: ");

            estudiante = new Estudiante(id, identificacion, nombre, curso, nota1, nota2, nota3);
            controller.actualizar(estudiante);
            System.out.println("Actualización exitosa");
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    private static void eliminarEstudiante() {
        int id = leerId();
        Estudiante estudiante = controller.obtenerEstudiantePorId(id);
        if (estudiante != null) {
            controller.eliminar(estudiante);
            System.out.println("Estudiante eliminado: " + estudiante.getId());
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    private static void listarEstudiantes() {
        controller.verEstudiantes();
    }

    private static void consultarEstudiantePorID() {
        int id = leerId();
        Estudiante estudiante = controller.obtenerEstudiantePorId(id);
        if (estudiante != null) {
            System.out.println("Estudiante encontrado:");
            System.out.println(estudiante);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    private static Estudiante guardarEstudiante() {
        String identificacion = leerString("Ingrese el número de identificación del estudiante: ");
        String nombre = leerString("Ingrese el nombre del estudiante: ");
        String curso = leerString("Ingrese el curso del estudiante: ");
        double nota1 = leerNota("Ingrese la nota 1: ");
        double nota2 = leerNota("Ingrese la nota 2: ");
        double nota3 = leerNota("Ingrese la nota 3: ");

        return new Estudiante(identificacion, nombre, curso, nota1, nota2, nota3);
    }

    private static int leerId() {
        int id;
        while (true) {
            try {
                System.out.println("Ingrese un valor entero para el ID del estudiante: ");
                id = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato de número");
                scanner.next();
            }
        }
        return id;
    }

    private static double leerNota(String message) {
        double nota;
        while (true) {
            try {
                System.out.println(message);
                nota = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato de número");
                scanner.next();
            }
        }
        return nota;
    }

    private static String leerString(String message) {
        String s;
        while (true) {
            System.out.println(message);
            s = scanner.next().trim();
            if (s.length() <= 2) {
                System.out.println("La longitud de la cadena debe ser >= 2");
            } else {
                break;
            }
        }
        return s;
    }
}


