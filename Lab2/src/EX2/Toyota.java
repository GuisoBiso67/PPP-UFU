package EX2;

public class Toyota implements IVehicleMaker{
    public IVehicle makeVehicle(String modelo) {
        return switch (modelo) {
            case "Corolla" -> new Corolla();
            case "Hilux" -> new Hilux();
            case "Etios" -> new Etios();
            default -> null;
        };
    }
}
