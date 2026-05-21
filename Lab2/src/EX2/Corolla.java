package EX2;

public class Corolla implements IVehicle {
    @Override
    public void start() {
        System.out.println("Corolla start");
    }

    @Override
    public void stop() {
        System.out.println("Corolla stop");
    }

    @Override
    public void drive() {
        System.out.println("Corolla drive");
    }
}
