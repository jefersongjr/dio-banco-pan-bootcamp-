
public class Ex7_OrdemInversa {
    public static void main(String[] args) {
        int[] lista = { -5, -6, 15, 80, 60, 17, 4};
          
        int count = 0;
        System.out.println("Lista");

        while(count < (lista.length -1)) {
            System.out.print(lista[count] + " ");
            count++;
        }

        System.out.println("\nLista invertida");


        for( int i = (lista.length - 1); i >= 0 ; i--) {
            System.out.print(lista[i] + " ");
        }
    }
}
