import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int quantidadeNumero;
            int numero;
            int quantImpares = 0 , quantPares = 0;
            System.out.println("Quantidade de Numero: ");
            quantidadeNumero = scanner.nextInt();
            
            int count = 0;
            do {
                System.out.println("numero: ");
                numero = scanner.nextInt();
                if(numero % 2 == 0) quantPares++;
                else quantImpares++;

                count++;
             } while (count < quantidadeNumero );
             
             System.out.println("Quantidade de Pares: " + quantPares);
             System.out.println("Quantidade de Pares: " + quantImpares);
        }
    }
}
