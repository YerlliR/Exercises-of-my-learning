import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la capacidad de tu olla");
        int capadcidad = scanner.nextInt();
        System.out.println("Dime cuantos huevos quieres hervir");
        int huevos = scanner.nextInt();

        int lotes = (int) Math.ceil((double) huevos / capadcidad);
        int tiempo =  (lotes * 10);

        System.out.println("Tardaras " + tiempo + " minutos en hervir " + huevos );




    }
}
