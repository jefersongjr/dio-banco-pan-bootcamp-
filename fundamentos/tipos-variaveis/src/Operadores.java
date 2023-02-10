public class Operadores {

    public static void main(String[] args) throws Exception {
        int numero = 5;
        System.out.println( numero);

        numero = - numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        System.out.println(numero ++); // incrementa depois 
        System.out.println(numero);
        System.out.println(++ numero); // incrementa antes

        // operadores booleanos
        boolean eValido = true;

        eValido = !eValido;
        System.out.println(eValido);

        //operadores ternários.
        int a, b ;

        a = 4;
        b = 4;

        String resultado = a == b ? "verdadeiro" : "false";

        System.out.println(resultado);

        //operadores relacionais

        String nome = "Jeferson";
        String outroNome = new String("JefErson");

        System.out.println(nome.equalsIgnoreCase(outroNome));

        a = 3;
        b = 1;

        boolean simOuNao = a != b;

        System.out.println(simOuNao);

        simOuNao = a > b;
        System.out.println(simOuNao);

        simOuNao = a < b ;
        System.out.println(simOuNao);

        //operadores lógicos 

        boolean condicao1 = true;
        boolean condicao2 = false ;

        if(condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }
        else {
            System.out.println("uma condição é falsa");
        }

        if(condicao1 || condicao2) {
            System.out.println("uma das duas condições são verdadeiras");
        }

    }
}