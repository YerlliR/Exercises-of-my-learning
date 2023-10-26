import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num;
        int resultado;

        System.out.printf("Dime un numero");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int y = 1; y <= num; y++) {
                resultado = i + y + i * y;
                String juan = "Par ( " + i + " , " + y + " ): " + i + " + " + y + " + " + i * y + " vale " ;
                System.out.println(juan + resultado);
            }
        }
    }
}