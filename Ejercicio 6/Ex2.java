import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int base;
        int exponente;
        int resultado = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime la base");
        base = scanner.nextInt();
        System.out.println("Dime el exponente");
        exponente = scanner.nextInt();

        for (int i = 0; i < exponente; i++){
            resultado *= base;
        }

        System.out.println("Este es el resultado " + resultado);
    }
}
