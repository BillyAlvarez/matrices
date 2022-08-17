public class EjemploMatricesStringFor {
    public static void main(String[] args) {


        String[][] nombres = new String[3][2];
        nombres[0][0] = "Rubi";
        nombres[0][1] = "Marce";
        nombres[1][0] = "Helen";
        nombres[1][1] = "Pascal";
        nombres[2][0] = "Billy";
        nombres[2][1] = "Nami";

        System.out.println(" Iterando con for: " );

        for (int i =0; i< nombres.length; i++){
            for (int j =0; j < nombres[i].length; j++){
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println(" Iterando con foreach: " );
        for (String[] fila: nombres){
            for (String nombre : fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }


    }
}
