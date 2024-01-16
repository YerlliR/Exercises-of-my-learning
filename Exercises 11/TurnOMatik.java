package Exercises11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TurnOMatik {
    static Scanner scanner = new Scanner(System.in);
    public static Queue <String> colaSupermercado = new LinkedList<>();

    public static int metodo1(String nombreCliente){
        colaSupermercado.add(nombreCliente);
        return colaSupermercado.size() - 1 ;
    }

    public static String metodo2(){
        return colaSupermercado.poll();
    }

    public static void main(String[] args) {
        int eleccion = 0;

        while (eleccion < 4 ) {
            System.out.print("\033[H\033[2J");
            System.out.println("Esta es la lista de opciones que hay sobre una cola");
            System.out.println( "1. Nuevo cliente ha entrado \n" +
                                "2. Atender al siguiente cliente\n" +
                                "3. Mostrar cola actual\n" +
                                "0. Salir"
            );

            eleccion = scanner.nextInt();

            switch (eleccion) {
                case 0:
                    System.out.println("Chao");
                    System.exit(0);
                    break;

                case 1:
                    System.out.println("Dime tu nombre para añadirte a la cola");
                    String nombreCliente = scanner.next();
                    System.out.println("Tienes " + metodo1(nombreCliente) + " delante tuya");
                    scanner.next();
                    break;

                case 2:
                    System.out.println("El cliente que ha sido atendido ha sido: " + metodo2());
                    scanner.next();
                    break;

                case 3:
                    for (String nombre : colaSupermercado) {
                        System.out.println(nombre);
                    }
                    scanner.next();
                    break;

            }
        }
        System.out.println("Chao");
    }

}
