
# 🚗 Parking Lot System - Low-Level Design

## Requirements 📋

Design a parking lot system with the following features:

- 🏢 Multiple floors in the parking lot.
- 🅿️ Each floor with a specific number of parking spots.
- 🚗 Different types of vehicles (Car, Motorcycle, Truck).
- 🅿️ Parking and exiting vehicles with parking tickets.
- 💰 Calculate parking cost based on parked duration and hourly rate.
- 🚦 Allow tracking of parking spots' occupancy.

## Design Overview 🏗️

The parking lot system is designed to manage the parking and exiting of vehicles. It consists of several core components: `ParkingLot`, `Floor`, `ParkingSpot`, `ParkingTicket`, `Vehicle`, and `VehicleType`.

## Flow 🔄

1. 🚀 Initialize the parking lot with the desired number of floors and parking spots per floor.
2. 🚗 Create instances of different types of vehicles using the `Vehicle` class.
3. 🅿️ Park vehicles using the `ParkingLot`'s `parkVehicle` method, which assigns a parking spot and generates a parking ticket.
4. 🚦 To exit, use the `ParkingLot`'s `exitVehicle` method, providing the corresponding parking ticket. The method calculates the cost based on the parked duration and hourly rate.
5. 💸 Display the calculated cost for each vehicle.

## Disadvantages of This Architecture ⚠️

1. 🧩 Complexity as Scale Increases: This architecture might become complex as more features are added, such as different pricing structures, discounts, and advanced parking rules.
2. 🚧 Limited Scalability: The architecture's simplicity may limit scalability for larger parking lots or more complex requirements.
3. 🚫 Lack of Extensibility: Adding new features, such as reservation systems or integration with payment gateways, may require significant modifications.
4. ❌ Single Point of Failure: The architecture's single monolithic structure could lead to a single point of failure affecting the entire system.

## Design Patterns 🛠️

The proposed architecture could benefit from the following design patterns:

1. 🏭 **Factory Method Pattern**: Use the Factory Method pattern to create instances of different vehicle types, abstracting the instantiation process.
2. 🎯 **Strategy Pattern**: Implement the Strategy pattern for calculating parking costs. This allows flexibility to change cost calculation strategies without modifying the core logic.
3. 👀 **Observer Pattern**: Apply the Observer pattern to notify interested parties of parking spot occupancy changes.
4. 🎨 **Decorator Pattern**: Use the Decorator pattern to add additional functionality to parking spots, such as premium spots with extra services.
5. 🔄 **State Pattern**: Utilize the State pattern to manage the state of parking spots (occupied, vacant) and the associated behaviors.

