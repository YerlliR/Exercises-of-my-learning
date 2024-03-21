
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File archivo = new File("SAC.bin");

        //hashmap de la lista
        HashMap<String, Elem1> lista = new HashMap<>();

        int op;

        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);

            do {
                try {
                    boolean cp = true;

                    while (cp) {
                        Elem1 meterdatos = (Elem1)ois.readObject();
                        String nombre = meterdatos.getOBJECT();
                        lista.put(nombre, meterdatos);
                    }
                } catch (EOFException e) {
                    System.out.println("err");
                }
                System.out.println( 
                        "OPCIONES:                                                  \n " +
                        "1.Nombre del objeto                                        \n " +
                        "2.Objetos por constelacion                                 \n " +
                        "3.Objetos por magnitud                                     \n " +
                        "4.Salir                                                    \n "
                );

                System.out.println("Dime un numero del 1 al 4, ambos números incluídos.");

                try {
                    String opcion = sc.nextLine();
                    op = Integer.parseInt(opcion);

                    switch (op) {
                        case 1:
                            System.out.println("Introduce el nombre del objeto: ");
                            String nombreobjeto = sc.nextLine().replaceAll(" ", "");

                            for(Elem1 elem1 : lista.values()) {
                                if(elem1.getOBJECT().equals(nombreobjeto)){
                                    elem1.printdatos();
                                }
                            }
                            continue;

                        case 2:
                           
                            System.out.println("Introduce el nombre de la constelación: ");
                            String constelacion = sc.nextLine();
                            boolean seguir = false;

                            for(Elem1 elem1 : lista.values()) {
                                if(elem1.getCON().equals(constelacion)){
                                    elem1.printdatos();
                                    seguir = true;
                                }
                            }
                            if (!seguir) {
                                System.out.println("No se ha encontado la constelacion" + constelacion);
                            }
                            continue;

                        case 3:
                        
                            Double magnitud;
                            System.out.println("¿Que magnitud buscas?");
                            magnitud = sc.nextDouble();

                            for(Elem1 elem1 : lista.values()) {
                                Double magnitud2 = Double.parseDouble(elem1.getMAG());

                                if(magnitud2 <= magnitud){
                                    elem1.printdatos();
                                }
                            }
                            sc.nextLine();
                            continue;

                        case 4:
                            System.out.println("CHAUUU");
                            continue;

                        default:
                            System.out.println("tiene que ser un número entre el 1 y el 4");
                            continue;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("dime un número del 1 al 4.");
                    op = 0;
                }

            } while (op != 4);

        } catch (Exception e) {
            System.out.println("ERROR "+e.getMessage());
        }
    }
}