import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            System.out.println("Número da tabuada: ");
            numero = scanner.nextInt();
           
            System.out.println("Tabuada de "+ numero+ " : "); 

            for(int i = 1 ; i <= 10; i++){
               System.out.println(numero+" * " + i + "=" + i * numero); 
            }
    }
  }
}
