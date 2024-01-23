package Exercises12;

import java.util.Scanner;

public class EstimacionSaldos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cantidad de casos de prueba
        int casosPrueba = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea

        for (int caso = 0; caso < casosPrueba; caso++) {
            // Leer el saldo inicial y el número de movimientos
            int saldoInicial = scanner.nextInt();
            int numMovimientos = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            // Inicializar saldos mensuales
            int[] saldosMensuales = new int[12];
            saldosMensuales[0] = saldoInicial;

            // Procesar cada movimiento y actualizar saldos mensuales
            for (int i = 0; i < numMovimientos; i++) {
                String[] movimiento = scanner.nextLine().split(" ");
                String fecha = movimiento[0];
                int monto = Integer.parseInt(movimiento[1]);
                int mes = Integer.parseInt(fecha.split("-")[1]) - 1;

                if (movimiento[1].charAt(0) == '+') {
                    saldosMensuales[mes] += monto;
                } else {
                    saldosMensuales[mes] -= monto;
                }
            }

            // Calcular saldos finales de cada mes
            for (int i = 1; i < 12; i++) {
                saldosMensuales[i] += saldosMensuales[i - 1];
            }

            // Imprimir la salida
            for (int saldoFinal : saldosMensuales) {
                System.out.print(saldoFinal + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
