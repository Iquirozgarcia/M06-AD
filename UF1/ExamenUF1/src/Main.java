import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String texto1, texto2;
        Float numFloat;
        int numInt;
        csvToRAF prueba = new csvToRAF();
        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos a rellenar el archivo. Pon el nombre de una ciudad (MAX 25 Caracteres)");
        texto1 = scan.next();
        if (texto1.length() > 25) {
            System.out.println("Has sobrepasado el limite de caracteres");
            System.exit(0);
        }
        System.out.println("Pon un numero float");
        numFloat = scan.nextFloat();
        System.out.println("Pon unas siglas (MAX 3 Caracteres)");
        texto2 = scan.next();
        if (texto2.length() > 3) {
            System.out.println("Has sobrepasado el limite de caracteres");
            System.exit(0);
        }
        System.out.println("Pon unos digitos");
        numInt = scan.nextInt();
        prueba.escribir(texto1, numFloat, texto2, numInt);
        prueba.copiar(new File("Origen.csv"), new File("Destino.dat"));
        prueba.leerporlineas("Destino.dat");
    }
}