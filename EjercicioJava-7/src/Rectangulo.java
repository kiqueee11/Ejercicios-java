public class Rectangulo extends Figura{
    int x;
    int y;
    public Rectangulo(String tipo,int x,int y,String color) {
        this.tipo=tipo;
        this.x=x;
        this.y=y;
        this.color=color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "y=" + y +
                ", tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", x=" + x +
                '}';
    }
}
