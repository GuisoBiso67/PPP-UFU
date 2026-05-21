package EX2;

public class Main {
    public static void main(String[] args) {
        IVehicleMaker hondaFabric = FactoryVehicleSingleton.getInstanceHonda();
        IVehicleMaker toyotaFabric = FactoryVehicleSingleton.getInstanceToyota();

        IVehicle city_vehicle1 = hondaFabric.makeVehicle("City");
        IVehicle hilux_vehicle1 = toyotaFabric.makeVehicle("Hilux");

        city_vehicle1.drive();
        city_vehicle1.stop();
        city_vehicle1.start();

        hilux_vehicle1.drive();
        hilux_vehicle1.stop();
        hilux_vehicle1.start();
    }
}