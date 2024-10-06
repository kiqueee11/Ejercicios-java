import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();
        estudiante.estudiante.add(new Estudiante("Pepe", 12,5));
        estudiante.estudiante.add(new Estudiante("Juan", 15,7.5));
        estudiante.estudiante.add(new Estudiante("Alejandro", 12,6));
        estudiante.estudiante.add(new Estudiante("Javier", 15,10));

        System.out.println("Introduce la opción");
        int opcion;

        boolean salir=false;

        while (!salir){

            System.out.println("1.Añadir estudiantes");
            System.out.println("2.Mostrar estudiantes");
            System.out.println("3.Eliminar estudiantes");
            System.out.println("4.Calcular media");
            System.out.println("5.Nota más alta");
            System.out.println("7.Salir");

            opcion=sc.nextInt();

            switch (opcion){

                case 1:
                    estudiante.AñadirEstudiantes();
                    break;
                case 2:
                    estudiante.MostrarEstudiantes();
                    break;
                case 3:
                    estudiante.EliminarEstudiante();
                    break;
                case 4:
                    estudiante.CalcularMedia();
                    break;
                case 5:
                    estudiante.NotaMasAlta();
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
