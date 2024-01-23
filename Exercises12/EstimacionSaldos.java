import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class EstimacionSaldos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Queue<Integer>> colasLadrones = new ArrayList<>();
        
        boolean enEjecucion = true;
        Integer totalBilletes;

        while (enEjecucion) {
            int numBilletes = scanner.nextInt();
            int numLadrones = scanner.nextInt();

            if (numLadrones == 0) {
                enEjecucion = false;
            } else {
                for (int i = 0; i < numLadrones; i++) {
                    Queue<Integer> colaBilletes = new LinkedList<>();
                    colasLadrones.add(colaBilletes);
                }

                int indiceLadron = 0;
                for (int i = 0; i < numBilletes; i++) {
                    colasLadrones.get(indiceLadron).add(scanner.nextInt());
                    indiceLadron = (indiceLadron == colasLadrones.size() - 1) ? 0 : indiceLadron + 1;
                }

                for (int i = 0; i < numLadrones; i++) {
                    totalBilletes = 0;
                    Queue<Integer> colaBilletesLadron = new LinkedList<>(colasLadrones.get(i));

                    for (Integer billete : colaBilletesLadron) {
                        totalBilletes += billete;
                    }

                    System.out.print(totalBilletes + " : ");
                    for (Integer billete : colaBilletesLadron) {
                        System.out.print(billete + " ");
                    }
                    System.out.println("");
                }

                System.out.println("--");

                colasLadrones.clear();
            }
        }

        scanner.close();
    }
}
