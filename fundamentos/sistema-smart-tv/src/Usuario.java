public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smarttv = new SmartTv();
        
        System.out.println("Tv está ligada ? "  + smarttv.ligada);
        System.out.println("Canal atual"  + smarttv.canal);

        smarttv.mudarCanal(12);

        System.out.println("Canal atual"  + smarttv.canal);


        smarttv.diminuiVolume();
        smarttv.diminuiVolume();
        smarttv.diminuiVolume();
        smarttv.aumentarVolume();


        System.out.println("Volume atual "  + smarttv.volume);

        smarttv.desligar();

        System.out.println("Tv está ligada ?"  + smarttv.ligada);
    }
}
