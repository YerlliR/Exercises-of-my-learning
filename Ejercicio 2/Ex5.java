
public class Ex5 {
    public static void main(String[] args) {


        String nombreCompleto = "Sergio Ricart Alabau";


        int primerEspacio = nombreCompleto.indexOf(" ");
        int segundoEspacio = nombreCompleto.indexOf(" ", primerEspacio +1);
  


        String nombre = nombreCompleto.substring(0, primerEspacio);
        String apellidos = nombreCompleto.substring(primerEspacio, segundoEspacio);
        String apellidos2 = nombreCompleto.substring(segundoEspacio);

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido1: " + apellidos);
        System.out.println("Apellido2: " + apellidos2);
        
    }
}
