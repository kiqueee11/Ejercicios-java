public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Laura", 5000, 1000);
        Programador programador = new Programador("Carlos",3000,500);

        gerente.iniciarSesion("lauraG","password123");
        programador.iniciarSesion("carlosP","password456");

        System.out.println("\nInformacion del gerente");
        gerente.mostrarInformacion();

        System.out.println("\nInformacion del programador");
        programador.mostrarInformacion();

        gerente.cerrarSesion();
        programador.cerrarSesion();
    }
}
