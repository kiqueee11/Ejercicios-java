import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/entrada.txt");
        leerArchivo();
        escribirContenido();
    }
    public static void leerArchivo()  {

        File file = new File("src/entrada.txt");
        FileInputStream fis = null;
        try{
            if(file.exists()){
                fis = new FileInputStream(file);
                long tamanoArcivo = file.length();
                byte[] contenido = new byte[(int) tamanoArcivo];
                fis.read(contenido);
                System.out.println(new String(contenido));
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


        }
        public static void escribirContenido(){
        File file = new File("src/entrada.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("src/entrada.bin");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String contenido;
            String texto="";
            while ((contenido = br.readLine())!=null) {
                texto=texto+"\n"+contenido;
            }

            byte[] cont = texto.getBytes();
            fos.write(cont);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }
}