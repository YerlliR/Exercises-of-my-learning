import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero del 1 al 10: ");
        int numero = scanner.nextInt();
        System.out.println();


        for (int i = 1; i < 11; i++ ){
            System.out.println(numero + " x " + i + " = "+ (numero * i));
        }


    }
}
