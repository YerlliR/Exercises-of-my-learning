import java.util.Random;

public class Ex1{
    public static void main(String[] args) throws InterruptedException {

        int r1;
        int r2;
        int r3;

        Random random = new Random();

        r1 = random.nextInt(1,6);
        r2 = random.nextInt(1,6);
        r3 = random.nextInt(1,6);

        System.out.println("Este programa es para tirar tres dados y sumarlos");

        System.out.println("Tirando el primer dado dado ");
        Thread.sleep(1000);
        System.out.println("Has sacado un "  + r1 + " en el primer dado");
        System.out.println("Tirando el segundo dado ");
        Thread.sleep(2000);
        System.out.println("Has sacado un " + r2 + " en el segundo dado");
        System.out.println("Tirando el tercer dado ");
        Thread.sleep(2000);
        System.out.println("Has sacado un " + r3 + " en el tercer dado");

        Thread.sleep(2000);
        System.out.println("La suma de los tres dados es :  " + (r1 + r2 + r3));
    }
}