//Soy consciente de que podria haberme ahorrado mas codigo pero me he dado cuenta mientras lo hacia intentare aplicarlo para la siguiente :)
//Soy consciente de que podria haberme ahorrado mas codigo pero me he dado cuenta mientras lo hacia intentare aplicarlo para la siguiente :)
//Soy consciente de que podria haberme ahorrado mas codigo pero me he dado cuenta mientras lo hacia intentare aplicarlo para la siguiente :)
//Soy consciente de que podria haberme ahorrado mas codigo pero me he dado cuenta mientras lo hacia intentare aplicarlo para la siguiente :)
//Soy consciente de que podria haberme ahorrado mas codigo pero me he dado cuenta mientras lo hacia intentare aplicarlo para la siguiente :)


package libreria;

import java.util.*;

public class FNumDAW {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

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

    public static void primosAMil(){
        for(int x = 1; x < 1001; x = siguientePrimo(x)){
            if (siguientePrimo(x) > 1000 ){
                System.out.println("Estos son todos los primos entre 1 y 1000");
                System.exit(0);
            }
            int numerosPrimos = siguientePrimo(x);
            System.out.println(numerosPrimos);
        }
    }

    public static void capicuaANueve(){
        for(int i = 1000; i < 9999; i++){
            if (esCapicua(i)){
                System.out.println(i);
            }
        }
    }

    public static void primoMenorDePalabra(int repeticiones){
        int[] acabadoPrint = new int[repeticiones];

        for (int i  = 0; i < repeticiones; i++ ){

            String palabra = scanner.next();
            char[] separado = palabra.toCharArray();
            int ascii = 0;

            for (int x = 0; x < separado.length; x++) {
                ascii = ascii + (int) separado[x];
            }
            acabadoPrint[i] = ascii;
        }

        for (int i = 0; i < repeticiones; ++i){
            System.out.println(acabadoPrint[i]);
        }

    }

    public static int[] generaArrayInt(int tamanyoArray, int min, int max, String imprimir){
        int[] randomArray = new int[tamanyoArray];

        for (int x = 0; x < tamanyoArray; x++){
            randomArray[x] = random.nextInt(max - min + 1) + min;
        }

        if (imprimir.equalsIgnoreCase("Si")){
            imprimirArray(tamanyoArray,randomArray);
        }
        return randomArray;

    }

    public static void imprimirArray(int tamanyoArray, int[] randomArray){
        for (int x = 0 ; x < tamanyoArray; x++){
            System.out.print(randomArray[x] + ", ");
        }
        System.out.println();
    }

    public static void minimoArrayInt(int tamanyoArray, String randomArraySiNo){

        int menor = 2147483647;

        if (randomArraySiNo.equalsIgnoreCase("Si")){
            int[] arraysNums = new int[tamanyoArray];
            for (int x = 0; x < tamanyoArray; x++){
                System.out.println("Dime la posicion " + x + " de la array");
                arraysNums[x] = scanner.nextInt();

                menor = arraysNums[0];

                for (int i = 0 ; i < tamanyoArray; i++){
                    if (menor > arraysNums[i]){
                        menor = arraysNums[i];
                    }
                }
            }

        }else {

            System.out.println("Dime el numero mas pequeño que quieres que se almacenen en la array");
            int randomMin = scanner.nextInt();

            System.out.println("Dime el numero mas grande que quieres que se almacenen en la array");
            int randomMax = scanner.nextInt();

            System.out.println("Quieres imprimir la array?");
            String imprimir = scanner.next();

            int[] arrayGenerada = generaArrayInt(tamanyoArray, randomMin, randomMax, imprimir);

            menor = arrayGenerada[0];

            for (int i = 0 ; i < tamanyoArray; i++){
                if (menor > arrayGenerada[i]){
                    menor = arrayGenerada[i];
                }
            }
        }

        System.out.println("El numero mas pequeño de la array es: " + menor);

    }

