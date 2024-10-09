import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TelefonoInteligente telefonoInteligente = new TelefonoInteligente();
        Tablet tablet = new Tablet();
        ArrayList<TelefonoInteligente> telefonos = new ArrayList<>();

        telefonoInteligente.encender();
        telefonoInteligente.conectarWifi();
        telefonoInteligente.desconectarWifi();
        asignarMarca();

        tablet.encender();
        tablet.conectarWifi();
        tablet.desconectarWifi();

        try {
            boolean salir = false;
            int contador = 0;
            String marca;
            File archivo = new File("C:\\Users\\ALUMNO\\Desktop\\trabajos\\AAE\\Ejercicios-java\\EjercicioJava-3\\src\\mis-dispositivos.txt");
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()){
                marca=sc.nextLine();
                TelefonoInteligente telefonoInteligente1 = new TelefonoInteligente(marca);
                telefonos.add(telefonoInteligente1);
            }
        }catch (Exception e){
            System.out.println("Archivo no existe");
        }
        System.out.println(telefonos.toString());

    }
    public static void asignarMarca(){
        String marca;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la marca del telefono");
        marca=sc.next();
        TelefonoInteligente telefono = new TelefonoInteligente(marca);
        sc.close();
    }

}
