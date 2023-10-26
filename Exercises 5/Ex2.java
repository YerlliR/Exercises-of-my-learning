import java.util.Random;

public class Ex2{
    public static void main(String[] args) throws InterruptedException {

        int r1 = 1;
        int r2 = 0;

        int vueltas = 0;

        Random random = new Random();

        System.out.println("Este programa esta tirando dos dados hasta que los dos saquen el mismo numero");
        while (r1 != r2){

            vueltas++;

            r1 = random.nextInt(1,6);
            r2 = random.nextInt(1,6);

            System.out.println("Has sacado un "  + r1 + " en el primer dado");
            System.out.println("Has sacado un " + r2 + " en el segundo dado\n");

            Thread.sleep(1000);
        }

        System.out.println("FELICIDADES HAS SACADO DOS NUMERO IGUALES SOLAMENTE HAS TARDADO " + vueltas + " TIRADAS!!!");

    }
}