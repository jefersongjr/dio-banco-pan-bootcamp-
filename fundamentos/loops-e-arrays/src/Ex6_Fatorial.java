import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int fatorial;
            int mult = 1;
            System.out.println("Número do fatorial: ");
            fatorial = scanner.nextInt();
           
            for(int i = fatorial; i >= 1 ; i--) {
                mult *= i;
            }
            System.out.println(fatorial+ "! : " + mult);    
         }
    }
}
