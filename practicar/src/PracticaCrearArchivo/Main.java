package PracticaCrearArchivo;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            crearArchivo();
            leerArcivo();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void crearArchivo() throws IOException {

        File file = new File("src/PracticaCrearArchivo/ArchivoNuevo.txt");
        String linea = "hola";

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(linea);
            bw.close();
        }catch (FileNotFoundException e){
            System.out.println(e);

        }
        File file1 = new File("src/PracticaCrearArchivo/ArchivoNuevo1.txt");
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(file1));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void leerArcivo() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String linea="";
        File file = new File("src/PracticaCrearArchivo/ArchivoNuevo.txt");
        try{
            BufferedReader bf = new BufferedReader(new FileReader(file));
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/PracticaCrearArchivo/ArchivoNuevo1.txt"));
            while ((linea=bf.readLine())!=null){
                System.out.println(linea);
                bw.write(linea);
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