    public static void maximoArrayInt(int tamanyoArray, String randomArraySiNo){

        int mayor = -2147483648;

        if (randomArraySiNo.equalsIgnoreCase("Si")){
            int[] arraysNums = new int[tamanyoArray];
            for (int x = 0; x < tamanyoArray; x++){
                System.out.println("Dime la posicion " + x + " de la array");
                arraysNums[x] = scanner.nextInt();

                mayor = arraysNums[0];

                for (int i = 0 ; i < tamanyoArray; i++){
                    if (mayor < arraysNums[i]){
                        mayor = arraysNums[i];
                    }
                }
            }

        }else {

            System.out.println("Dime el numero mas pequeño que quieres que se almacenen en la array");
            int randomMin = scanner.nextInt();

            System.out.println("Dime el numero mas grande que quieres que se almacenen en la array");
            int randomMax = scanner.nextInt();

            System.out.println("Quieres imprimir la array?");
            String imprimir = scanner.next();

            int[] arrayGenerada = generaArrayInt(tamanyoArray, randomMin, randomMax, imprimir);

            mayor = arrayGenerada[0];

            for (int i = 0 ; i < tamanyoArray; i++){
                if (mayor < arrayGenerada[i]){
                    mayor = arrayGenerada[i];
                }
            }
        }

        System.out.println("El numero mas pequeño de la array es: " + mayor);
    }

    public static void mediaArrayInt(int tamanyoArray, String randomArraySiNo){

        if (randomArraySiNo.equalsIgnoreCase("Si")){
            int[] arraysNums = new int[tamanyoArray];

            for (int x = 0; x < tamanyoArray; x++){
                System.out.println("Dime la posicion " + x + " de la array");
                arraysNums[x] = scanner.nextInt();
            }

            System.out.println("La media de la array es: " + sacarMedia(arraysNums));
        }else {

            System.out.println("Dime el numero mas pequeño que quieres que se almacenen en la array");
            int randomMin = scanner.nextInt();

            System.out.println("Dime el numero mas grande que quieres que se almacenen en la array");
            int randomMax = scanner.nextInt();

            System.out.println("Quieres imprimir la array?");
            String imprimir = scanner.next();

            int[] arrayGenerada = generaArrayInt(tamanyoArray, randomMin, randomMax, imprimir);
            System.out.println("La media de la array es: " + sacarMedia(arrayGenerada));
        }


    }

    public static int sacarMedia(int[] datos){
        int numeroFinalizado = 0;
        for (int i = 0; i < datos.length; i++){
            numeroFinalizado = numeroFinalizado + datos[i];
        }
        numeroFinalizado = numeroFinalizado / datos.length;
        return numeroFinalizado;
    }

    public static void estaEnArrayInt(int tamanyoArray, String randomArraySiNo, int numeroABuscar){


        if (randomArraySiNo.equalsIgnoreCase("Si")){
            int[] arraysNums = new int[tamanyoArray];

            for (int x = 0; x < tamanyoArray; x++){
                System.out.println("Dime la posicion " + x + " de la array");
                arraysNums[x] = scanner.nextInt();
            }
            System.out.println(buscaBusca(arraysNums,numeroABuscar,true));
        }else {

            System.out.println("Dime el numero mas pequeño que quieres que se almacenen en la array");
            int randomMin = scanner.nextInt();

            System.out.println("Dime el numero mas grande que quieres que se almacenen en la array");
            int randomMax = scanner.nextInt();

            System.out.println("Quieres imprimir la array?");
            String imprimir = scanner.next();

            int[] arrayGenerada = generaArrayInt(tamanyoArray, randomMin, randomMax, imprimir);
            System.out.println(buscaBusca(arrayGenerada,numeroABuscar,true));
        }

    }

    public static String buscaBusca(int[] enteros, int numerABuscar, boolean resultado){
        for (int x = 0 ; x < enteros.length; x++){
            if (numerABuscar == enteros[x]){
                if (resultado){
                    return "Este numero se encuentra en la array";
                }else {
                    return "El numero: " + numerABuscar + " se encuentra en la posicion: " + x ;
                }

            }
        }
        return "NO esta este numero en la array";
    }

    public static void posicionEnArray(int tamanyoArray, String randomArraySiNo, int numeroABuscar){


        if (randomArraySiNo.equalsIgnoreCase("Si")){
            int[] arraysNums = new int[tamanyoArray];

            for (int x = 0; x < tamanyoArray; x++){
                System.out.println("Dime la posicion " + x + " de la array");
                arraysNums[x] = scanner.nextInt();
            }
            System.out.println(buscaBusca(arraysNums,numeroABuscar,true));
        }else {

            System.out.println("Dime el numero mas pequeño que quieres que se almacenen en la array");
            int randomMin = scanner.nextInt();

            System.out.println("Dime el numero mas grande que quieres que se almacenen en la array");
            int randomMax = scanner.nextInt();

            System.out.println("Quieres imprimir la array?");
            String imprimir = scanner.next();

            int[] arrayGenerada = generaArrayInt(tamanyoArray, randomMin, randomMax, imprimir);
            System.out.println(buscaBusca(arrayGenerada,numeroABuscar,true));
        }

    }

