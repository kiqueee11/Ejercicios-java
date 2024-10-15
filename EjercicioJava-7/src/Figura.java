abstract class Figura {
    String tipo;
    String color;
    public Figura() {
    }

    @Override
    public String toString() {
        return "Figura{}";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
