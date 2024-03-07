
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.println("Dime el numerador de tu fraccion");
        int numerador = scanner.nextInt();
        System.out.println("Dime el denominador de tu fraccion");
        int denominador = scanner.nextInt();

        Fraccion fraccionUsuario = new Fraccion(numerador, denominador);

        while (true){
            System.out.print("\033[H\033[2J");
            System.out.println("Dime que opcion quieres realizar");
            System.out.println("1. Invertir Fraccion");
            System.out.println("2. Simplificar Fraccion");
            System.out.println("3. Multiplicar Fraccion");
            System.out.println("4. Dividir Fraccion");
            System.out.println("5. Salir");
            int eleccion = scanner.nextInt();
            switch (eleccion){
                case 1:
                    System.out.println(invertir(fraccionUsuario));
                    scanner.next();
                    break;
                case 2:
                    System.out.println(simplificar(fraccionUsuario));
                    scanner.next();
                    break;
                case 3:
                    System.out.println(multiplicar(fraccionUsuario));
                    scanner.next();
                    break;
                case 4:
                    System.out.println(dividir(fraccionUsuario));
                    scanner.next();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
    public static Fraccion invertir(Fraccion fraccion1){
        int numerador = fraccion1.getDenominador();
        int denominador = fraccion1.getNumerador();
        return fraccion1;

    }

    public static Fraccion simplificar(Fraccion fraccion1){

        int numeroGrande = Math.max(fraccion1.numerador, fraccion1.denominador);
        int numeroMenor = Math.min(fraccion1.numerador, fraccion1.denominador);

        int resultado = 0;
        do {
            resultado = numeroMenor;
            numeroMenor = numeroGrande % numeroMenor;
            numeroGrande = resultado;
        } while (numeroMenor != 0);
        fraccion1.numerador = fraccion1.numerador / resultado;
        fraccion1.denominador = fraccion1.denominador / resultado;

        return fraccion1;
    }

    public static Fraccion multiplicar(Fraccion fraccion1){
        System.out.println("Dime el numerador de la fraccion de la cual lo quieres multiplicar");
        int numerador = scanner.nextInt();
        System.out.println("Dime el denominador de la fraccion de la cual lo quieres multiplicar");
        int denominador = scanner.nextInt();

        Fraccion fracccionMultiplicacion = new Fraccion(numerador,denominador);

        Fraccion fraccionResuelta = new Fraccion(fraccion1.numerador * fracccionMultiplicacion.numerador, fraccion1.denominador * fracccionMultiplicacion.denominador);
        return fraccionResuelta;
    }

    public static Fraccion dividir(Fraccion fraccion1){
        System.out.println("Dime el numerador de la fraccion de la cual lo quieres dividir");
        int numerador = scanner.nextInt();
        System.out.println("Dime el denominador de la fraccion de la cual lo quieres dividir");
        int denominador = scanner.nextInt();

        Fraccion fracccionMultiplicacion = new Fraccion(numerador,denominador);

        Fraccion fraccionResuelta = new Fraccion(fraccion1.numerador * fracccionMultiplicacion.denominador, fraccion1.denominador * fracccionMultiplicacion.numerador);
        return fraccionResuelta;
    }

}
