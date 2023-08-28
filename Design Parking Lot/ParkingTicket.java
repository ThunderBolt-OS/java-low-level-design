public class ParkingTicket {
    private int floorNumber;
    private int spotNumber;
    private long entryTime;

    public ParkingTicket(int floorNumber, int spotNumber, long entryTime) {
        this.floorNumber = floorNumber;
        this.spotNumber = spotNumber;
        this.entryTime = entryTime;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public long getEntryTime() {
        return entryTime;
    }
}
