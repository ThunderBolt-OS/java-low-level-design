

// parkingspot is basically a parking space for a vehicle
public class ParkingSpot {
    private int spotNumber;
    private boolean occupied;
    private Vehicle parkedVehicle;
    private VehicleType type;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.occupied = false;
        this.parkedVehicle = null;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public int getFloorNumber() {
        return spotNumber / 100;
    }

    public VehicleType getType() {
        return type;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.occupied = true;
        this.parkedVehicle = vehicle;
    }

    public void removeVehicle() {
        this.occupied = false;
        this.parkedVehicle = null;
    }
}
