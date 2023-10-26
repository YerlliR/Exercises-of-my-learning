
public class Ex3 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double diam = 15.5;
        double altura = 42.4;


        System.out.println("Pi = " + pi);
        System.out.println("diam = " + diam);
        System.out.println("altura = " + altura);


        System.out.println("El area calculada es : " + (((2 * pi * (diam/2)) * altura)) + "cm" );
        System.out.println("El volumen calculado es: " + ( ((pi * (diam/2)) * (pi * (diam/2)))) + "cm");
    }
}
