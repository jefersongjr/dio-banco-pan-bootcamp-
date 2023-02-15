import java.util.Scanner;

/**
 * Ex8_Consoantes
 */
public class Ex8_Consoantes {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] consoantes = new String[6];
            int quantidaDeConsoantes = 0;

            int count = 0;

            do {
                System.out.println("digite a letra: ");
                String letra = scanner.next();

                if( !(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u") )
                ) {
                   consoantes[count] = letra;
                   quantidaDeConsoantes++;
                }
                count++;
        } while (count < consoantes.length );

        for ( String consoante : consoantes) {
            if( consoante != null)
            System.out.print(consoante + ", ");
        }
        System.out.println("\nQuantidade de consoantes: " + quantidaDeConsoantes);

    }
  }
}