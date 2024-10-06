import java.sql.SQLOutput;

public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarInfo(){
        System.out.println("nombre; "+this.nombre+" edad: "+this.edad);
    }
    public void hacerSonido(){
        System.out.println("El animal hace ruido");
    }
}
