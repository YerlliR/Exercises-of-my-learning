package Exercises15;
public class Pieza {
    private String forma;
    private String color;

    public Pieza(String forma, String color) {
        this.forma = forma;
        this.color = color;
    }

    public double area() {
        return 0.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pieza p = (Pieza) o;
        return color.equals(p.color) && forma.equals(p.forma) && Double.compare(area(), p.area()) == 0;
    }


    public static void main(String[] args) {
        Pieza p1 = new Pieza("cuadrado", "rojo");
        Pieza p2 = new Pieza("cuadrado", "rojo");
        Double d = new Double(1.0);
        String k = "Hola";
        boolean b1 = p1.equals(p2);
        boolean b2 = d.equals(k);
        boolean b3 = k.equals(p2);
        boolean b4 = p1.equals(d);

        System.out.println("b1=" + b1);
        System.out.println("b2=" + b2);
        System.out.println("b3=" + b3);
        System.out.println("b4=" + b4);
    }
}
