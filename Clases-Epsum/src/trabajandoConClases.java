public class trabajandoConClases {
    public static void main(String[] args) {
//        Persona persona1 = new Persona("enrique",20,74);
//        Persona persona2 = new Persona();
//
//        System.out.println(persona1.getNombre());
//        System.out.println(persona1.getEdad());
//
//        persona2.setEdad(15);
//        persona2.setPeso(45);
//        persona2.setNombre("paco");
//        System.out.println(persona2.toString());
//          Perro perro1 = new Perro("Duque", 10);
//          perro1.hacerSonido();
//        Calculadora calculadora = new Calculadora();
//        try{
//        double resultadoDivision = calculadora.dividir(10,0);
//            System.out.println("Resultado división "+ resultadoDivision);
//        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//        }
    Figura circulo = new Circulo(5);
    circulo.mostrarFigura();
        System.out.println(""+circulo.calcularArea());
    circulo.calcularPerimetro();

    }
}
