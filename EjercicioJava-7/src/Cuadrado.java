public class Cuadrado extends Figura{
    int x;
    public Cuadrado(String tipo,int x, String color) {
        this.tipo=tipo;
        this.x=x;
        this.color=color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "x=" + x +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
