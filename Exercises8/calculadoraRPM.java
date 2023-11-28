package Exercises8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class calculadoraRPM {

    static Scanner scanner = new Scanner(System.in);
    static DecimalFormat formato = new DecimalFormat("00000.00000");

    public static void limpiarPantalla () {
        System.out.print("\033[H\033[2J");

    }
    public static double[] numLinias (){

        limpiarPantalla();
        System.out.println("Dime el numero de linias que quieres que tenga tu calculadora");
        int linias = scanner.nextInt();
        double[] calculadora = new double[linias];

        for (int i = 0; i < calculadora.length; i++){
            calculadora[i] = 0;
        }
        return calculadora;


    }



    public static void imprimirCalculadora(double[] calculadora) {
        limpiarPantalla();
//LO CONFIESO ESTO ES DEL CHATGPT PERO NO ESTAS VALORANDO LA INTERFAZ ASIQ JAJAJA pero la parte buena esque me sireve para aprender ademas de verdad
        System.out.println("╔════════════════════╗");
        for (int i = 0; i < calculadora.length; i++) {
            System.out.printf("║ %2d %-16s║\n", (calculadora.length - i), formato.format(calculadora[i]));
        }
        System.out.println("╚════════════════════╝");
    }



   public static double[] rotArrayArriba(double[] arr){
        double last = arr[arr.length-1];

        for (int i = 0; i < arr.length - 1; i++) {
           arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = last;

       return arr;

   }

    public static double[] rotArrayAbajo(double[] arr) {
     arr[arr.length - 2] = 0;

        for (int i = arr.length - 2; i > 0; i--) {
            arr[i] = arr[i - 1];
        }



        return arr;
    }


    public static void main(String[] args) {

        double[] calculadora = numLinias();

        String dato = "";

        for (int z = 0; true; z++){
            imprimirCalculadora(calculadora);

            dato = scanner.next();

            if (dato.equalsIgnoreCase("Stop")){
                System.exit(0);

            }else if (
                    dato.equals("+") ||
                    dato.equals("-") ||
                    dato.equals("*") ||
                    dato.equals("/"))
            {

                if (dato.equals("+")){
                    calculadora[calculadora.length - 1] = calculadora[calculadora.length - 2] + calculadora[calculadora.length - 1];
                } else if ( dato.equals("-")) {
                    calculadora[calculadora.length - 1] = calculadora[calculadora.length - 2] - calculadora[calculadora.length - 1];

                }else if ( dato.equals("*")) {
                    calculadora[calculadora.length - 1] = calculadora[calculadora.length - 2] * calculadora[calculadora.length - 1];

                }else if ( dato.equals("/")) {
                    calculadora[calculadora.length - 1] = calculadora[calculadora.length - 2] / calculadora[calculadora.length - 1];

                }


                calculadora = rotArrayAbajo(calculadora);

            }else{
                if (z == 0) {
                    calculadora[calculadora.length - 1] = Integer.parseInt(dato);
                } else {
                    calculadora = rotArrayArriba(calculadora);
                    calculadora[calculadora.length - 1] = Integer.parseInt(dato);
                }

            }

        }
    }
}
