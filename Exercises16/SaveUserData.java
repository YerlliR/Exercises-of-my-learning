import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveUserData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ESCRIBE \"PIMPOLLO\" PARA SALIR DEL PROGRAMA");
        String usuario = "";
        String contra = "";
        while (true) {
            System.out.print("Usuario: ");
            usuario = scanner.nextLine();
            if (usuario.equals("PIMPOLLO")) System.exit(0);

            System.out.print("Contraseña: ");
            contra = scanner.nextLine();
            if (contra.equals("PIMPOLLO")) System.exit(0);

            try (FileWriter escritor = new FileWriter("usuariosInfo.txt", true);
                 BufferedWriter escritorFormato = new BufferedWriter(escritor)) {

                escritorFormato.write(usuario + ":" + contra);
                escritorFormato.newLine();

                System.out.println("Todo bien manito.");

            } catch (IOException e) {
                System.out.println("ErRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRROR!!!!: " + e.getMessage());
            }
        }
    }
}
