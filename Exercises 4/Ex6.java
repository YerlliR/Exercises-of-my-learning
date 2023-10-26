import java.util.Scanner;
public class Ex6{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int dia1;
        int hora1;
        int dia2;
        int hora2;

        int horastranscurridas;

        System.out.println("En que dia de la semana estamos experesalo con un numero del 1 al 7");
        dia1 = scanner.nextInt();

        System.out.println("Que hora es");
        hora1 = scanner.nextInt();

        System.out.println("Introduce el dia de la semana que quieres saber cuantas horas quedan para ese momento");
        dia2= scanner.nextInt();

        System.out.println("Introduce la hora de ese dia");
        hora2 = scanner.nextInt();

        horastranscurridas = (dia2 - dia1) * 24;
        horastranscurridas = horastranscurridas + (hora2 - hora1);
        
        System.out.println("Han pasado " + horastranscurridas + " horas entre los dos dias");

    }
}