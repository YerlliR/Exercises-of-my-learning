public class Ex2 {

    public static void main(String[] args) {

        Producto productoEntero  = new Producto("Platano",2,2);
        Producto productoMedio   = new Producto("Manzana",4);
        Producto productoSinNada = new Producto("Pera");

        System.out.println("Información del Producto 1:");
        productoEntero.mostrarInformacion();
        System.out.println("Valor Total: " + productoEntero.calcularValorTotal());

        System.out.println("Información del Producto 2:");
        productoMedio.mostrarInformacion();
        System.out.println("Valor Total: " + productoMedio.calcularValorTotal());

        System.out.println("Información del Producto 3:");
        productoSinNada.mostrarInformacion();
        System.out.println("Valor Total: " + productoSinNada.calcularValorTotal());

    }
    public static class Producto{
        String nombre;
        double precio;
        int  cantidad;


        public Producto(String nombre, double precio) {
            this.nombre   = nombre;
            this.precio   = precio;
            this.cantidad =      0;
        }

        public Producto(String nombre, double precio, int cantidad) {
            this.nombre   =   nombre;
            this.precio   =   precio;
            this.cantidad = cantidad;
        }

        public Producto(String nombre) {
            this.nombre   = nombre;
            this.precio   =      0;
            this.cantidad =      0;
        }

        public double calcularValorTotal() {
            return precio * cantidad;
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: "   +   nombre);
            System.out.println("Precio: "   +   precio);
            System.out.println("Cantidad: " + cantidad);
        }

    }

}
