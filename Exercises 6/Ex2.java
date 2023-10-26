import java.util.Random;
import java.util.Scanner;

public class Ex2 {

    private static void ImpTabla(String[][] tabla) {
        System.out.println("--------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    System.out.println(tabla[i][j]);
                }else {

                    System.out.print(tabla[i][j] + "  |  ");
                }

            }
            System.out.println("--------------");
        }
    }

    private static void Victoia(String[][] tabla) {
        if (
                (tabla[0][2].equals("x") && tabla[1][1].equals("x") && tabla[2][0].equals("x")) ||
                (tabla[0][0].equals("x") && tabla[1][1].equals("x") && tabla[2][2].equals("x")) ||
                (tabla[0][2].equals("x") && tabla[1][2].equals("x") && tabla[2][2].equals("x")) ||
                (tabla[0][1].equals("x") && tabla[1][1].equals("x") && tabla[2][1].equals("x")) ||
                (tabla[2][0].equals("x") && tabla[2][1].equals("x") && tabla[2][2].equals("x")) ||
                (tabla[1][0].equals("x") && tabla[1][1].equals("x") && tabla[1][2].equals("x")) ||
                (tabla[0][0].equals("x") && tabla[1][0].equals("x") && tabla[2][0].equals("x")) ||
                (tabla[0][0].equals("x") && tabla[0][1].equals("x") && tabla[0][2].equals("x"))){
            System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡Has ganado!!!!!!!!!!!!!!! ");
        } else if (
                (tabla[0][2].equals("0") && tabla[1][1].equals("0") && tabla[2][0].equals("0")) ||
                (tabla[0][0].equals("0") && tabla[1][1].equals("0") && tabla[2][2].equals("0")) ||
                (tabla[0][2].equals("0") && tabla[1][2].equals("0") && tabla[2][2].equals("0")) ||
                (tabla[0][1].equals("0") && tabla[1][1].equals("0") && tabla[2][1].equals("0")) ||
                (tabla[2][0].equals("0") && tabla[2][1].equals("0") && tabla[2][2].equals("0")) ||
                (tabla[1][0].equals("0") && tabla[1][1].equals("0") && tabla[1][2].equals("0")) ||
                (tabla[0][0].equals("0") && tabla[1][0].equals("0") && tabla[2][0].equals("0")) ||
                (tabla[0][0].equals("0") && tabla[0][1].equals("0") && tabla[0][2].equals("0"))) {

        }else {
            System.out.println();
        }
    }
    

    public static void main(String[] args) throws InterruptedException {
        String[][] tabla;
        int cordenadaY;
        int cordenadaX;
        int r1;
        int r2;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        tabla = new String[3][3];

        System.out.println(" Este es un programa para jugar al 3 en raya:\n");
        System.out.println("--------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabla[i][j] = "-";
                if (j == 2) {
                    System.out.println(tabla[i][j]);
                }else {
                    System.out.print(tabla[i][j] + "  |  ");
                }
            }
            System.out.println("--------------");
        }


        for (int x = 0; x < 9; x++ ){


            while (true) {
                System.out.println("Dime las coordenadas de donde quieras poner tu ficha x");
                System.out.println("Dime el valor de la coordenada y");
                cordenadaY = scanner.nextInt();
                System.out.println("Dime el valor de la coordenada x");
                cordenadaX = scanner.nextInt();
                if (tabla[cordenadaY][cordenadaX].equals("-")){
                    tabla[cordenadaY][cordenadaX]="x";
                    break;
                }else {
                    System.out.println("La coordenada que has seleccionado está ocupada por otra ficha vuelve a tirar");
                }
            }
            ImpTabla(tabla);
            
            Victoia(tabla);
            
            Thread.sleep(1000);

            System.out.println("Es el turo de la maquina;");

            Thread.sleep(1000);

            while(true){
                r1 = random.nextInt(3);
                r2 = random.nextInt(3);

                if (tabla[r1][r2].equals("-")){
                    tabla[r1][r2]= "0";
                    break;
                }
            }

            ImpTabla(tabla);
            Victoia(tabla);

        }
    }
}
