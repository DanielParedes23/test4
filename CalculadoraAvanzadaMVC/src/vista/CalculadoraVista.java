package vista;

import java.util.Scanner;

public class CalculadoraVista {
    private final Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("\n=== Calculadora Avanzada ===");
        System.out.println("Menu de opciones:");
        System.out.println("1. Realizar una operacion");
        System.out.println("2. Salir");
    }

    public void mostrarOperaciones() {
        System.out.println("\nSelecciona una operacion:");
        System.out.println("suma, resta, multiplicacion, division, potencia, raiz");
    }

    public int capturarOpcionMenu() {
        while (true) {
            try {
                System.out.print("Selecciona una opcion: ");
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Por favor, ingresa un numero.");
            }
        }
    }

    public String capturarOperacion() {
        System.out.print("Escribe la operacion: ");
        return scanner.nextLine().toLowerCase().trim();
    }

    public double capturarNumero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Por favor, ingresa un numero.");
            }
        }
    }

    public void mostrarResultado(String resultado) {
        System.out.println("\nResultado: " + resultado);
    }

    public void mostrarError(String mensaje) {
        System.out.println("\nError: " + mensaje);
    }

    public boolean capturarContinuar() {
        System.out.print("\n¿Quieres realizar otra operacion? (si/no): ");
        String respuesta = scanner.nextLine().toLowerCase().trim();
        return respuesta.equals("si");
    }
}
