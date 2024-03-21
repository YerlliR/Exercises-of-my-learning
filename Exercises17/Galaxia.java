//NO ME GUSTAN LOS ARCHIVOS .bin
import java.io.*;

public class Galaxia {

    public static void main(String[] args) {
        File archivoDatos = new File("SAC_DeepSky_Ver81_QCQ.TXT");
        File archivoBinario = new File("SAC.bin");

        try {

            String[] datosGalaxia;

            FileReader lectorArchivo = new FileReader(archivoDatos);
            BufferedReader lectorBuffer = new BufferedReader(lectorArchivo);

            String lineaActual = lectorBuffer.readLine();

            FileOutputStream flujoSalida = new FileOutputStream(archivoBinario);
            ObjectOutputStream escritorObjetos = new ObjectOutputStream(flujoSalida);

            while(lineaActual != null) {

                String lineaLimpia = lineaActual.replaceAll("\"", "");
                datosGalaxia = lineaLimpia.split(",");

                if (lineaLimpia.contains("GALXY")) {
                    String nombre = datosGalaxia[0].replaceAll(" ", "");
                    Elem1 galaxia = new Elem1(nombre, datosGalaxia[3], datosGalaxia[4], datosGalaxia[5], datosGalaxia[6]);
                    escritorObjetos.writeObject(galaxia);
                }
                lineaActual = lectorBuffer.readLine();
            }


        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
