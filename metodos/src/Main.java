//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TvSmart tvSmart = new TvSmart();
        tvSmart.ligar();

        System.out.println("TV ligada: " + tvSmart.ligada);

        System.out.println("Canal atual: " + tvSmart.canal);
        System.out.println("Volume atual: " + tvSmart.volume);
        tvSmart.aumentarVolume(true);
        System.out.println("Volume atual: " + tvSmart.volume);
    }
}