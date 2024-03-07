import java.util.Scanner;
import java.util.InputMismatchException;

public class Division {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        try {
            System.out.println("Ingrese el primer número: ");
            num1 = scanner.nextInt();

            System.out.println("Ingrese el segundo número: ");
            num2 = scanner.nextInt();

            int result = num1 / num2;

            System.out.println("El resultado de la división es: " + result);

        } catch (InputMismatchException e) {

            System.out.println("Error: El dato ingresado no es un número.");

        } catch (ArithmeticException e) {

            System.out.println("Error: No se puede dividir por cero.");

        } catch (Exception e) {

            System.out.println("Error: Ocurrió un problema durante la división.");

        } finally {
            scanner.close();
        }
    }
}
