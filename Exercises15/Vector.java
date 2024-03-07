public class Arreglo {
    public static void main(String[] args) {
        int[] arreglo = new int[5];

        try {
            arreglo[2] = 42;
            System.out.println("Valor asignado correctamente en la posición 3.");
        } catch (ArrayIndexOutOfBoundsException excepcion) {
            System.out.println("Error: fuera de rango.");
        }
    }
}
