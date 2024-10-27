package SerializarArchivos;

import java.io.*;

public class Main {
    public static void main(String[] args) {

    leerArchivoFIS();
    leerArchivoFISTamano();
    escribirArchivo1en2();
    }

    public static void leerArchivoFIS(){

        File file = new File("src/SerializarArchivos/prueba.txt");
        int byteLeido;
        try{
            FileInputStream fis = new FileInputStream(file);
            while((byteLeido= fis.read()) !=-1){

                System.out.print((char)byteLeido);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void leerArchivoFISTamano() {

        File file = new File("src/SerializarArchivos/prueba.txt");


        if(file.exists()){
        try{
            FileInputStream fis = new FileInputStream(file);
            long archivoLength = file.length();

            byte[] contenido = new byte[(int) archivoLength];
            fis.read(contenido);
            System.out.println(new String(contenido));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        }else {
            System.out.println("El archivo no existe");
        }

    }
    public static void escribirArchivo1en2(){

        File file = new File("src/SerializarArchivos/prueba.txt");
        File file1 = new File("src/SerializarArchivos/prueba2.txt");



        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String linea;
            String contenido = "";
            while ((linea=br.readLine())!=null){
                contenido=contenido+linea+"\n";
            }


            FileOutputStream fos = new FileOutputStream(file1);
            byte[] tamano = contenido.getBytes();

            fos.write(tamano);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
