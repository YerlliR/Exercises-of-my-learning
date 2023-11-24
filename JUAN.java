import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivos {

    public static void main(String[] args) {
        // Directorio donde se crearán los archivos
        String directorioDestino = "carpeta_con_archivos";

        // Crear directorio si no existe
        crearDirectorio(directorioDestino);

        // Crear 1000 archivos de texto
        for (int i = 1; i <= 1000; i++) {
            String nombreArchivo = "archivo_" + i + ".txt";
            String rutaArchivo = directorioDestino + "/" + nombreArchivo;

            // Crear el archivo
            crearArchivo(rutaArchivo);

            // Puedes agregar contenido al archivo si lo deseas
            escribirContenido(rutaArchivo, "Este es el contenido del archivo " + i + ".");
        }

        System.out.println("Se han creado 1000 archivos en el directorio " + directorioDestino + ".");
    }

    private static void crearDirectorio(String directorio) {
        java.io.File dir = new java.io.File(directorio);
        if (!dir.exists()) {
            dir.mkdir();
        }
    }

    private static void crearArchivo(String rutaArchivo) {
        try {
            java.io.File archivo = new java.io.File(rutaArchivo);
            archivo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void escribirContenido(String rutaArchivo, String contenido) {
        try (FileWriter escritor = new FileWriter(rutaArchivo)) {
            escritor.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
