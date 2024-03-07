import java.util.Scanner;

public class ExtensionDivision {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;


        try {

            System.out.println("Ingrese el primer número a dividir: ");
            num1 = scanner.nextInt();

            System.out.println("Ingrese el segundo número: ");
            num2 = scanner.nextInt();

            int result = num1 / num2;

            System.out.println("El resultado de la división es: " + result);

        } catch (Exception e) {

            System.out.println("Error: Ocurrió un problema durante la división.");

        } finally {
            
            scanner.close();

        }
    }
}
