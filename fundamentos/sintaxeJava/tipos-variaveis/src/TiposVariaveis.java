public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double numero = 24440;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        numeroCurto = (short) numeroNormal; // o cast serve pra forçar um valor

        final double PI = 3.14; 
        System.out.println(numero);
        System.out.println(PI);
    }
}
