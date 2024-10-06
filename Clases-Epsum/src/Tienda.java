import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        ArrayList<Productos> productos = new ArrayList<>();
        productos.add(new Productos("pan", 12, 4));
        productos.add(new Productos("gel", 6, 7));
        productos.add(new Productos("botella", 16, 3));
        int opcion;
        boolean salir = false;
        while (!salir) {
            System.out.println("Elige una opción del 0 al tal");
            System.out.println("1.Mostrar productos");
            System.out.println("2.Añadir productos");
            System.out.println("3.Actualizar precio y cantidad");
            System.out.println("4.Eliminar productos");
            System.out.println("5.Calcular precio total");
            System.out.println("7.salir");

            Scanner sc = new Scanner(System.in);

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(productos.toString());
                    break;
                case 2:
                    System.out.println("Introduce el nombre del producto");
                    String nombre;
                    nombre = sc.next();
                    System.out.println("Introduce el precio del producto");
                    double precio;
                    precio = sc.nextDouble();
                    System.out.println("Introduce la cantidad del producto");
                    int cantidad;
                    cantidad = sc.nextInt();
                    productos.add(new Productos(nombre, precio, cantidad));
                    break;
                case 3:
                    boolean salir1=false;
                    int contador=0;
                    System.out.println("Introduce el producto a modificar");
                    String nombreP;
                    nombreP=sc.next();
                    System.out.println("Introduce el precio");
                    Double precioP;
                    precioP=sc.nextDouble();
                    System.out.println("Introduce la cantidad");
                    int cantidadP;
                    cantidadP=sc.nextInt();
                    while (!salir1 && contador<productos.size()){
                        if(productos.get(contador).getNombre().equals(nombreP)){
                            productos.get(contador).setCantidad(cantidadP);
                            productos.get(contador).setPrecio(precioP);
                            salir1=true;
                        }
                        contador++;
                    }
                    break;
                case 4:
                    int contador1=0;
                    System.out.println("Introduce el nombre del producto a eliminar");
                    String nombrePr;
                    boolean salir2=false;
                    nombrePr=sc.next();
                    while (!salir2 && contador1<productos.size()) {
                        if (productos.get(contador1).getNombre().equals(nombrePr)) {
                            productos.remove(contador1);
                            salir2=true;
                        }
                        contador1++;
                    }
                    System.out.println("cambios realizados correctamente");
                    break;
                case 5:
                    int contador3=0;
                    boolean salir3=false;
                    double suma=0;
                    double a=0;
                    double b=0;
                    while(!salir3 && contador3<productos.size()){
                        a=productos.get(contador3).getPrecio();
                        b=productos.get(contador3).getCantidad();
                        suma=a*b+suma;
                        contador3++;
                    }
                    System.out.println("El total del stock es "+suma+" euros");
                    break;
                case 7:
                    salir=true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }
}
