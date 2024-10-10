import java.util.ArrayList;

public class Alumnos {

    String nombre;
    int edad;
    String ciclo;
    double notaMedia;



    public Alumnos(String nombre, int edad, String ciclo, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciclo = ciclo;
        this.notaMedia = notaMedia;
    }
    Alumnos(){}

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ciclo='" + ciclo + '\'' +
                ", notaMedia=" + notaMedia +
                '}'+"\n";
    }

}
