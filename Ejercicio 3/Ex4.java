import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos insectos hay ?");
        int insectos = scanner.nextInt();
        System.out.println("Cuantos aracnidos hay ?");
        int aracnidos = scanner.nextInt();
        System.out.println("Cuantos crustaceos hay ?");
        int crustaceos = scanner.nextInt();
        System.out.println("Cuantos cienpies hay ?");
        int cienpies = scanner.nextInt();
        System.out.println("Cuantos segmentos tienen los cienpies ?");
        int segemntosCien  = scanner.nextInt();
        System.out.println("Cuantos milpies hay ?");
        int milpies = scanner.nextInt();
        System.out.println("Cuantos segmentos tienen los milipies");
        int segmentosMil = scanner.nextInt();

        int patas = (insectos * 6) + (aracnidos * 8) + (crustaceos * 10) + (cienpies * segemntosCien * 2) + (milpies * segmentosMil * 4);

        System.out.println("La cantidad de patas totales");

    }
}
