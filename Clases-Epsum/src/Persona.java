

public class Persona {

        private String nombre;
        private int edad;
        private double peso;

        public Persona(String nombre, int edad, double peso) {
            this.nombre=nombre;
            this.edad=edad;
            this.peso=peso;

        }
    public Persona() {
        this.nombre="";
        this.edad=0;
        this.peso=0;

    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }
}

