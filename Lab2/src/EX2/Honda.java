package EX2;

public class Honda implements IVehicleMaker{
    public IVehicle makeVehicle(String modelo){
        return switch (modelo) {
            case "City" -> new City();
            case "Civic" -> new Civic();
            case "Fit" -> new Fit();
            default -> null;
        };
    }
}
