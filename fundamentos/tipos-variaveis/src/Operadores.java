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
    }
}