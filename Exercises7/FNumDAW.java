package Exercises7;

import java.util.Scanner;

public class FNumDAW {
    static Scanner scanner = new Scanner(System.in);
    public static boolean continuacion(){
        System.out.println("Quieres probar otro programa de la libreria? ");
        String respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("Si")){
            return true;
        }else {
            return false;
        }
    }

    public static double potencia(double base, int exponente) {
        double resultado = Math.pow(base,exponente);
        return resultado;
    }

    public static int cuentaDigitos(int numero){
        String longitud = Integer.toString(numero);
        return longitud.length();
    }

    //He buscado las funciones pa hacer esto porq sino eran bastantes mas linias de codigo y sabia que habia una forma dem hacerlo facil y corto
    public static int vuelta(int numero) {
        String numeroStr = Integer.toString(numero);
        String numeroInvertidoStr = new StringBuilder(numeroStr).reverse().toString();
        int numeroInvertido = Integer.parseInt(numeroInvertidoStr);
        return numeroInvertido;
    }

    public static boolean esCapicua(int numero){
        int numeroInv = vuelta(numero);
        if (numeroInv == numero){
            return true;
        }else {
            return false;
        }
    }

    public static boolean esPrimo(int numero){

        for (int x = numero - 1; x > 1; x--){
            if (numero % x == 0) {
                return false;
            }
        }
        return true;
    }

    public static int siguientePrimo(int numero){
        numero++;
        while (true){
            esPrimo(numero);
            if (esPrimo(numero)){
                return numero;
            }else {
                numero++;
            }
        }
    }

    public static int anteriorPrimo(int numero){
        numero--;
        while (true){
            esPrimo(numero);
            if (esPrimo(numero)){
                return numero;
            }else {
                numero--;
            }
        }
    }

    public static char digitoN(int numero, int posicion){
        String numeroStr = String.valueOf(numero);

        char[] separados = numeroStr.toCharArray();

        return separados[posicion];
    }

    public static String pegaNumeros(int numero1, int numero2){
        return numero1 + "" + numero2;
    }

    public static String posicionDeDigito(int numeroBase, int instancia){
        String temp = Integer.toString(numeroBase);
        char[] lista = temp.toCharArray();
        for (int x = 0; x < lista.length; x++){
            if (lista[x] == Integer.toString(instancia).charAt(0)){
                return "La primera instancia de " + instancia + " se encuentra en la posicion: " + x;
            }
        }
        return "El numero no esta en la cadena de numeros BASE";
    }

    public static StringBuilder parteNumero(int base, int corteIni, int corteFin){
        String numeros = Integer.toString(base);
        StringBuilder resultado = new StringBuilder();
        char[] sep = numeros.toCharArray();
        for (int x = corteIni; x <= corteFin; x++){
            resultado.append(sep[x]);
        }
        return resultado;
    }

    public static String kaprekar(int numero){
        int numero2 = numero * numero;
        String numero2Str = Integer.toString(numero2);
        int longMitad = numero2Str.length() / 2 - 1;
        int longitud = numero2Str.length() - 1;
        StringBuilder primeraMitad = parteNumero(numero2,0,longMitad);
        StringBuilder segundaMitad = parteNumero(numero2,longMitad + 1,longitud);

        Integer.valueOf(String.valueOf(segundaMitad));
        if (Integer.valueOf(String.valueOf(primeraMitad)) + Integer.valueOf(String.valueOf(segundaMitad)) == numero && primeraMitad.length() == segundaMitad.length()){
            return "Este numero es Kaprekar";
        }
        return "Este numero NO es Kaprekar";
    }
}
