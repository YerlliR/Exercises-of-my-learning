import java.util.Scanner;

public class EstimacionSaldos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la cantidad inicial y el número de movimientos bancarios (separados por espacio):");
        String[] inicio = scanner.nextLine().split(" ");
        int cantidadInicial = Integer.parseInt(inicio[0]);
        int numMovimientos = Integer.parseInt(inicio[1]);

        int[] saldos = new int[12];
        saldos[0] = cantidadInicial;

        for (int i = 0; i < numMovimientos; i++) {
            System.out.println("Dime la fecha (DD-MM), la cantidad y el concepto (separados por espacio):");
            String[] movimiento = scanner.nextLine().split(" ");
            String[] fecha = movimiento[0].split("-");
            int dia = Integer.parseInt(fecha[0]);
            int mes = Integer.parseInt(fecha[1]);
            int cantidad = Integer.parseInt(movimiento[1]);

            int indiceMes = mes - 1;

            if (cantidad > 0) {
                saldos[indiceMes] += cantidad;
            } else {
                if (indiceMes >= i) {
                    saldos[indiceMes] += cantidad;
                }
            }
        }

        System.out.println("Saldo al final de cada mes:");
        for (int saldo : saldos) {
            System.out.print(saldo + " ");
        }
    }
}
