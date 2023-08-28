
// enum to declare vehicle type;
// enum is a special type of data type which is basically a collection (set) of constants.
enum VehicleType {
    CAR, TRUCK, MOTORCYCLE
}

public class Vehicle{
    private String licensePlate;
    private VehicleType vehicleType;

    public Vehicle(String licensePlate, VehicleType vehicleType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }
    
    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    
}