import java.util.Scanner;

public class Ex5Extra{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la capacidad de tu olla");
        int capacidad = scanner.nextInt();
        System.out.println("Dime cuantos huevos quieres hervir");
        int huevos = scanner.nextInt();
        int lotes = (huevos + capacidad - 1) / capacidad;
        int tiempo = lotes * 10;
        System.out.println("Tardaras " + tiempo + " minutos en hervir " + huevos );

    }
}