import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numAleatorios = new int[20];
    

    for(int i = 0 ; i < numAleatorios.length ; i++) {
        int numero = random.nextInt(100);
        numAleatorios[i] = numero;
    }

    System.out.println("Numeros Aleatórios: ");
    for( int numero : numAleatorios) {
        System.out.print(numero + " ");
    }

    System.out.println("\n sucessores dos Numeros Aleatórios: ");
    for( int numero : numAleatorios) {
        System.out.print((numero + 1 ) + " ");
    }
}
}