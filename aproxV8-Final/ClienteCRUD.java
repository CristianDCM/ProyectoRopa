import java.util.InputMismatchException;
import java.util.Scanner;

public class ClienteCRUD {
    private static final ControllerCliente controller;
    private static final Scanner scanner = new Scanner(System.in);

    static {
        try {
            controller = new ControllerCliente();
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
                        listarClientes();
                        break;
                    case "C":
                        consultarClientePorID();
                        break;
                    case "R":
                        registrarCliente();
                        break;
                    case "A":
                        actualizarCliente();
                        break;
                    case "E":
                        eliminarCliente();
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

    private static void registrarCliente() {
        Cliente cliente = guardarCliente();
        controller.registrar(cliente);
        System.out.println("Cliente Ingresado Correctamente");
        System.out.println("Registro exitoso: " + cliente.getId());
    }

    private static void actualizarCliente() {
        int id = leerId();
        Cliente cliente = controller.obtenerClientePorId(id);
        if (cliente != null) {
            System.out.println("------------Datos originales------------");
            System.out.println(cliente);
            System.out.println("Ingrese los nuevos datos");

            String identificacion = leerString("Ingrese el número de identificación del cliente: ");
            String nombre = leerString("Ingrese el nombre del cliente: ");
            String genero = leerGenero("Ingrese el genero del cliente: ");

            double calificacion1 = leerCalificacion("Ingrese la calificacion 1: ");
            double calificacion2 = leerCalificacion("Ingrese la calificacion 2: ");
            double calificacion3 = leerCalificacion("Ingrese la calificacion 3: ");

            cliente = new Cliente(id, identificacion, nombre, genero, calificacion1, calificacion2, calificacion3);
            controller.actualizar(cliente);
            System.out.println("Actualización exitosa");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private static void eliminarCliente() {
        int id = leerId();
        Cliente cliente = controller.obtenerClientePorId(id);
        if (cliente != null) {
            controller.eliminar(cliente);
            System.out.println("Cliente eliminado: " + cliente.getId());
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private static void listarClientes() {
        controller.verClientes();
    }

    private static void consultarClientePorID() {
        int id = leerId();
        Cliente cliente = controller.obtenerClientePorId(id);
        if (cliente != null) {
            System.out.println("Cliente encontrado:");
            System.out.println(cliente);
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private static Cliente guardarCliente() {
        String identificacion = leerString("Ingrese el número de identificación del cliente: ");
        String nombre = leerString("Ingrese el nombre del cliente: ");
        String genero = leerGenero("Ingrese el genero del cliente: ");
        double calificacion1 = leerCalificacion("Ingrese la calificacion 1: ");
        double calificacion2 = leerCalificacion("Ingrese la calificacion 2: ");
        double calificacion3 = leerCalificacion("Ingrese la calificacion 3: ");

        return new Cliente(identificacion, nombre, genero, calificacion1, calificacion2, calificacion3);
    }

    private static int leerId() {
        int id;
        while (true) {
            try {
                System.out.println("Ingrese un valor entero para el ID del cliente: ");
                id = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato de número");
                scanner.next();
            }
        }
        return id;
    }

    private static String leerGenero(String message) {
        String genero;
        while (true) {
            System.out.println(message);
            System.out.println("1. Masculino");
            System.out.println("2. Femenino");
            genero = scanner.next().trim(); // 
            if (genero.equals("1") || genero.equals("2")) {  
                genero = genero.equals("1") ? "Masculino" : "Femenino";
                break;
            } else {
                System.out.println("Opción inválida");
            }
        }
        return genero;
    }

    private static double leerCalificacion(String message) {
        double calificacion;
        while (true) {
            try {
                System.out.println(message);
                calificacion = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato de número");
                scanner.next();
            }
        }
        return calificacion;
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
