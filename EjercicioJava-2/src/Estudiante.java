import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante {
    String nombre;
    int edad;
    double notaFinal;
    public ArrayList<Estudiante> estudiante = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, double notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", notaFinal=" + notaFinal +
                '}';
    }

    public void AñadirEstudiantes() {
        System.out.println("Introduce el nombre del estudiante");
        String nombre;
        nombre = sc.next();
        System.out.println("Introduce la edad");
        int edad;
        edad = sc.nextInt();
        System.out.println("Introduce la nota final del estudiante");
        double notaFinal;
        notaFinal = sc.nextDouble();

        estudiante.add(new Estudiante(nombre, edad, notaFinal));

    }

    public void MostrarEstudiantes() {

        System.out.println(estudiante);

    }

    public void EliminarEstudiante() {

        int contador = 0;
        boolean salir = false;
        System.out.println("introduce el nombre del estudiante para eliminar");
        String nombre;
        nombre=sc.next();
        boolean encontrado = false;

        while (!salir && contador < estudiante.size()) {
            if (estudiante.get(contador).getNombre().equals(nombre)) {
                estudiante.remove(contador);

                salir = true;
                encontrado = true;
            }

            contador++;

        }
        if(encontrado){
            System.out.println("Estudiante eliminado con exito");
        }else{
            System.out.println("Estudiante no valido");
        }
    }
    public void CalcularMedia(){

        int contador = 0;
        double media = 0;
        double suma = 0;

        while(contador<estudiante.size()){

            suma = estudiante.get(contador).getNotaFinal() + suma;
            contador++;
        }
        media = suma/contador;
        System.out.println("La media total es: "+media);
    }
    public void NotaMasAlta(){

        int contador = 0;
        double nota = 0;
        String nombre = "";

        while(contador<estudiante.size()){

            if(nota<estudiante.get(contador).getNotaFinal()) {

                nota = estudiante.get(contador).getNotaFinal();
                nombre = estudiante.get(contador).getNombre();
            }

           contador++;

        }

        System.out.println("La nota más alta es: "+ nota+" de "+nombre);
    }
}


