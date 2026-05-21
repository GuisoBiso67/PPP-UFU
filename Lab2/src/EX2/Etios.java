package EX2;

public class Etios implements IVehicle {
    @Override
    public void start() {
        System.out.println("Etios start");
    }

    @Override
    public void stop() {
        System.out.println("Etios stop");
    }

    @Override
    public void drive() {
        System.out.println("Etios drive");
    }
}
