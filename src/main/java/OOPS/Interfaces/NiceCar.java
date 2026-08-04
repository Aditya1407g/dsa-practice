package OOPS.Interfaces;

public class NiceCar {

    private Engine engine;
    private MediaPlayer player = new CdPalyer();


    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void acc(){
        engine.acc();
    }

    public void mediaPlay(){
        player.start();
    }

    public void mediaStop(){
        player.stop();
    }

    public void ChangeEngine(Engine engine){
        this.engine=engine;
    }
}
