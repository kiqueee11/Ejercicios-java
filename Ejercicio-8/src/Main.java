import java.io.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/Alumnos.txt");

        if(file.exists()){
         /*   long sizeBytes = file.length();
            long sizeBits = sizeBytes*8;*/
            long bits = getBits(file.length());
            leerArchivoFileInpuutStream();
            leerArchivoYObtenerTamano();
            escribirArchioFileInputStream();

        }
    }
    public static boolean getBytes(File file){
        return file.exists();
        }
        public static long getBits(long archivoLength){
        return archivoLength*8;
        }
        public static void leerArchivoFileInpuutStream(){

            FileInputStream fis = null;
            try{
                fis = new FileInputStream("src/Alumnos.txt");
                int byteLeido;
                while ((byteLeido = fis.read())!=-1){
                    System.out.print((char) byteLeido);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        public static void leerArchivoYObtenerTamano() {
            FileInputStream fis = null;
            try {
                File file = new File("src/Alumnos.txt");
                if (file.exists()) {
                    fis = new FileInputStream(file);
                    long sizeFile = file.length();
                    byte[] contenido = new byte[(int) sizeFile];

                    fis.read(contenido);
                    System.out.println(new String(contenido));
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        public static void escribirArchioFileInputStream(){
                FileOutputStream fos = null;
                try{
                    fos = new FileOutputStream("src/alumnosFileOutput.txt");
                    String contenido = "hola mundo";

                    byte[] bytesContenido = contenido.getBytes();

                    fos.write(bytesContenido);
                    System.out.println("creado");
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
}


