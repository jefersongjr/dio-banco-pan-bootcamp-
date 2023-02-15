import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scanner.nextInt();
        
        while(nota < 0 | nota > 10) {
            System.out.println("Nota inválida, digite novamente: ");
            nota = scanner.nextInt();

        }

    }
}
