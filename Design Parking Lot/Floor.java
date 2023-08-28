import java.util.*;

public class Floor {
    private int floorNumber;
    List<ParkingSpot> parkingSpots;

    public Floor(int floorNumber, int capacity) {
        this.floorNumber = floorNumber;
        parkingSpots = new ArrayList<>();

        for (int i = 0; i <= capacity; i++) {
            parkingSpots.add(new ParkingSpot(i));
        }

        // getting the parkingSpots values
    }
    
    public List<ParkingSpot> getSpots() {
        return parkingSpots;
    }
    
    public int getFloorNumber() {
        return floorNumber;
    }
}
