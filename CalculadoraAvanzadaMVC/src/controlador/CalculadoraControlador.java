package controlador;

import modelo.CalculadoraModelo;
import vista.CalculadoraVista;

public class CalculadoraControlador {
    private final CalculadoraModelo modelo;
    private final CalculadoraVista vista;

    public CalculadoraControlador(CalculadoraModelo modelo, CalculadoraVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            vista.mostrarMenu();
            int opcion = vista.capturarOpcionMenu();

            switch (opcion) {
                case 1:
                    realizarOperacion();
                    break;
                case 2:
                    continuar = false;
                    vista.mostrarResultado("Gracias por usar la calculadora. Adios!");
                    break;
                default:
                    vista.mostrarError("Opcion invalida. Intentalo de nuevo.");
            }
        }
    }

    private void realizarOperacion() {
        vista.mostrarOperaciones();
        String operacion = vista.capturarOperacion();

        try {
            double numero1 = vista.capturarNumero("Ingresa el primer numero: ");
            double resultado;

            if (operacion.equals("raiz")) {
                resultado = modelo.raizCuadrada(numero1);
            } else {
                double numero2 = vista.capturarNumero("Ingresa el segundo numero: ");
                switch (operacion) {
                    case "suma":
                        resultado = modelo.sumar(numero1, numero2);
                        break;
                    case "resta":
                        resultado = modelo.restar(numero1, numero2);
                        break;
                    case "multiplicacion":
                        resultado = modelo.multiplicar(numero1, numero2);
                        break;
                    case "division":
                        resultado = modelo.dividir(numero1, numero2);
                        break;
                    case "potencia":
                        resultado = modelo.potencia(numero1, numero2);
                        break;
                    default:
                        vista.mostrarError("Operacion no reconocida.");
                        return;
                }
            }

            vista.mostrarResultado(String.valueOf(resultado));
        } catch (ArithmeticException e) {
            vista.mostrarError(e.getMessage());
        } catch (Exception e) {
            vista.mostrarError("Entrada invalida. Intentalo de nuevo.");
        }
    }
}
