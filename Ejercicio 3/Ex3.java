import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();


        double discriminante = (b * b) - 4 * a * c;

        double raizPos = (-b + Math.sqrt(discriminante)) / (2 * a);
        double raizNeg = (-b - Math.sqrt(discriminante)) / (2 * a);

        System.out.println("Resultado: x1 = " + raizPos + " y x2 = " + raizNeg);


    }
}