import java.io.*;

public class Galaxia2 {
    public static void main(String[] args) {
        String archivoInicio = "SAC_DeepSky_Ver81_QCQ.TXT";
        String archivoFinal = "SAC.bin";
        int[] columnasEspecificadas = {0, 2};

        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivoInicio));
            ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(archivoFinal));

            String primeraLinea = reader.readLine();
            String[] nombresColumnas = primeraLinea.split(",");

            for (int columna : columnasEspecificadas) {
                writer.writeObject(nombresColumnas[columna]);
            }

            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] valores = linea.split(",");

                String salto = "\n";
                writer.write(salto.getBytes());
                
                for (int columna : columnasEspecificadas) {
                    writer.writeObject(valores[columna]);
                }

            }

            System.out.println("Archivo creado satisfactoriamente.");
        } catch (IOException e) {
            System.err.println("Error al procesar archivos: " + e.getMessage());
        }
    }
}
