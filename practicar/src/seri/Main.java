package seri;

import java.io.*;

public class Main {
    public static void main(String[] args) {

    crearObjetoSerializado();
    leerObjetoSerializado();
    }

    public static void crearObjetoSerializado(){

        Persona persona1 = new Persona("juan",16);

        File file = new File("src/seri/objeto.ser");
        try{

            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream ois = new ObjectOutputStream(fos);
            ois.writeObject(persona1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public static void leerObjetoSerializado(){

        Persona persona1 = null;

        File file = new File("src/seri/objeto.ser");
        try{

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            persona1 = (Persona) ois.readObject();
            System.out.println(persona1.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
