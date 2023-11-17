package Exercises7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int eleccion;
        boolean continuacion = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println(FNumDAW.esPrimo(7));
        System.out.println("Esta es la lista de mini porgramas que tenemos:");
        System.out.println( "1.  Calculoar potencias                 \n" +
                            "2.  Contar longitud de numeros          \n" +
                            "3.  Voltear un numero                   \n" +
                            "4.  Saber si un numero es capicua       \n" +
                            "5.  Numero primo                        \n" +
                            "6.  Siguiente primo                     \n" +
                            "7.  Anterior primo                      \n" +
                            "8.  Extraccion de posicion de un numero \n" +
                            "9.  Busca numeros                       \n" +
                            "10. Trozo de numero                     \n" +
                            "11. Juntar dos numeros                  \n" +
                            "12. Kaprekar                            \n"
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
            }
        }
    }
}