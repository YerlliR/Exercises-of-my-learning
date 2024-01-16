import java.util.ArrayList;
import java.util.Scanner;

public class EstadisticasNumeros {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce un número (o 'q' para salir): ");
            String entrada = scanner.nextLine();

            if (entrada.toLowerCase().equals("q")) {
                break;
            }

            try {
                double numero = Double.parseDouble(entrada);
                numeros.add(numero);

                double mediaActual = calcularMedia(numeros);
                double desviacionTipicaActual = calcularDesviacionTipica(numeros);

                System.out.printf("Media: %.2f%n", mediaActual);
                System.out.printf("Desviación típica: %.2f%n", desviacionTipicaActual);

            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido.");
            }
        }

        System.out.println("Programa finalizado.");
    }

    private static double calcularMedia(ArrayList<Double> lista) {
        double suma = 0;
        for (double numero : lista) {
            suma += numero;
        }
        return lista.isEmpty() ? 0 : suma / lista.size();
    }

    private static double calcularDesviacionTipica(ArrayList<Double> lista) {
        double media = calcularMedia(lista);
        double sumaCuadrados = 0;

        for (double numero : lista) {
            sumaCuadrados += Math.pow(numero - media, 2);
        }

        double varianza = lista.isEmpty() ? 0 : sumaCuadrados / lista.size();
        return Math.sqrt(varianza);
    }
}
