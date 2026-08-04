package OOPS.Interfaces;

public class Car implements Engine, MediaPlayer{


    @Override
    public void start() {
        System.out.println("engine start");
    }

    @Override
    public void stop() {
        System.out.println("engine stop");
    }

    @Override
    public void acc() {
        System.out.println("engine acc");
    }
}
