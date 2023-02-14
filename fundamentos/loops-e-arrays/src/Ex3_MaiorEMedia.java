import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            int maior = 0;
            int soma = 0;
            int media;

            int count = 0;
            do {
               System.out.println("numero: ");
               numero = scanner.nextInt();

                soma = soma + numero;
                if(numero > maior) {
                    maior = numero;
                }
               count = count + 1 ;
            } while (count < 5 );
            
            media = soma /5;
            System.out.println("Maior: "+ maior);
            System.err.println("Média: " + media );
        }
    }
}
