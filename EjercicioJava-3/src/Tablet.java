public class Tablet extends Dispositivos implements Conectable{
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
}
