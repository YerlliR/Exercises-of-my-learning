import java.util.Scanner;
import java.util.Random;


public class Main{
    public static void main(String[] args){
        int rand;

        String eleccion;
        int eleccionFin = 0;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        rand = random.nextInt(5) + 1;


        System.out.println("Que quieres sacar piedra papel o tijera ? Dimelo en texto");
        eleccion = scanner.next();

     
        if      (eleccion.equals("Piedra") || eleccion.equals("piedra"))     eleccionFin = 1;
        else if (eleccion.equals("Papel") || eleccion.equals("papel") )      eleccionFin = 2;
        else if (eleccion.equals("Tijera") || eleccion.equals("tijera"))     eleccionFin = 3;
        else if (eleccion.equals("Lagarto") || eleccion.equals("lagarto"))   eleccionFin = 4;
        else if (eleccion.equals("Spock") || eleccion.equals("spock"))       eleccionFin = 5;
        else {
            System.out.println("Introduce un valor valido");
        }



        if (eleccionFin == rand){
            System.out.println("EMPATE");
        } else if ((eleccionFin == 1 && (rand == 3 || rand == 4)) ||
                   (eleccionFin == 2 && (rand == 1 || rand == 5)) ||
                   (eleccionFin == 3 && (rand == 2 || rand == 4)) ||
                   (eleccionFin == 4 && (rand == 2 || rand == 5)) ||
                   (eleccionFin == 5 && (rand == 1 || rand == 3))) {

            System.out.println("HAS GANADOOOO");

        }else {
            System.out.println("Has perdido F");
        }


        if (rand == 1){
            System.out.println("Tu contrincante ha sacado PIEDRA");
        }else if (rand == 2){
            System.out.println("Tu contrincante ha sacado PAPEL");
        }else if (rand == 4){
            System.out.println("Tu contrincante ha sacado LAGARTO");
        }else if (rand == 5){
            System.out.println("Tu contrincante ha sacado SPOCK");
        } else {
            System.out.println("Tu contrincante ha sacado TIJERA");
        }

    }
}