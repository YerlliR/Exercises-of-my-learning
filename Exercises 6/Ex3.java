import java.util.Scanner;
public class Ex3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void ImpTabla(int[][] tabla) {
        System.out.print("\033[H\033[2J");
        System.out.println("_________________________");
        for (int i = 0; i <= 3; i++) {
            System.out.print("|  ");
            for (int j = 0; j <= 3; j++) {
                if (j == 3) {
                    System.out.println(tabla[i][j] + "  |  ");
                } else {
                    System.out.print(tabla[i][j] + "  |  ");
                }
            }
            System.out.println("_________________________");
        }
    }

    public static void AZero(int[][] tabla) {
        for (int i = 0; i <= 3; i++) {
            for (int x = 0; x <= 3; x++) {
                tabla[i][x] = 0;
            }
        }
    }

    public static void CompletTabla(int[][] tabla) {
        for (int i = 0; i <= 3; i++) {
            for (int x = 0; x <= 3; x++) {
                tabla[i][x] = scanner.nextInt();
                ImpTabla(tabla);
            }
        }
    }

    /*public static void EsSimetrica(int[][] tabla) {
        for (int i = 0; i <= 3; i++) {
            for (int x = 0; x <= 3; x++) {
                if (

                ){

                }
            }
        }

    }*/

    public static void main(String[] args) {

        int[][] tabla;

        tabla = new int[4][4];

        AZero(tabla);

        ImpTabla(tabla);

        CompletTabla(tabla);

       // EsSimetrica(tabla);

    }
}





