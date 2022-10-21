import java.io.*;

public class csvToRAF {

    //<editor-fold desc="Escribir">
    public void escribir(String texto, Float numFloat, String texto2, int numInt) throws IOException {
        FileWriter fw = new FileWriter("Origen.csv", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(texto + ";" + numFloat + ";" + texto2 + ";" + numInt + "\n");
        bw.close();
    }
    //</editor-fold>
    //<editor-fold desc="Copiar">
    public void copiar(File a, File b)
            throws Exception {
        FileInputStream in = new FileInputStream(a);
        FileOutputStream out = new FileOutputStream(b);
        try {
            int n;
            while ((n = in.read()) != -1) {
                out.write(n);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("Archivo copiado");
    }
    //</editor-fold>
    //<editor-fold desc="Leer">
    public void leerporlineas (String archivo){
        try {
            File file = new File(archivo);
            FileReader fr = new FileReader(file);
            int caracter = fr.read();
            while (caracter != -1) {
                if (caracter == '}')
                    caracter = '\n';
                System.out.print((char) caracter);
                caracter = fr.read();
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //</editor-fold>

}