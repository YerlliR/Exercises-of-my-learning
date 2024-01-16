package Exercises9;

import java.util.Scanner;

public class AgendaDeEmergencia {
    static Scanner scanner = new Scanner(System.in);
    static String[][] listaEmergencia = new String[20][2];

    public static String[][] llenaArray( String[][] listaEmergencia){
        listaEmergencia[0][0] = "Nombre:         ";
        listaEmergencia[0][1] = "Numero de telefono:";
        for (int i = 1; i < 20; i++){
            for (int x = 0 ; x < 2; x++){
                listaEmergencia[i][x] = "-                         ";
            }
        }
        return listaEmergencia;
    }

    public static int menu( int numero){

        int eleccion = scanner.nextInt();

        System.out.print("\033[H\033[2J");

        switch (eleccion){

            case 1:
                crearNuevoContacto(listaEmergencia, numero);
                numero++;

            case 2:
                editarContacto(listaEmergencia);
            case 3:
                buscarContacto(listaEmergencia);
            case 4:
                mostrarListaDeEmergencia(listaEmergencia);
            case 5:
                System.exit(0);

        }
        return numero;
    }


    public static String[][] crearNuevoContacto(String[][] listaEmergencia, int numero){
        System.out.println("Dime el nombre del contato");
        listaEmergencia[numero][0] = scanner.next() + "                   ";
        System.out.println("Dime el numero de telefono del contacto");
        listaEmergencia[numero][1] =  scanner.next() ;

        return listaEmergencia;
    }

    public static String[][] editarContacto(String[][] listaEmergencia){
        System.out.println("Dime el nombre del contato que quieres editar");
        String nombre = scanner.next();
        for (int i = 0; i < 20; i++){
            if (nombre.equalsIgnoreCase(listaEmergencia[i][0])){
                System.out.println("Dime el nuevo nombre que le quieres poner a este contacto");
                listaEmergencia[i][0]=scanner.next();

                System.out.println("Dime el nuevo numero que le quieres poner a este contacto");
                listaEmergencia[i][1]=scanner.next();
                return listaEmergencia;
            }
        }
        return listaEmergencia;

    }

    public static String buscarContacto(String[][] listaEmergencia){
        System.out.println("Dime el nombre del contato");
        String nombre = scanner.next();
        for (int i = 0; i < 20; i++){
            if (nombre.equalsIgnoreCase(listaEmergencia[i][0])){
                return "El contato que estas buscando se encuentra en la linia numero" + i;
            }
        }
        return "El contato no se encuentra en la agenda";
    }

    public static void mostrarListaDeEmergencia(String[][] listaEmergencia){
        for (int i = 0; i < 20; i++){
            System.out.print(i + ". ");
            for (int x = 0 ; x < 2; x++){
                System.out.print(listaEmergencia[i][x]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int numero = 1;
        llenaArray(listaEmergencia);
        while (true){
            System.out.print("\033[H\033[2J");

            System.out.println("1. Crear Nuevo Contacto");
            System.out.println("2. Editar Contacto");
            System.out.println("3. Buscar Contacto");
            System.out.println("4. Mostrar lista de emergencia");
            System.out.println("5. Salir");
            numero = menu(numero);
        }

    }
}
