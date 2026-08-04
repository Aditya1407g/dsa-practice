package OOPS.Interfaces;

public class CdPalyer implements MediaPlayer{


    @Override
    public void start() {
        System.out.println("music start");
    }

    @Override
    public void stop() {
        System.out.println("music stop");
    }
}
