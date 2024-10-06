public class Calculadora {
    public double dividir(double numerador ,double denominador)throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("Error: no se puede dividir entre 0");
        }
        return numerador/denominador;
    }
    public int factorial(int numero){
        if (numero < 0 ){
            throw new IllegalArgumentException("Error: no se puede calcular un factorial de numero negativo");

        }
        int resultado = 1;
        for (int i=1; i<=numero; i++) {
            resultado *=i;
        }
        return resultado;
    }
}
