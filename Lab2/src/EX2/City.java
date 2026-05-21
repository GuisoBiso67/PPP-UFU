package EX2;

public class City implements IVehicle {
    @Override
    public void start() {
        System.out.println("City start");
    }

    @Override
    public void stop() {
        System.out.println("City stop");
    }

    @Override
    public void drive() {
        System.out.println("City drive");
    }
}
