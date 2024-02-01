package Exercises13.Pizza;

public class Pizza {
    protected String tamanyo;
    protected String tipo;
    protected String estado;
    protected static int pizzasPedidas = 0;
    protected static int pizzasServidas = 0;

    public Pizza(String tamanyo, String tipo, String estado) {
        this.tamanyo = tamanyo;
        this.tipo = tipo;
        this.estado = estado;
    }

    public Pizza(String tamanyo, String tipo) {
        this.tamanyo = tamanyo;
        this.tipo = tipo;
        estado = "pedida";
        pizzasPedidas++;
    }


    public String getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(String tamanyo) {
        this.tamanyo = tamanyo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public static int getPizzasPedidas() {
        return pizzasPedidas;
    }

    public void setPizzasPedidas(int pizzasPedidas) {
        Pizza.pizzasPedidas = pizzasPedidas;
    }

    public static int getPizzasServidas() {
        return pizzasServidas;
    }

    public void setPizzasServidas(int pizzasServidas) {
        Pizza.pizzasServidas = pizzasServidas;
    }

    @Override
    public String toString() {
        return "pizza " + tipo + " " + tamanyo + ", " + estado;
    }

    public void servir(){
        if (this.estado.equalsIgnoreCase("servida")){
            System.out.println("Esta pizza ya esta servida");
        }else {
            this.estado = "servida";
            pizzasServidas++;
        }


    }
}
