class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(this.radio,2);
    }
    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * this.radio;
    }
    public void mostrarDimensiones(){
        System.out.println("El radio del circulo es: "+this.radio
        );
    }
}
