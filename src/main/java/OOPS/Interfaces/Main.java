package OOPS.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.acc();
//        car.start();
//        car.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.ChangeEngine( new PetrolEngine());
        car.start();
        car.mediaPlay();
        car.acc();
        car.mediaStop();
        car.stop();



    }
}
