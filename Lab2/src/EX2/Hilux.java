package EX2;

public class Hilux implements IVehicle {
    @Override
    public void start() {
        System.out.println("Hilux start");
    }

    @Override
    public void stop() {
        System.out.println("Hilux stop");
    }

    @Override
    public void drive() {
        System.out.println("Hilux drive");
    }
}
