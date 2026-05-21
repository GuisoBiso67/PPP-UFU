package EX2;

public class Civic implements IVehicle {
    @Override
    public void start() {
        System.out.println("Civic start");
    }

    @Override
    public void stop() {
        System.out.println("Civic stop");
    }

    @Override
    public void drive() {
        System.out.println("Civic drive");
    }
}
