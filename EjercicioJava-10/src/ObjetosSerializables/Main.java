package ObjetosSerializables;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("juan", 27);


           try( FileOutputStream fos = new FileOutputStream("src/ObjetosSerializables/persona.ser");ObjectOutputStream salida = new ObjectOutputStream(fos)){
            salida.writeObject(persona);
        }catch (IOException e){
            System.out.println(e);
        }
           leerArchivo();
    }
    public static void leerArchivo(){
        Persona persona2 = null;
        try{
            FileInputStream fis = new FileInputStream("src/ObjetosSerializables/persona.ser");
            ObjectInputStream entrada = new ObjectInputStream(fis);
            persona2 = (Persona) entrada.readObject();
            System.out.println(persona2.toString());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}