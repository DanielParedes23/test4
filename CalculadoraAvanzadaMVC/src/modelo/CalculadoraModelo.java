package modelo;

public class CalculadoraModelo {
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return a / b;
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double raizCuadrada(double numero) throws ArithmeticException {
        if (numero < 0) {
            throw new ArithmeticException("No se puede calcular la raiz cuadrada de un numero negativo.");
        }
        return Math.sqrt(numero);
    }
}


