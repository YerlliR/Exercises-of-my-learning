import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GuardarEnArchivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = "";

        System.out.println("Escribe lo que quieras escribir, si quieres salir del programa escribe \"JuanCarlosTerceroDeBorbon\"");

        while (!texto.equalsIgnoreCase("JuanCarlosTerceroDeBorbon")) {
            texto = scanner.nextLine();
            if (!texto.equalsIgnoreCase("JuanCarlosTerceroDeBorbon")) {
                try (FileWriter escritor = new FileWriter("archivoEscritoPorMaquina.txt", true);
                     BufferedWriter escritorFormato = new BufferedWriter(escritor)) {

                    escritorFormato.write(texto);
                    escritorFormato.newLine();

                } catch (IOException e) {
                    System.out.println("Error mano!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!: " + e.getMessage());
                }
            }
        }

        System.out.println("CHAU...");
    }
}