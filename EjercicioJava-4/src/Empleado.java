public abstract class Empleado {
    String nombre;
    double salarioBase;
    double bono;
    public Empleado(String nombre, double salarioBase, double bono){
        this.nombre=nombre;
        this.salarioBase=salarioBase;
        this.bono=bono;
    }
    Empleado() {}

    public abstract void calcularSalario();
    public abstract void mostrarInformacion();


}
