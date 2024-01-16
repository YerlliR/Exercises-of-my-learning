import java.util.ArrayList;
import java.util.Scanner;


public class Ex1{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ArrayList<String> lista = new ArrayList<String>();

        while (true) {

            System.out.print("cuantos numeros quieres ingresar? ");
            int cantidadNumeros = scanner.nextInt();

            if (cantidadNumeros == 0) {
                break;
            }

            System.out.print("Ingresa la cantidad de numeros que ha dicho anterior");
            int[] numeros = new int[cantidadNumeros];

            for (int i = 0; i < cantidadNumeros; i++) {
                numeros[i] = scanner.nextInt();
            }


            boolean estaOrdenado = true;

            for (int i = 0; i < cantidadNumeros - 1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    estaOrdenado = false;
                    break;
                }
            }

            if (estaOrdenado) {
                lista.add("SI");
            } else {
                lista.add("NO");
            }

        }

        for (String cadena : lista){
            System.out.println(cadena);
        }

    }
}
