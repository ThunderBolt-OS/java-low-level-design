public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(2, 10, 2.5);

        Vehicle car1 = new Vehicle("ABC123", VehicleType.CAR);
        Vehicle motorcycle1 = new Vehicle("XYZ789", VehicleType.MOTORCYCLE);

        ParkingTicket ticket1 = parkingLot.parkVehicle(car1);
        ParkingTicket ticket2 = parkingLot.parkVehicle(motorcycle1);

        double cost1 = parkingLot.exitVehicle(ticket1);
        double cost2 = parkingLot.exitVehicle(ticket2);

        if (cost1 >= 0) {
            System.out.println("Cost for car1: $" + cost1);
        } else {
            System.out.println("Invalid ticket for car1.");
        }

        if (cost2 >= 0) {
            System.out.println("Cost for motorcycle1: $" + cost2);
        } else {
            System.out.println("Invalid ticket for motorcycle1.");
        }
    }
}