public class Usuario {
    public static void main(String[] args) {
       
        SmartTv smarttv = new SmartTv();

        System.out.println("Tv está ligada"  + smarttv.ligada);
        System.out.println("Canal atual"  + smarttv.canal);
        System.out.println("Volume atual"  + smarttv.volume);
    }
}
