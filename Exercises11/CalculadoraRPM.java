import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraRPM {

    static Scanner scanner = new Scanner(System.in);
    static DecimalFormat formato = new DecimalFormat("00000.00000");

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
    }

    public static ArrayList<Double> inicializarCalculadora() {
        limpiarPantalla();
        System.out.println("Dime el número de líneas que quieres que tenga tu calculadora:");
        int lineas = scanner.nextInt();
        return new ArrayList<>(lineas);
    }

    public static void imprimirCalculadora(ArrayList<Double> calculadora) {
        limpiarPantalla();
        System.out.println("╔════════════════════╗");
        for (int i = 0; i < calculadora.size(); i++) {
            System.out.printf("║ %2d %-16s║\n", (calculadora.size() - i), formato.format(calculadora.get(i)));
        }
        System.out.println("╚════════════════════╝");
    }

    public static ArrayList<Double> rotarArrayArriba(ArrayList<Double> arr) {
        double last = arr.remove(arr.size() - 1);
        arr.add(0, last);
        return arr;
    }

    public static ArrayList<Double> rotarArrayAbajo(ArrayList<Double> arr) {
        arr.remove(arr.size() - 2);
        arr.add(0, 0.0);
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Double> calculadora = inicializarCalculadora();
        String dato;

        for (int z = 0; true; z++) {
            imprimirCalculadora(calculadora);
            dato = scanner.next();

            if (dato.equalsIgnoreCase("Stop")) {
                System.exit(0);
            } else if (dato.equals("+") || dato.equals("-") || dato.equals("*") || dato.equals("/")) {
                double operando1 = calculadora.remove(calculadora.size() - 2);
                double operando2 = calculadora.remove(calculadora.size() - 1);

                switch (dato) {
                    case "+":
                        calculadora.add(operando1 + operando2);
                        break;
                    case "-":
                        calculadora.add(operando1 - operando2);
                        break;
                    case "*":
                        calculadora.add(operando1 * operando2);
                        break;
                    case "/":
                        calculadora.add(operando1 / operando2);
                        break;
                }

                calculadora = rotarArrayAbajo(calculadora);
            } else {
                if (z == 0) {
                    calculadora.add(Double.parseDouble(dato));
                } else {
                    calculadora = rotarArrayArriba(calculadora);
                    calculadora.set(calculadora.size() - 1, Double.parseDouble(dato));
                }
            }
        }
    }
}
