import java.util.InputMismatchException;
import java.util.Scanner;

public class CRUDClienteRopa {
    private static final ControladorCliente controlador;
    private static final Scanner scanner = new Scanner(System.in);

    static {
        try {
            controlador = new ControladorCliente();
        } catch (BDExcepcionDAO e) {
            System.out.println("Error al inicializar el controlador");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String action;
        while (true) {
            System.out.println("-------------------------");
            System.out.println("[|L|istar ] [|C|onsultar por ID]  [|R|egistrar] [|A|ctualizar] [|E|liminar] [|S|alir] ");
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
                        modificarCliente();
                        break;
                    case "E":
                        eliminarCliente();
                        break;
                    case "S":
                        return;
                    default:
                        System.out.println("Accion invalida");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void registrarCliente() {
        ClienteRopa cliente = guardarCliente();
        controlador.guardarDato(cliente);
        System.out.println("Cliente Ingresado Correctamente");
        System.out.println("Registro exitoso: " + cliente.getIdCliente());
    }

    private static void modificarCliente() {
        int idCliente = leerId();
        ClienteRopa cliente = controlador.obtenerClientePorSuId(idCliente);
        if (cliente != null) {
            System.out.println("------------Datos originales------------");
            System.out.println(cliente);
            System.out.println("Ingrese los nuevos datos");

            String cedulaCliente = leerString("Ingrese la cedula de identificacion del cliente: ");
            String nombreCliente = leerString("Ingrese el nombre del cliente: ");
            String generoCliente = leerGenero("Ingrese el genero del cliente: ");

            double calificacionRopaMasculina = leerCalificacion("Ingrese la calificacion de ropa Masculina: ");
            double calificacionRopaFemenina = leerCalificacion("Ingrese la calificacion de ropa Femenina: ");
            double calificacionRopaUnisex = leerCalificacion("Ingrese la calificacion de ropa Unisex: ");

            cliente = new ClienteRopa(idCliente, cedulaCliente, nombreCliente, generoCliente, calificacionRopaMasculina, calificacionRopaFemenina, calificacionRopaUnisex);
            controlador.modificarDato(cliente);
            System.out.println("Actualizacion exitosa");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private static void eliminarCliente() {
        int idCliente = leerId();
        ClienteRopa cliente = controlador.obtenerClientePorSuId(idCliente);
        if (cliente != null) {
            controlador.eliminarDato(cliente);
            System.out.println("Cliente eliminado: " + cliente.getIdCliente());
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private static void listarClientes() {
        controlador.verDatosClientes();
    }

    private static void consultarClientePorID() {
        int idCliente = leerId();
        ClienteRopa cliente = controlador.obtenerClientePorSuId(idCliente);
        if (cliente != null) {
            System.out.println("Cliente encontrado:");
            System.out.println(cliente);
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private static ClienteRopa guardarCliente() {
        String cedulaCliente = leerString("Ingrese la cedula de identificacion del cliente: ");
        String nombreCliente = leerString("Ingrese el nombre del cliente: ");
        String generoCliente = leerGenero("Ingrese el genero del cliente: ");
        double calificacionRopaMasculina = leerCalificacion("Ingrese la calificacion de ropa Masculina: ");
        double calificacionRopaFemenina = leerCalificacion("Ingrese la calificacion de ropa Femenina: ");
        double calificacionRopaUnisex = leerCalificacion("Ingrese la calificacion de ropa Unisex: ");

        return new ClienteRopa(cedulaCliente, nombreCliente, generoCliente, calificacionRopaMasculina, calificacionRopaFemenina, calificacionRopaUnisex);
    }

    private static int leerId() {
        int idCliente;
        while (true) {
            try {
                System.out.println("Ingrese un valor entero para el ID del cliente: ");
                idCliente = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato de numero");
                scanner.next();
            }
        }
        return idCliente;
    }

    private static String leerGenero(String message) {
        String generoCliente;
        while (true) {
            System.out.println(message);
            System.out.println("1. Masculino");
            System.out.println("2. Femenino");
            generoCliente = scanner.next().trim(); // 
            if (generoCliente.equals("1") || generoCliente.equals("2")) {  
                generoCliente = generoCliente.equals("1") ? "Masculino" : "Femenino";
                break;
            } else {
                System.out.println("Opción inválida");
            }
        }
        return generoCliente;
    }

    private static double leerCalificacion(String message) {
        double calificacion;
        while (true) {
            try {
                System.out.println(message);
                calificacion = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato de numero");
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
                System.out.println("La longitud de la cadena debe ser mayor a 2");
            } else {
                break;
            }
        }
        return s;
    }
}
