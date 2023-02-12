public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }

    public void diminuiVolume() {
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}
