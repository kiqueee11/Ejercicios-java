import java.io.*;

public class Main {
    public static void main(String[] args) {
        String nombreArchivo = "C:\\Users\\ALUMNO\\Desktop\\trabajos\\AAE\\Ejercicios-java\\EjercicioJava6\\src\\prueba3.txt";
        File archivo = new File(nombreArchivo);

        try {

            if (!archivo.exists()) {
                archivo.createNewFile();
                System.out.println("Archivo creado: " + nombreArchivo);
            }


            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea = "";
                int cantidad=0;
                String cadena="aeiouAEIOU";
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);

                    for(char character : linea.toCharArray()) {
                        if (cadena.indexOf(character) != -1) {
                            cantidad = cantidad + 1;
                        }
                    }
                    System.out.println(cantidad);
                    cantidad = 0;
                }
            } catch (IOException e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }
    }
}