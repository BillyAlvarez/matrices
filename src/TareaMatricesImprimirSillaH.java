public class TareaMatricesImprimirSillaH {
    public static void main(String[] args) {
        /*
        Escribir un programa para una matriz de n x n e imprima en ella una silla (o letra h minúscula) construida a base del numero 1 y utilizar el numero 0 como espacio.
         El tamaño de la silla se basa en una variable n que indicará el tamaño de la figura a imprimir en una matriz de n x n.

            Por ejemplo para n=5 se obtiene:

            10000
            10000
            11111
            10001
            10001
            Por ejemplo para n=6 se obtiene:

            100000
            100000
            100000
            111111
            100001
            100001
            Por ejemplo para n=10 se obtiene:

            1000000000
            1000000000
            1000000000
            1000000000
            1000000000
            1111111111
            1000000001
            1000000001
            1000000001
            1000000001
            Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.

        */

        int n = 10;

        if (n==0){
            System.err.println("ERROR!");
            System.exit(0);
        }

        int[][] matriz =  new int[n][n];
        int aux = (matriz.length)/2;

        for (int i = 0; i < matriz.length; i++){

            for (int j = 0 ; j < matriz[i].length; j++){
                if (  i == (aux) || j == 0  )
                    matriz[i][j]= 1;
            }if (i >= aux){
                matriz[i][matriz.length-1]= 1;
            }



        }


        for (int i =0; i < matriz.length; i++){
            for (int j = 0 ; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
