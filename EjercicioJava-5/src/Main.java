import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Alumnos> info = new ArrayList<>();

        try {
            File file = new File("C:\\Users\\ALUMNO\\Desktop\\trabajos\\AAE\\Ejercicios-java\\EjercicioJava-5\\alumnos.txt");
            Scanner sc = new Scanner(file);
            String linea;
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                String[] datos = linea.split(",");
                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                String ciclo = datos[2];
                double notaMedia = Double.parseDouble(datos[3]);
                Alumnos alumnos = new Alumnos(nombre, edad, ciclo, notaMedia);
                info.add(alumnos);
            }
            System.out.println(info.toString());
        } catch (Exception e) {
            System.out.println("error");
        }
        notaAlta(info);

    }
    public static  void notaAlta(ArrayList<Alumnos> alumnos){

    int contador = 0;
    double nota1=0;
    double nota2=0;
    String nombre="";
        while (contador < alumnos.size()) {
        nota2=alumnos.get(contador).getNotaMedia();
        if(nota1<nota2){
            nota1=nota2;
            nombre=alumnos.get(contador).getNombre();
        }
        contador++;
    }
        System.out.println(nombre+" "+nota1);
    }

    public static void crearArchivo(){
        String archivo = "C:\\Users\\ALUMNO\\Desktop\\trabajos\\AAE\\Ejercicios-java\\EjercicioJava-5\\src\\Archivo.txt";

         BufferedWriter writer = null;
         try{
             writter redactor = new BufferedWriter(new FileWriter(archivo));
             for(Alumno alumno: Alumno){
                 writter.write(alumno.toString());

             }
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
    }
}

