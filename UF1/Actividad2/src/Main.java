import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String elegir;
        String texto;

        System.out.println("introdueix un valor: (el archivo se llama texto.txt)");
        Scanner scan = new Scanner(System.in);
        elegir = scan.nextLine();
        LeeryEscribir archivo = new LeeryEscribir(elegir);

        System.out.println("\nEl siguiente archivo ha sido leido por lineas");
        archivo.leerporlineas(elegir);

        System.out.println("\nEl siguiente archivo ha sido leido por caracteres");
        archivo.leerporcaracteres(elegir);

        System.out.println("\nVamos añadirle texto al archivo out.txt");


        System.out.println("\nEscribe el nuevo texto");
        texto = scan.nextLine();
        archivo.escribir(texto);
        archivo.setArchivo("out.txt");
        System.out.println("\nTexto del archivo: ");
        archivo.leerporlineas(archivo.getArchivo());

    }
}