public class Cafetera {

    // VARIABLES
    private int capacidad_max;
    private int capacidad_actual;


    // CONSTRUCTORES
    public Cafetera() {
        this.capacidad_max = 1000;
        this.capacidad_actual = 0;
    }

    public Cafetera(int capacidad_max) {
        this.capacidad_max = capacidad_max;
        this.capacidad_actual = capacidad_max;
    }

    public Cafetera(int capacidad_max, int capacidad) {
        this.capacidad_max = capacidad_max;
        if (capacidad > capacidad_max){
            this.capacidad_actual = capacidad_max;
        }else {
            this.capacidad_actual = capacidad;
        }
    }


    // GETERS Y SETTERS
    public int getCapacidad_max() {
        return capacidad_max;
    }

    public void setCapacidad_max(int capacidad_max) {
        this.capacidad_max = capacidad_max;
    }

    public int getCapacidad_actual() {
        return capacidad_actual;
    }

    public void setCapacidad_actual(int capacidad_actual) {
        this.capacidad_actual = capacidad_actual;
    }


    // FUNCIONES

    public int llenarCafetera(){
        return capacidad_actual = capacidad_max;
    }

    public int servirTaza (int cantidadDeCafeEnTaza){
        if (cantidadDeCafeEnTaza > capacidad_actual){
            System.out.println("No queda suficiente cafe en la cafetera pero su cafe se ha llenado con una capacidad de " + capacidad_actual);
            cantidadDeCafeEnTaza = capacidad_actual;
            capacidad_actual = 0;
        }else {
            capacidad_actual = capacidad_actual - cantidadDeCafeEnTaza;
            System.out.println("Su cafe se ha llenado al completo");
        }

        return capacidad_actual;
    }

    public int vaciarCafetera(){
        return capacidad_actual = 0;
    }

    public int agregaCafe(int cafeAnyadido){
        return capacidad_actual = capacidad_actual + cafeAnyadido;
    }
}
