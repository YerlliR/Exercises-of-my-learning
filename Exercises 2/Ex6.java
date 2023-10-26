
public class Ex7 {
    public static void main(String[] args) {

        String nombreCompleto = "Sergio Ricart Alabau";

        int primerEspacio = nombreCompleto.indexOf(" ");
        int segundoEspacio = nombreCompleto.indexOf(" ", primerEspacio + 1);

        String nombre = nombreCompleto.substring(0, primerEspacio);
        String apellido1 = nombreCompleto.substring(primerEspacio + 1, segundoEspacio);
        String apellido2 = nombreCompleto.substring(segundoEspacio + 1);
        
        int longitudNombre = nombre.length();
        int longitudApellido1 = apellido1.length();
        int longitudApellido2 = apellido2.length();

        System.out.println("Nombre: " + nombre + ", Longitud: " + longitudNombre);
        System.out.println("Apellido1: " + apellido1 + ", Longitud: " + longitudApellido1);
        System.out.println("Apellido2: " + apellido2 + ", Longitud: " + longitudApellido2);
    }
}
