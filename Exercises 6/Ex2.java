import java.util.Random;
import java.util.Scanner;

public class Ex2 {

    private static void ImpTabla(String[][] tabla) {
  	System.out.print("\033[H\033[2J");
        System.out.println("\u250C\u2500\u2500\u2500\u2500\u2500\u252C\u2500\u2500\u2500\u2500\u2500\u252C\u2500\u2500\u2500\u2500\u2500\u2510");
        for (int i = 0; i < 3; i++) {
	    System.out.print("\u2502");
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    System.out.println("  " + tabla[i][j] + "  \u2502");

                }else {
                    System.out.print("  " + tabla[i][j] + "  \u2502");
                }
            }
            if (i == 2){
            	System.out.println("\u2514\u2500\u2500\u2500\u2500\u2500\u2534\u2500\u2500\u2500\u2500\u2500\u2534\u2500\u2500\u2500\u2500\u2500\u2518");
            }else{
            	System.out.println("\u251C\u2500\u2500\u2500\u2500\u2500\u253C\u2500\u2500\u2500\u2500\u2500\u253C\u2500\u2500\u2500\u2500\u2500\u2524");
            }

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
            System.exit(0);

        } else if (
                (tabla[0][2].equals("0") && tabla[1][1].equals("0") && tabla[2][0].equals("0")) ||
                (tabla[0][0].equals("0") && tabla[1][1].equals("0") && tabla[2][2].equals("0")) ||
                (tabla[0][2].equals("0") && tabla[1][2].equals("0") && tabla[2][2].equals("0")) ||
                (tabla[0][1].equals("0") && tabla[1][1].equals("0") && tabla[2][1].equals("0")) ||
                (tabla[2][0].equals("0") && tabla[2][1].equals("0") && tabla[2][2].equals("0")) ||
                (tabla[1][0].equals("0") && tabla[1][1].equals("0") && tabla[1][2].equals("0")) ||
                (tabla[0][0].equals("0") && tabla[1][0].equals("0") && tabla[2][0].equals("0")) ||
                (tabla[0][0].equals("0") && tabla[0][1].equals("0") && tabla[0][2].equals("0"))) {

            System.out.println("Has perdido");
            System.exit(0);

        }else {
            System.out.println();
        }
    }
    

    public static void main(String[] args) throws InterruptedException {
    	System.out.print("\033[H\033[2J");
        String[][] tabla;
        int cordenadaY;
        int cordenadaX;
        int r1;
        int r2;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        tabla = new String[3][3];

        System.out.println(" Este es un programa para jugar al 3 en raya:\n");
        System.out.println("\u250C\u2500\u2500\u2500\u2500\u2500\u252C\u2500\u2500\u2500\u2500\u2500\u252C\u2500\u2500\u2500\u2500\u2500\u2510");
        
        
        for (int i = 0; i < 3; i++) {
	    System.out.print("\u2502");
            for (int j = 0; j < 3; j++) {
                tabla[i][j] = "-";
                if (j == 2) {
                    System.out.println("  " + tabla[i][j] + "  \u2502");

                }else {
                    System.out.print("  " + tabla[i][j] + "  \u2502");
                }
            }
            if (i == 2){
            	System.out.println("\u2514\u2500\u2500\u2500\u2500\u2500\u2534\u2500\u2500\u2500\u2500\u2500\u2534\u2500\u2500\u2500\u2500\u2500\u2518");
            }else{
            	System.out.println("\u251C\u2500\u2500\u2500\u2500\u2500\u253C\u2500\u2500\u2500\u2500\u2500\u253C\u2500\u2500\u2500\u2500\u2500\u2524");
            }

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
