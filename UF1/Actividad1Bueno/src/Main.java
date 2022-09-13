import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class Main {
    public static void main(String[] args) throws IOException {

        // Conseguimos el path de la carpeta
        String dirDades = System.getProperty("user.dir") + File.separator;

        // Creamos ambos archivos
        File Origen = new File(dirDades + "Origen");
        File Destino = new File(dirDades + "Destino");

        System.out.println();
        if(!Origen.exists()){
            System.out.println("El directorio no existe");
            System.exit(0);
        }

        if (!Destino.exists()){
            Destino.mkdir();
            System.out.println("Has creado el directorio destino");
        } else System.out.println("El directorio destino ya existe");

        File[] fitxers = Origen.listFiles();

        for (File file : fitxers) {
            Files.copy(file.toPath(), (new File((dirDades + "/Destino/" + file.getName())).toPath()));
            System.out.println(dirDades + "/Destino/" + file.getName());

        }
    }
}