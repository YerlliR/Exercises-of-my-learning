import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el numero que quieres saber si es primo o no ");
        numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }

    }
    
    public static boolean esPrimo(int numero){
        int i;
        
        i = 2;
        
        if (numero <= 1) {
            return false;
        }
        while (i * i <= numero) {
            i = i + 1;
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}