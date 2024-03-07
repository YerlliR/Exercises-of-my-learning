import java.util.Scanner;

public class InputValidationMenu {

    private static Scanner scanner = new Scanner(System.in);

    private static void readInt() {
        System.out.println("Ingrese un número entero: ");
        try {
            int num = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: No es un número entero.");
            scanner.nextLine();
        }
    }

    private static void readPositiveInt() {
        System.out.println("Ingrese un número entero positivo: ");
        try {
            int num = scanner.nextInt();
            if (num < 0) throw new Exception("Error: No es positivo.");
        } catch (Exception e) {
            System.out.println("Error: No es un número entero positivo.");
            scanner.nextLine();
        }
    }

    private static void readIntInRange() {
        int min = 0;
        int max = 100;
        System.out.println("Ingrese un número para verificar si está en el rango especificado: ");
        int num = scanner.nextInt();
        try {
            if (num < min || num > max) throw new Exception("Error: No está en el rango.");
        } catch (Exception e) {
            System.out.println("Error: No está en el rango especificado.");
            scanner.nextLine();
        }
    }

    private static void readDouble() {
        System.out.println("Ingrese un número real: ");
        try {
            double num = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Error: No es un número real.");
            scanner.nextLine();
        }
    }

    private static void readDoubleInRange() {
        double min = 0;
        double max = 100;
        System.out.println("Ingrese un número real para verificar si está en el rango especificado: ");
        double num = scanner.nextDouble();
        try {
            if (num < min || num > max) throw new Exception("Error: No está en el rango.");
        } catch (Exception e) {
            System.out.println("Error: No está en el rango especificado.");
            scanner.nextLine();
        }
    }

    public static final String[] COMPOSITORES = {"Bach", "Haydn", "Mozart", "Beethoven", "Brahms", "Mahler", "Bartok"};

    private static void readComposer() {
        System.out.println("Ingrese un compositor: ");
        String composer = scanner.next();
        int index = findComposer(composer);
        if (index != -1) {
            System.out.println("El compositor se encuentra en la posición: " + index);
        } else {
            System.out.println("Compositor no encontrado en la lista.");
        }
    }

    private static int findComposer(String composer) {
        for (int i = 0; i < COMPOSITORES.length; i++) {
            if (COMPOSITORES[i].equalsIgnoreCase(composer)) {
                return i + 1; // Se encontró el compositor, devolver la posición
            }
        }
        return -1; // Devolver -1 si el compositor no se encuentra
    }

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenú:");
            System.out.println("1. Leer un número entero");
            System.out.println("2. Leer un número entero positivo");
            System.out.println("3. Leer un número y verificar si está en un rango");
            System.out.println("4. Leer un número real");
            System.out.println("5. Leer un número real y verificar si está en un rango");
            System.out.println("6. Buscar un compositor en la lista");
            System.out.println("7. Salir");
            System.out.println("Seleccione una opción: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    readInt();
                    break;
                case 2:
                    readPositiveInt();
                    break;
                case 3:
                    readIntInRange();
                    break;
                case 4:
                    readDouble();
                    break;
                case 5:
                    readDoubleInRange();
                    break;
                case 6:
                    readComposer();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
            }
        }
    }
}
