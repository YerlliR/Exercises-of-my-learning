import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class VerificarUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificador de usuario y contraseña");

        System.out.println("Usuario:");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese la contraseña:");
        String contraseña = scanner.nextLine();

        if (verificarCredenciales(usuario, contraseña)) {
            System.out.println("Usuario y contraseña CORRECTOOOOOOOOO!!!");
        } else {
            System.out.println("USUARIO O CONTRASEÑA ERRRRRRRRRRRRRRRRRRRRRRRRRRRROOOOOOOOONEOOOOOO!.");
        }
    }

    public static boolean verificarCredenciales(String usuario, String contraseña) {
        //Gines pon aqui el archivo que quieras mirar
        String archivo = "usuariosInfo.txt";

        try (
                BufferedReader lector = new BufferedReader(new FileReader(archivo))
        ) {
            String linea;

            //Bucle hasta q el archivo este vacio
            while ((linea = lector.readLine()) != null) {

                // Separo Usuario y contraseña
                String[] partes = linea.split(":");

                if (partes.length == 2) {
                    String usuarioArchivo = partes[0];
                    String contraseñaArchivo = partes[1];

                    // compruebo si esta en el archivo
                    if (usuarioArchivo.equals(usuario) && contraseñaArchivo.equals(contraseña)) {
                        return true;
                    }
                }

            }

        } catch (IOException e) {
            // excepcion mas q nada porq creo q me obliga y porq no se permite poner : en la contraseña y bno si el archivo esta mal
            System.err.println("ERROOOOOOORRRRRR!: " + e.getMessage());
        }
        return false;
    }
}
