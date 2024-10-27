import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {

        Animal animales = new Animal();
        Gato gato = new Gato();
        Perro perro = new Perro();
        animales.animales.add(new Perro("Max",12));
        animales.animales.add(new Gato("Willson",7));
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la opción");
        int opcion;
        String opcionElegida;
        boolean salir=false;

        while (!salir){

            System.out.println("1.Añadir perro o gato");
            System.out.println("2.Añadir 2 perros");
            System.out.println("3.Añadir 2 gatos");
            System.out.println("4.Mostrar todos los animales");
            System.out.println("5.Eliminar animal");
            System.out.println("7.Salir");

            opcion=sc.nextInt();

            switch (opcion){

                case 1:


                    System.out.println("¿Qué tipo de animal quieres añadir? (gato/perro)");
                    String tipo = sc.next();

                    System.out.println("Introduce el nombre del animal:");
                    String nombre = sc.next();

                    System.out.println("Introduce la edad del animal:");
                    int edad = sc.nextInt();

                    if (tipo.equalsIgnoreCase("gato")) {
                        animales.animales.add(new Gato(nombre, edad));
                    } else if (tipo.equalsIgnoreCase("perro")) {
                        animales.animales.add(new Perro(nombre, edad));
                    } else {
                        System.out.println("Animal no válido");
                    }


                break;
                case 2:

                    System.out.println("Introduce el nombre del primer perro:");
                    String nombre2 = sc.next();

                    System.out.println("Introduce la edad del animal:");
                    int edad2 = sc.nextInt();

                    System.out.println("Introduce el nombre del segundo perro:");
                    String nombre1 = sc.next();

                    System.out.println("Introduce la edad del animal:");
                    int edad1 = sc.nextInt();

                    animales.animales.add(new Perro(nombre2, edad2));
                    animales.animales.add(new Perro(nombre1, edad1));

                    break;
                case 3:

                    System.out.println("Introduce el nombre del primer gato:");
                    String nombre3 = sc.next();

                    System.out.println("Introduce la edad del animal:");
                    int edad3 = sc.nextInt();

                    System.out.println("Introduce el nombre del segundo gato:");
                    String nombre4 = sc.next();

                    System.out.println("Introduce la edad del animal:");
                    int edad4 = sc.nextInt();

                    animales.animales.add(new Gato(nombre3, edad3));
                    animales.animales.add(new Gato(nombre4, edad4));


                    break;
                case 4:

                  animales.mostrarLista();

                    break;
                case 5:

                    animales.eliminarAnimal();

                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
    }
    }

