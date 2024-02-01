package Exercises13.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza p1 = new Pizza( "mediana", "margarita");
        Pizza p2 = new Pizza("familiar", "funghi");
        p2.servir();
        Pizza p3 = new Pizza("mediana", "cuatro quesos");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.servir();
        System.out.println("pedidas: " + Pizza.getPizzasPedidas());
        System.out.println("servidas: " + Pizza.getPizzasServidas());
    }



}
