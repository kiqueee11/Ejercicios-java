public class Gerente extends Empleado implements Autenticable,Bonificable{
    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase,bono);
    }
    public Gerente(){}


    @Override
    public void iniciarSesion(String nombre, String password) {

    }

    @Override
    public void cerrarSesion() {
        System.out.println("Se ha cerrado la sesión de Gerente");
    }

    @Override
    public void calcularBono() {

    }

    @Override
    public void calcularSalario() {
        double salarioTotal;
        salarioTotal=salarioBase+bono;
        System.out.println(salarioTotal);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("El gerente es : "+ nombre+ " y su salario base es : "+salarioBase);
    }
}
