import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime cuanto pesas en KG:");
        double peso = scanner.nextDouble();
        System.out.println("Dime cuanto mides en metros:");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Tu indice de masa corporal es de = " + imc);


    }
}
