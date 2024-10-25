package oop.problems.vehicleversion5.version2;

public class Motorcycle extends Vehicle {

    public Motorcycle (int numberOfWheels, int milesPerGallonOrCharge, boolean forSale, int cost, int passengerCount, String type) {
        super(numberOfWheels, milesPerGallonOrCharge, forSale, cost, passengerCount, type);
    }

    public void accelerate() {
        System.out.println("The bike passed the speed limit!");
    }
}
