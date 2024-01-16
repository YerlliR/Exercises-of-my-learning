import java.util.Scanner;

public class Ex4 {
    static Scanner scanner = new Scanner(System.in);
    private static void Forma(){
        String figura;

        System.out.println("Dime cuál es la figura geométrica de la cual que calcule el área y el perímetro");
        System.out.println( "a) Círculo \n" +
                            "b) Cuadrado / Rectángulo\n" +
                            "c) Triangulo \n"
        );

        figura = scanner.next();

        if (
                figura.equalsIgnoreCase("a")       ||
                figura.equalsIgnoreCase("1")       ||
                figura.equalsIgnoreCase("Circulo") ||
                figura.equalsIgnoreCase("Círculo")
        ){
             CalcCirculo();
             
        } else if (
                figura.equalsIgnoreCase("b")          ||
                figura.equalsIgnoreCase("2")          ||
                figura.equalsIgnoreCase("Cuadrado")   ||
                figura.equalsIgnoreCase("Rectángulo") ||
                figura.equalsIgnoreCase("Rectangulo")
        ){
            CalcCuadrado();
        }else if (
                figura.equalsIgnoreCase("c")         ||
                figura.equalsIgnoreCase("3")         ||
                figura.equalsIgnoreCase("Triangulo") ||
                figura.equalsIgnoreCase("Triángulo")
        ){
            CalcTriangulo();
        }

    }

    private static void CalcCirculo(){
        double radio;
        double area;
        double perimetro;


        System.out.println("Dime el radio del círculo del que quieres calcular el área");
        radio = scanner.nextFloat();

        area = Math.PI * Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio;

        System.out.println( "El perímetro del círculo es: " + perimetro + "\n" +
                            "Y el árerea es de: " + area );
    }

    private static void CalcCuadrado(){
        double altura;
        double base;
        double perimetro;
        double area;


        System.out.println("Dime la altura del cuadrado / rectángulo del que quieres calcular el área");
        altura = scanner.nextFloat();
        System.out.println("Dime la base del cuadrado / rectángulo");
        base = scanner.nextFloat();

        area = base * altura;
        perimetro = (base + altura) * 2 ;

        if (base == altura){
            System.out.println( "El perímetro del cuadrado es: " + perimetro + "\n" +
                                "Y el área es de: " + area );
        }
        else {
            System.out.println( "El perímetro del rectángulo es: " + perimetro + "\n" +
                                "Y el área es de: " + area );
        }
    }

    private static void CalcTriangulo(){
        double altura;
        double base;
        double lado1;
        double lado2;
        double area;
        double perimetro;

        System.out.println("Dime la altura del triángulo del que quieres calcular el área");
        altura = scanner.nextFloat();
        System.out.println("Dime la base del triángulo");
        base = scanner.nextFloat();
        System.out.println("Dime la longitud del lado uno");
        lado1 = scanner.nextFloat();
        System.out.println("Dime la longitud del lado dos");
        lado2 = scanner.nextFloat();

        perimetro = lado1 + lado2 + base;
        area = (base * altura) / 2;
        System.out.println( "El perímetro del tiángulo es: " + perimetro + "\n" +
                            "Y el área es de: " + area );

    }

    public static void main(String[] args) {

        Forma();

    }
}
