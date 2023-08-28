import java.util.*;

public class ParkingLot {
    private List<Floor> floors;
    private List<ParkingTicket> activeTickets;
    private double hourlyRate;

    public ParkingLot(int numFloors, int spotsPerFloor, double hourlyRate) {
        floors = new ArrayList<>();
        for (int i = 1; i <= numFloors; i++) {
            floors.add(new Floor(i, spotsPerFloor));
        }
        activeTickets = new ArrayList<>();
        this.hourlyRate = hourlyRate;
    }

    public ParkingSpot findAvailableSpot(VehicleType vehicleType) {
        for (Floor floor : floors) {
            for (ParkingSpot spot : floor.getSpots()) {
                if (!spot.isOccupied() && spot.getType() == vehicleType) {
                    return spot;
                }
            }
        }
        return null;
    }

    public ParkingTicket parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = findAvailableSpot(vehicle.getVehicleType());
        if (spot != null) {
            spot.parkVehicle(vehicle);
            ParkingTicket ticket = new ParkingTicket(spot.getFloorNumber(), spot.getSpotNumber(), System.currentTimeMillis());
            activeTickets.add(ticket);
            return ticket;
        }
        return null;
    }

    public double exitVehicle(ParkingTicket ticket) {
        long currentTime = System.currentTimeMillis();
        for (ParkingTicket activeTicket : activeTickets) {
            if (activeTicket.equals(ticket)) {
                ParkingSpot spot = floors.get(activeTicket.getFloorNumber() - 1)
                                          .getSpots().get(activeTicket.getSpotNumber() - 1);
                spot.removeVehicle();
                activeTickets.remove(activeTicket);
                long parkedDuration = currentTime - activeTicket.getEntryTime();
                double hoursParked = parkedDuration / (1000.0 * 60 * 60);
                return hoursParked * hourlyRate;
            }
        }
        return -1; // Invalid ticket
    }
}
    