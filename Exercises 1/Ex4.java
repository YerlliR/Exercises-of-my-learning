public class Ex4 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        int c = -5;


        int resultado1 = a + b + c;
        System.out.println("a + b + c = " + resultado1);


        int resultado2 = 2 * b + 3 * (a - c);
        System.out.println("2 * b + 3 * (a - c) = " + resultado2);


        double resultado3 = (double) a / b;
        System.out.println("a / b = " + resultado3);


        int resultado4 = a % b;
        System.out.println("a % b = " + resultado4);


        double resultado5 = (double) a / c;
        System.out.println("a / c = " + resultado5);


        int resultado6 = a % c;
        System.out.println("a % c = " + resultado6);


        double resultado7 = (double) (a * b) / c;
        System.out.println("a * b / c = " + resultado7);


        double resultado8 = a * ((double) b / c);
        System.out.println("a * (b / c) = " + resultado8);


        int resultado9 = (a * c) % b;
        System.out.println("a * c % b = " + resultado9);


        int numerador = (a - 3 * b) % (c + 2 * a);
        int denominador = a - c;
        double resultado10 = (double) numerador / denominador;
        System.out.println("(a - 3 * b) % (c + 2 * a) / (a - c) = " + resultado10);


        int resultado11 = a - b - c * 2;
        System.out.println("a - b - c * 2 = " + resultado11);
    }
}
