public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {


        String[][] nombres = {{"Rubi","Marce"},{"Helen","Pascal"},{"Billy","Nami"}};

        for (String[] fila: nombres){
            for (String nombre : fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }


    }
}
