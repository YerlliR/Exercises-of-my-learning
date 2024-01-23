import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class RepartiendoBotin{
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ArrayList<Queue<Integer>> jefe = new ArrayList<Queue<Integer>>();
        boolean bucle = true ;
        Integer numTot;
        while (bucle == true){
            int NumBill = lectura.nextInt();
            int cont = 0 ;
            int NumAtrac = lectura.nextInt();
            //crear cuentas atracadores
            for (int i = 0; i <NumAtrac;i++){

                Queue<Integer> billetesi = new LinkedList<Integer>();
                jefe.add(billetesi);
            }
            //salir del programa
            if (NumAtrac ==  0){
                bucle = false;
            }
            //Reparte billetes
            for (int i = 0;cont<NumBill;cont++){
                jefe.get(i).add(lectura.nextInt());
                if (i == jefe.size() - 1) {
                    i = 0;
                } else {
                    i++;
                }
            }
            //printear los numeros
            for (int i = 0;i<NumAtrac;i++){
                numTot = 0 ;
                Queue<Integer> billetes1 = new LinkedList<Integer>(jefe.get(i));
                for (Integer num : billetes1) {
                    numTot += num;
                }
                System.out.print(numTot+" : ");
                for (Integer num : billetes1) {
                    System.out.print(num+" ");
                }System.out.println("");
            }
            System.out.println("--");

            jefe.clear();
        }

        lectura.close();

    }
}

