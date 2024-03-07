
abstract class Figura {
    abstract double area();
    abstract double perimetro();
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double area() {
        return Math.PI * radio * radio;
    }

    @Override
    double perimetro() {
        return 2 * Math.PI * radio;
    }
}

class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double area() {
        return lado * lado;
    }

    @Override
    double perimetro() {
        return 4 * lado;
    }
}

class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double area() {
        return (base * altura) / 2;
    }

    @Override
    double perimetro() {
        return 3 * base;

    }

}
