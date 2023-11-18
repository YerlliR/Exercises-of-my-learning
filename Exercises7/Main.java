//Soy consciente de que podria haberme ahorrado mas codigo pero me he dado cuenta mientras lo hacia intentare aplicarlo para la siguiente :)
//Soy consciente de que podria haberme ahorrado mas codigo pero me he dado cuenta mientras lo hacia intentare aplicarlo para la siguiente :)
//Soy consciente de que podria haberme ahorrado mas codigo pero me he dado cuenta mientras lo hacia intentare aplicarlo para la siguiente :)
//Soy consciente de que podria haberme ahorrado mas codigo pero me he dado cuenta mientras lo hacia intentare aplicarlo para la siguiente :)
//Soy consciente de que podria haberme ahorrado mas codigo pero me he dado cuenta mientras lo hacia intentare aplicarlo para la siguiente :)
package Exercises7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int eleccion;
        boolean continuacion = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println(FNumDAW.esPrimo(7));
        System.out.println("Esta es la lista de mini porgramas que tenemos:");
        System.out.println( "1.  Calculoar potencias                        \n" +
                            "2.  Contar longitud de numeros                 \n" +
                            "3.  Voltear un numero                          \n" +
                            "4.  Saber si un numero es capicua              \n" +
                            "5.  Numero primo                               \n" +
                            "6.  Siguiente primo                            \n" +
                            "7.  Anterior primo                             \n" +
                            "8.  Extraccion de posicion de un numero        \n" +
                            "9.  Busca numeros                              \n" +
                            "10. Trozo de numero                            \n" +
                            "11. Juntar dos numeros                         \n" +
                            "12. Kaprekar                                   \n" +
                            "13. Numeros primos de 1 a 1000                 \n" +
                            "14. Numeros capicua de 1000 a 9999             \n" +
                            "15. Primo menor de palabra en ASCII            \n" +
                            "16. \n" +
                            "17. Generador de arrays                        \n" +
                            "18. Buscar el numero mas pequeño de una array  \n" +
                            "19. Buscar el numero mas grande de una array   \n" +
                            "20. Hacer la media de los numeros de una array \n" +
                            "21. Detector de valor en Array                 \n" +
                            "22. Buscar el numero en Array                  \n" +
                            "19. Voltear Array                              \n"
        );

        while(continuacion){

            System.out.println("Cual quieres probar?");
            eleccion = scanner.nextInt();

            switch (eleccion){

                case 1:

                    System.out.println("Dime la base de la operacion que quieres realizar:");
                    double base = scanner.nextDouble();

                    System.out.println("Dime la base de la operacion que quieres realizar:");
                    int exponente = scanner.nextInt();

                    System.out.println(FNumDAW.potencia(base,exponente));

                    continuacion = FNumDAW.continuacion();
                break;

                case 2:
                    System.out.println("Dime el numero que quieres saber su longitud");
                    int longitudinal = scanner.nextInt();

                    System.out.println(FNumDAW.cuentaDigitos(longitudinal));

                    continuacion = FNumDAW.continuacion();
                break;

                case 3:
                    System.out.println("Dime el numero que quieres darle la vuelta");
                    int aVoltear = scanner.nextInt();

                    System.out.println(FNumDAW.vuelta(aVoltear));

                    continuacion = FNumDAW.continuacion();
                break;

                case 4:
                    System.out.println("Dime el numero que quieres saber si es capicua");
                    int numCap = scanner.nextInt();

                    System.out.println(FNumDAW.esCapicua(numCap));

                    continuacion = FNumDAW.continuacion();
                break;

                case 5:
                    System.out.println("Dime el numero que quieres saber si es primo");
                    int numPrim = scanner.nextInt();

                    System.out.println(FNumDAW.esPrimo(numPrim));

                    continuacion = FNumDAW.continuacion();
                break;

                case 6:
                    System.out.println("Dime el numero del cual quieres saber el siguiente numero primo");
                    int sigPrim = scanner.nextInt();

                    System.out.println(FNumDAW.siguientePrimo(sigPrim));

                    continuacion = FNumDAW.continuacion();
                break;

                case 7:
                    System.out.println("Dime el numero del cual quieres saber el siguiente numero primo");
                    int antPrim = scanner.nextInt();

                    System.out.println(FNumDAW.anteriorPrimo(antPrim));

                    continuacion = FNumDAW.continuacion();
                break;

                case 8:
                    System.out.println("Dime el numero del cual vas a querer extraer una posicion concreta");
                    int num = scanner.nextInt();

                    System.out.println("Dime la posicion del numero que quieres extraer");
                    int posicion = scanner.nextInt();

                    System.out.println(FNumDAW.digitoN(num,posicion));

                    continuacion = FNumDAW.continuacion();
                break;

                case 9:
                    System.out.println("Dime el numero BASE");
                    int numBase = scanner.nextInt();

                    System.out.println("Dime el numero que queires buscar");
                    int instancia = scanner.nextInt();

                    System.out.println(FNumDAW.posicionDeDigito(numBase,instancia));

                    continuacion = FNumDAW.continuacion();
                break;

                case 10:
                    System.out.println("Dime el numero BASE");
                    int numPrincipal = scanner.nextInt();

                    System.out.println("Dime la posicion de inicio donde quieres cortar el numero");
                    int trozoInicio = scanner.nextInt();

                    System.out.println("Dime la posicicion final de donde quieres cortar el numero");
                    int trozoFinal = scanner.nextInt();


                    System.out.println(FNumDAW.parteNumero(numPrincipal,trozoInicio,trozoFinal));

                    continuacion = FNumDAW.continuacion();
                break;

                case 11:
                    System.out.println("Dime el primer numero de los que quieres juntar");
                    int num1 = scanner.nextInt();

                    System.out.println("Dime el segundo numero de los que quieres juntar");
                    int num2 = scanner.nextInt();

                    System.out.println(FNumDAW.pegaNumeros(num1,num2));

                    continuacion = FNumDAW.continuacion();
                break;

                case 12:
                    System.out.println("Dime un numero y te digo si es Kaprekar o no");
                    int numerito = scanner.nextInt();

                    System.out.println(FNumDAW.kaprekar(numerito));

                    continuacion = FNumDAW.continuacion();
                break;

                case 13:
                    System.out.println("Estos son todos los numeros primos de 1 a 1000");

                    FNumDAW.primosAMil();

                    continuacion = FNumDAW.continuacion();
                break;

                case 14:
                    System.out.println("Estos son todos los numeros capicua de 1000 a 9999");

                    FNumDAW.capicuaANueve();

                    continuacion = FNumDAW.continuacion();
                break;

                case 15:
                    System.out.println("Dime cuantas palabras / caracteres vas a querer saber su primo menor en asci");
                    int veces = scanner.nextInt();

                    FNumDAW.primoMenorDePalabra(veces);

                    continuacion = FNumDAW.continuacion();
                break;

                case 16:
                    /*
                    System.out.println("Dime cuantas palabras / caracteres vas a querer saber su primo menor en asci");
                    int veces = scanner.nextInt();

                    FNumDAW.primoMenorDePalabra(veces);

                    continuacion = FNumDAW.continuacion();*/
                break;

                case 17:
                    System.out.println("Dime el tamaño de la array de randoms");
                    int tamanyArray = scanner.nextInt();

                    System.out.println("Dime el numero mas pequeño que quieres que se almacenen en la array");
                    int randomMin = scanner.nextInt();

                    System.out.println("Dime el numero mas grande que quieres que se almacenen en la array");
                    int randomMax = scanner.nextInt();

                    System.out.println("Quieres imprimir la array?");
                    String imprimir = scanner.next();

                    FNumDAW.generaArrayInt(tamanyArray, randomMin, randomMax, imprimir);

                    continuacion = FNumDAW.continuacion();
                break;

                case 18, 19, 20:
                    System.out.println("Dime el tamaño de la array");
                    int tamanyArray2 = scanner.nextInt();

                    System.out.println("Quieres seleccionar tu los numeros de la array ?");
                    String seleccion = scanner.next();

                    if (eleccion == 18){
                        FNumDAW.minimoArrayInt(tamanyArray2,seleccion);
                    } else if (eleccion == 19) {
                        FNumDAW.maximoArrayInt(tamanyArray2, seleccion);
                    } else if (eleccion == 20) {
                        FNumDAW.mediaArrayInt(tamanyArray2, seleccion);
                    }

                    continuacion = FNumDAW.continuacion();
                break;

                case 21, 22:
                    System.out.println("Dime el tamaño de la array");
                    int tamanyArray5 = scanner.nextInt();

                    System.out.println("Quieres seleccionar tu los numeros de la array ?");
                    String seleccion2 = scanner.next();

                    System.out.println("Dime el numero que quieres buscar en la array: ");
                    int numeroBuscar = scanner.nextInt();

                    if (eleccion == 21){
                        FNumDAW.estaEnArrayInt(tamanyArray5, seleccion2, numeroBuscar);
                    } else if (eleccion == 22) {
                        FNumDAW.posicionEnArray(tamanyArray5, seleccion2, numeroBuscar);
                    }


                    continuacion = FNumDAW.continuacion();
                break;

                case 23:
                    System.out.println("Dime el tamaño de la array");
                    int tamanyArray6 = scanner.nextInt();

                    System.out.println("Quieres seleccionar tu los numeros de la array ?");
                    String arrayNoSi = scanner.next();

                    FNumDAW.volteaArrayInt(tamanyArray6, arrayNoSi);

                    continuacion = FNumDAW.continuacion();
                break;

            }
        }
    }
}