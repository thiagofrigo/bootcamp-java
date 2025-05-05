public class TvSmart {

    boolean ligada = false;
    int canal;
    int volume;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public int aumentarVolume(boolean aumentaVolume) {
        this.volume = aumentaVolume ? ++this.volume: --this.volume;
        return this.volume;
    }
}
