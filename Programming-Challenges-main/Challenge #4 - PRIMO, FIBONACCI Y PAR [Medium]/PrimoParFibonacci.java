import java.util.ArrayList;
import java.util.Scanner;

public class PrimoParFibonacci {

    static Scanner scanner = new Scanner(System.in);
    static int num;
    static String complet = "";

    private static void EsPar(){
        System.out.println("Dime un numero y t dire si es par, primo y fibonacci: ");
        num = scanner.nextInt();
        double par = num % 2;
        if (par == 0){
            complet = complet + " El numero es par, ";
        }else {
            complet = complet + " El numero es impar, ";
        }
        EsPrimo();
    }

    private static void EsPrimo(){
        int key = 100;
        for (int i = num -1; i > 1; i--){

            double primo = num % i;

            if (primo == 0){
                key = 0;
                complet = complet + "no es primo";
                break;
            }else  {
                key = 1;
            }
        }
        if (key == 1){
            complet = complet + "es primo";
        }
        EsFibonacci();
    }

    private static void EsFibonacci(){
        int n1 = 0;
        int n2 = 1;
        int counter = 0;
        int key = 0;

        while (n1 <= num) {
            if (n1 == num) {
                key = 0;
                complet = complet + ", es fibonacci";
                break;
            }

            int num3 = n2 + n1;
            n1 = n2;
            n2 = num3;
            counter = counter + 1;
            key = 1;
        }

        if (key == 1) {
            complet = complet + ", no es fibonacci";
        }
        System.out.println(complet);

    }

    public static void main(String[] args) {
        EsPar();
    }


}
