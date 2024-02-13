package Exercises13.Vehiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();

        int opcion;
        do {
            System.out.println("VEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda en bicicleta");
            System.out.println("2. Anda en coche");
            System.out.println("3. Ver kilometraje de la bicicleta");
            System.out.println("4. Ver kilometraje del coche");
            System.out.println("5. Ver kilometraje total");
            System.out.println("6. Ver vehículos totales");
            System.out.println("7. Salir");
            System.out.print("Elige una opción (1-7): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos kilómetros desea recorrer en bicicleta? ");
                    int kmBicicleta = scanner.nextInt();
                    bicicleta.andar(kmBicicleta);
                    break;
                case 2:
                    System.out.print("¿Cuántos kilómetros desea recorrer en coche? ");
                    int kmCoche = scanner.nextInt();
                    coche.andar(kmCoche);
                    break;
                case 3:
                    System.out.println("Kilometraje de la bicicleta: " + bicicleta.getKilometrosRecorridos() + " kilómetros.");
                    break;
                case 4:
                    System.out.println("Kilometraje del coche: " + coche.getKilometrosRecorridos() + " kilómetros.");
                    break;
                case 5:
                    System.out.println("Kilometraje total de todos los vehículos: " + Vehiculo.getKilometrosTotales() + " kilómetros.");
                    break;
                case 6:
                    System.out.println("Cantidad de bicicletas: " + Bicicleta.getCantidadBicicletas());
                    System.out.println("Cantidad de coches: " + Coche.getCantidadCoches());
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción del 1 al 7.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}
