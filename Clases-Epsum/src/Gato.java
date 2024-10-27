import java.util.Scanner;

public class Gato extends Animal{

    Scanner sc = new Scanner(System.in);

    public Gato(){}

    public Gato(String nombre, int edad){

        super(nombre,edad);

        this.nombre = nombre;
        this.edad = edad;

    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hacerSonido() {

        System.out.println(Gato.this.nombre+" dice miau");

    }

    public void añadirGato(){

        System.out.println("Introduce la edad del gato");
        int edad;
        edad=sc.nextInt();

        System.out.println("Introduce el nombre del gato");
        String nombre;
        nombre=sc.next();

        animales.add(new Gato(nombre,edad));
    }
}



