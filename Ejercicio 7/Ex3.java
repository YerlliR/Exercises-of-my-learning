import java.util.Random;
import java.util.Scanner;

public class Ex3{
    public static void main(String[] args) throws InterruptedException {

        int r1;

        int numero1;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        r1 = random.nextInt(100);
        
        for (int i = 4; i >= 0; i--){

            numero1 = scanner.nextInt();

            if(numero1 < r1){
                System.out.println("El numero misterioso es mayor que " + numero1);
                System.out.println("Te quedan " + i + "intentos");
            } else if (numero1 > r1) {
                System.out.println("El numero misterioso es menor que " + numero1);
                System.out.println("Te quedan " + i + " intentos");
            }else if (numero1 == r1){
                System.out.println("FELICIDADES HAS ACERTADO EL NUMERO MISTERIOSO");
                System.out.println("Te han sobrado " + i + " intentos");
            }else {
                System.out.println("HAS PERDIDO");
            }
        }
    }
}