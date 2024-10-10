import java.io.*;

public class Main {
    public static void main(String[] args) {
        String nombreArchivo = "C:\\Users\\ALUMNO\\Desktop\\trabajos\\AAE\\Ejercicios-java\\EjercicioJava6\\src\\prueba3.txt";
        File archivo = new File(nombreArchivo);

        try {
            // Si el archivo no existe, lo creamos
            if (!archivo.exists()) {
                archivo.createNewFile();
                System.out.println("Archivo creado: " + nombreArchivo);
            }

            // Intentamos leer el archivo
            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }
    }
}