import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){

        int[] lista;
        int num;
        int temporal;

        Scanner scanner = new Scanner(System.in);
        lista = new int[15];

        for (int i = 0; i < lista.length; i++){
            System.out.println("Dime el numero " + i + " que quieres almacenar");
            num = scanner.nextInt();
            lista[i] = num;
        }

        temporal = lista[14];

        for (int x = 14; x >= 1; x-- ){
            lista[x] = lista[x - 1];
        }

        lista [0] = temporal;

        for(int x = 0; x <= lista.length - 1; x++){
            System.out.println( "Este es el nuevo orden de la array");
            System.out.println(lista[x]);
        }
    }
}


