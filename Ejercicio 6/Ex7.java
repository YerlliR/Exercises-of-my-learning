import java.util.Scanner;
import java.util.Random;


public class Main{
    public static void main(String[] args){
        int rand;

        String eleccion;
        int eleccionFin = 0;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        rand = random.nextInt(3) + 1;


        System.out.println("Que quieres sacar piedra papel o tijera ? Dimelo en texto");
        eleccion = scanner.next();


        if (eleccion.equals("Piedra") || eleccion.equals("piedra")){
            eleccion = "1";
            eleccionFin = Integer.parseInt(eleccion);
        }else if (eleccion.equals("Papel") || eleccion.equals("papel") ){
            eleccion = "2";
            eleccionFin = Integer.parseInt(eleccion);
        }else if (eleccion.equals("Tijera") || eleccion.equals("tijera")){
            eleccion = "3";
            eleccionFin = Integer.parseInt(eleccion);
        }else {
            System.out.println("Introduce un valor valido");
        }


        if (eleccionFin == rand){
            System.out.println("EMPATE");
        } else if ((eleccionFin == 1 && rand == 3) || (eleccionFin == 2 && rand == 1) || (eleccionFin == 3 && rand == 2)) {
            System.out.println("HAS GANADOOOO");
        }else {
            System.out.println("Has perdido F");
        }


        if (rand == 1){
            System.out.println("Tu contrincante ha sacado PIEDRA");
        }else if (rand == 2){
            System.out.println("Tu contrincante ha sacado PAPEL");
        }else {
            System.out.println("Tu contrincante ha sacado TIJERA");
        }

    }
}