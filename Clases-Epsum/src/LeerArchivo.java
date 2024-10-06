import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivo {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\ALUMNO\\Desktop\\trabajos\\AAD\\Prueba\\src\\hola.txt";

        try {
            File archivo = new File(ruta);
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado " + e);
        }
    }
}