import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {

    //Objetos
    public static ArrayList <Ex3.Producto> ListaProd = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    //Clase producto con constructores ...
    public static class Producto{
        String nombre;
        double precio;
        int  cantidad;


        public Producto(String nombre, double precio, int cantidad) {
            this.nombre   =   nombre;
            this.precio   =   precio;
            this.cantidad = cantidad;
        }

        public double calcularValorTotal() {
            return precio * cantidad;
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: "   +   nombre);
            System.out.println("Precio: "   +   precio);
            System.out.println("Cantidad: " + cantidad);
        }

        public void precioFinal(){

        }

    }



    public static void main(String[] args) {


        //Declaracion de variables
        String pac;
        int precio;
        int cantidad;
        String eleccion = "Si";


        System.out.println("Hola este programa es la simulacion de una caja de un supermercado:");


        //Bucle hasta que el cliente diga que ya no tiene más compra
        for (int i = 0; eleccion.equalsIgnoreCase("si"); i++){

            //Preguntar al cliente los porductos que lleva en la cesta
            System.out.println("Qué producto has comprado?");
            pac = scanner.next();

            System.out.println("Qué precio tiene ese producto ?");
            precio = scanner.nextInt();

            System.out.println("Cuantos productos de este tipo has cogido?");
            cantidad = scanner.nextInt();

            //Creo un objeto Producto y le asigno los valores anteriores que he recaudado
            Producto productoEntero  = new Producto(pac,precio,cantidad);

            //Lo añado a la ArrayList
            ListaProd.add(productoEntero);

            //Pregunto si lleva más compra antes de mostrar la información de todos los productos para volver a repetir el bucle las veces necesarias
            System.out.println("Llevas más compra ?");
            eleccion = scanner.next();

            // Imprimir la informacion de los productos
            if (!eleccion.equalsIgnoreCase("si")){
                for (int x = 0; x <= i; x++){

                    System.out.println("\nInformación del Producto:");
                    Producto prod = ListaProd.get(x);

                    prod.mostrarInformacion();
                    System.out.println("El coste total de su producto es de: " + productoEntero.calcularValorTotal() + "\n");

                }
            }
        }
    }

}



