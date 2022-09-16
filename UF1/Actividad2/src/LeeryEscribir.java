import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeeryEscribir {
    //<editor-fold desc="Cositas">
    private String archivo;

    public LeeryEscribir(String archivo) {
        this.archivo = archivo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    //</editor-fold>
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

    public void leerporcaracteres(String archivo){
        try {
            File file = new File(archivo);
            FileReader fileReader = new FileReader(file);
            BufferedReader b = new BufferedReader(fileReader);
            StringBuffer s = new StringBuffer();
            String line;
            while ((line = b.readLine()) != null) {
                s.append(line);
                s.append("\n");
            }
            fileReader.close();
            System.out.println("Contingut del fitxer:");
            System.out.println(s.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } }



}


