public class TransportationApplication {
    public static void main(String[] args) {
        TransportationInfo vehicle;

        vehicle = new VehicleInfo();
        vehicle.displayVehicleTypes();
        vehicle.provideInformation();
        ((VehicleInfo) vehicle).aboutTheCompany();

        vehicle = new Car();
        vehicle.displayVehicleTypes();
        vehicle.provideInformation();
        ((Car) vehicle).carInfo();

        vehicle = new Motorcycle();
        vehicle.displayVehicleTypes();
        vehicle.provideInformation();
        ((Motorcycle) vehicle).motorcycleInfo();

        vehicle = new Bicycle();
        vehicle.displayVehicleTypes();
        vehicle.provideInformation();
        ((Bicycle) vehicle).bicycleInfo();
    }
}
