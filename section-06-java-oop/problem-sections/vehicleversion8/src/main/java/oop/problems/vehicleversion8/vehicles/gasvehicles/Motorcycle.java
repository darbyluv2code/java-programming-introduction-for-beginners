package oop.problems.vehicleversion8.vehicles.gasvehicles;

import oop.problems.vehicleversion8.vehicles.Vehicle;

public class Motorcycle extends Vehicle implements IMotorcycle {

    public Motorcycle (int numberOfWheels, int milesPerGallonOrCharge, boolean forSale, int cost, int passengerCount, String type) {
        super(numberOfWheels, milesPerGallonOrCharge, forSale, cost, passengerCount, type);
    }

    @Override
    public void accelerate() {
        System.out.println("The bike passed the speed limit!");
    }
}
