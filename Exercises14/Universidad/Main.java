package Exercises13.Universidad;

public class Main {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Calle Principal", "Ciudad A", "12345", "Pais A");
        Direccion direccion2 = new Direccion("Calle Secundaria", "Ciudad B", "54321", "Pais B");

        Estudiante estudiante1 = new Estudiante("Estudiante", "Uno", "12345678A", 1001);
        Estudiante estudiante2 = new Estudiante("Estudiante", "Dos", "23456789B", 1002);

        Profesor profesor1 = new Profesor("Profesor", "Principal", "34567890C", "Despacho 101");
        Profesor profesor2 = new Profesor("Profesor", "Secundario", "45678901D", "Despacho 102");

        System.out.println("Estudiante 1: " + estudiante1);
        System.out.println("Estudiante 2: " + estudiante2);
        System.out.println("Profesor 1: " + profesor1);
        System.out.println("Profesor 2: " + profesor2);
    }
}
