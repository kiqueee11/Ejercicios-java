import java.util.Scanner;

public class TelefonoInteligente extends Dispositivos implements Conectable{

    String marca;
   public TelefonoInteligente(String marca){
        this.marca=marca;
    }
    public TelefonoInteligente(){}

    @Override
    public void conectarWifi() {

        System.out.println("Wifi conectado");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Wifi desconectado");
    }

    @Override
    public void encender() {
        estadoDispositivo=true;
        System.out.println(estadoDispositivo);
    }

    @Override
    public String toString() {
        return "TelefonoInteligente{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
