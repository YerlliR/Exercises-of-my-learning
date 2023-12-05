import java.util.Scanner;

public class CodificadorImagen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la dimensión de la imagen:");
        int dimension = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de leer el entero

        System.out.println("Ingrese las líneas de la imagen:");

        // Leer las líneas de la imagen
        String[] lineas = new String[dimension];
        for (int i = 0; i < dimension; i++) {
            lineas[i] = scanner.nextLine();
        }

        // Aplicar el codificador y mostrar la salida
        for (int i = 0; i < dimension; i++) {
            String codificacion = codificarFila(lineas[i]);
            System.out.println(codificacion);
        }

        scanner.close();
    }

    private static String codificarFila(String fila) {
        StringBuilder codificacion = new StringBuilder();

        char valorInicial = fila.charAt(0);
        codificacion.append(valorInicial).append(" ");

        int contador = 1;

        for (int i = 1; i < fila.length(); i++) {
            if (fila.charAt(i) == fila.charAt(i - 1)) {
                contador++;
            } else {
                codificacion.append(contador).append(" ");
                contador = 1;
            }
        }

        codificacion.append(contador); // Agregar el último contador

        return codificacion.toString();
    }
}