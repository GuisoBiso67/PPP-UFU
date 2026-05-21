package EX2;

public class Fit implements IVehicle {
    @Override
    public void start() {
        System.out.println("Fit start");
    }

    @Override
    public void stop() {
        System.out.println("Fit stop");
    }

    @Override
    public void drive() {
        System.out.println("Fit drive");
    }
}