    public static void volteaArrayInt(int tamanyoArray, String randomArraySiNo){


        if (randomArraySiNo.equalsIgnoreCase("Si")){
            int[] arraysNums = new int[tamanyoArray];

            for (int x = 0; x < tamanyoArray; x++){
                System.out.println("Dime la posicion " + x + " de la array");
                arraysNums[x] = scanner.nextInt();
            }
            System.out.println("Esta es la array volteada: ");
            imprimirArray(tamanyoArray, rotarArray(arraysNums));

        }else {

            System.out.println("Dime el numero mas pequeño que quieres que se almacenen en la array");
            int randomMin = scanner.nextInt();

            System.out.println("Dime el numero mas grande que quieres que se almacenen en la array");
            int randomMax = scanner.nextInt();

            System.out.println("Quieres imprimir la array?");
            String imprimir = scanner.next();

            int[] arrayGenerada = generaArrayInt(tamanyoArray, randomMin, randomMax, imprimir);

            System.out.println("Esta es la array volteada: ");
            imprimirArray(tamanyoArray, rotarArray(arrayGenerada));
        }

    }

    public static int[] rotarArray(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }


    public static int ordenarNumeroMayorMenor(int numero){
        String numeroStr = Integer.toString(numero);
        int longitud = numeroStr.length();

        int[] array = new int[longitud];
        int[] arrayOrdenadita = new int[longitud];


        for (int i = 0; i < longitud; i++) {
            array[i] = Character.getNumericValue(numeroStr.charAt(i));
        }

        for (int x = 0; x < longitud; x ++){
            arrayOrdenadita[x] = numeroMayorArr(array);
            array[buscameEsta(array, numeroMayorArr(array))] = 0;

        }
        return fusionarArrayEnNumero(arrayOrdenadita);
    }


    public static int ordenarNumeroMenorMayor(int numero){

        String numeroStr = Integer.toString(numero);
        int longitud = numeroStr.length();

        int[] array = new int[longitud];
        int[] arrayOrdenadita = new int[longitud];


        for (int i = 0; i < longitud; i++) {
            array[i] = Character.getNumericValue(numeroStr.charAt(i));
        }

        for (int x = 0; x < longitud; x ++){
            arrayOrdenadita[x] = numeroMenorArr(array);
            array[buscameEsta(array, numeroMenorArr(array))] = 2147483647;

        }
        return fusionarArrayEnNumero(arrayOrdenadita);

    }


    public static int fusionarArrayEnNumero(int[] array) {
        StringBuilder fusionado = new StringBuilder();

        for (int elemento : array) {
            fusionado.append(elemento);
        }

        // Convertir el StringBuilder a un entero
        return Integer.parseInt(fusionado.toString());
    }



    public static String constanteKaprekar(int numero){

        if (   (numero == 0000 || numero == 1111 ||
                numero == 2222 || numero == 3333 ||
                numero == 4444 || numero == 5555 ||
                numero == 6666 || numero == 7777 ||
                numero == 8888 || numero == 9999) &&
                (Integer.toString(numero).length() != 4)
        ){

            System.out.println("Introduce un valor valido");
            System.exit(0);

        }


        int numeroMagico = numero;
        int numeroMayMen;
        int numeroMenMay;
        int cont = 0;
        while(numeroMagico != 6174){
            cont++;
            numeroMayMen = ordenarNumeroMayorMenor(numeroMagico);
            numeroMenMay = ordenarNumeroMenorMayor(numeroMagico);
            numeroMagico = numeroMayMen - numeroMenMay;
        }

        return "Ha nencesitado " + cont + " para llegar al numero " + numeroMagico + " " +kaprekar(numero);


    }




    public static int numeroMayorArr(int[] arraysNums){
        int mayor = -2147483648;

        for (int i = 0 ; i < arraysNums.length; i++){
            if (mayor < arraysNums[i]){
                mayor = arraysNums[i];
            }
        }

        return mayor;
    }


    public static int numeroMenorArr(int[] arraysNums){

        int menor = 2147483647;

        for (int i = 0 ; i < arraysNums.length; i++){
            if (menor > arraysNums[i]){
                menor = arraysNums[i];
            }
        }
        return menor;

    }



    public static int buscameEsta(int[] enteros, int numerABuscar){
        for (int x = 0 ; x < enteros.length; x++){
            if (numerABuscar == enteros[x]){
                return  x ;
            }
        }
        return 0;
    }
}