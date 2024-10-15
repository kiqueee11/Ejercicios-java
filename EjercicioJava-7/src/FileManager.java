import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class FileManager {

    String ruta = "C:\\Users\\ALUMNO\\Desktop\\trabajos\\AAE\\Ejercicios-java\\EjercicioJava-7\\src\\Figuras.txt";

    FileManager(String ruta) {
        this.ruta = ruta;
    }

    FileManager() {
    }

    ArrayList<Figura> figuras = new ArrayList<>();
    File file = new File(ruta);

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public boolean exist() {

        if (file.exists()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "FileManager{" +
                "ruta='" + ruta + '\'' +
                ", figuras=" + figuras +
                ", file=" + file +
                '}';
    }

    public void importFromFile() {
        String linea = "";
        try {


            BufferedReader br = new BufferedReader(new FileReader(ruta));
            while ((linea = br.readLine()) != null) {

                String[] palabras = linea.split(" ");
                /*System.out.println(palabras[1]);*/
                if (palabras.length < 4 || !palabras[palabras.length - 1].startsWith("#")) {
                    System.out.println("Archivo no valido");
                    continue;
                }



                if (palabras[1].equals("rectangulo")) {

                    int x = Integer.parseInt(palabras[2]);
                    int y = Integer.parseInt(palabras[4]);
                    String color = palabras[5];
                    figuras.add(new Rectangulo(palabras[1], x, y, color));
                } else if (palabras[1].equals("circulo")) {
                    int x = Integer.parseInt(palabras[2]);
                    int y = Integer.parseInt(palabras[4]);
                    String color = palabras[5];
                    figuras.add(new Circulo(palabras[1], x, y, color));
                } else {
                    int x = Integer.parseInt(palabras[2]);
                    String color = palabras[4];
                    figuras.add(new Cuadrado(palabras[1], x, color));
                }


            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(figuras);
    }

    public ArrayList<Figura> getDataFromFile() {
        return figuras;
    }
    public void createFile(){
        BufferedWriter bf = null;
        try{
            bf=new BufferedWriter(new FileWriter("src/Resultados.txt"));
            for(Figura l: this.figuras){
                bf.write(l.toString());
                bf.newLine();
            }
            bf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}


