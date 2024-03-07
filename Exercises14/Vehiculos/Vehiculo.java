package Exercises13.Vehiculos;

class Vehiculo {
    protected static int kilometrosTotales = 0;
    protected int kilometrosRecorridos;

    public Vehiculo() {
        this.kilometrosRecorridos = 0;
    }

    public void andar(int km) {
        kilometrosTotales += km;
        this.kilometrosRecorridos += km;
        System.out.println("Has recorrido " + km + " kilómetros.");
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }
}

class Coche extends Vehiculo {
    private static int cantidadCoches = 0;

    public Coche() {
        super();
        cantidadCoches++;
    }

    public static int getCantidadCoches() {
        return cantidadCoches;
    }
}

class Bicicleta extends Vehiculo {
    private static int cantidadBicicletas = 0;

    public Bicicleta() {
        super();
        cantidadBicicletas++;
    }

    public static int getCantidadBicicletas() {
        return cantidadBicicletas;
    }
}

