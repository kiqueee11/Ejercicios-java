public class Arrays {
    public static void main(String[] args) {
        int[] numeros ={10,20,30,40,50};
        boolean salir =false;
        int l=0;
        int a=0;
        int contador=0;
        for(int i=0; i < numeros.length && !salir; i++){
            if(numeros[i]==40){
                salir=true;
            }
            System.out.println(("numero" +numeros[i]));
        }
        int[][] matriz ={
                {7,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int ñ = 0 ;ñ < matriz.length ; ñ++){
            System.out.print("["+matriz[l][a]);
            System.out.print(","+matriz[l][a+1]);
            System.out.print(","+matriz[l][a+2]+"]");
            System.out.println("\n");
            l++;

        }
    }
    }

