import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        for (int numero : numeros) {
            System.out.println(numero);
        }
        ArrayList<Character> letras = new ArrayList<>();
        letras.add('A');
        letras.add('B');
        letras.add('C');
        letras.add('D');
        letras.add('E');
        for (char letra : letras) {
            System.out.println(letra);
        }
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("juan", 25, 70));
        personas.add(new Persona("pedro", 12, 80));
        personas.add(new Persona("paco", 555, 700));

        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }

        for (Persona persona : personas) {
            if (persona.getNombre().equals("pedro")) {
                System.out.println(persona.toString());
            }

        }
        boolean salir=false;
        int contador=0;
        while(!salir && contador<personas.size()){

            if(personas.get(contador).getNombre().equals("pedro")){
                System.out.println(personas.get(contador).toString());
                salir=true;
            }

            contador++;
        }
        }
    }

