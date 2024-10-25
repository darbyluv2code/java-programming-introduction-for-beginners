package oop.problems.vehicleversion6;

public class Car extends Vehicle implements ICar {

    public Car(int numberOfWheels, int milesPerGallonOrCharge, boolean forSale, int cost, int passengerCount, String type) {
        super(numberOfWheels, milesPerGallonOrCharge, forSale, cost, passengerCount, type);
    }

    @Override
    public void openTrunk() {
        System.out.print("Trunk opens up");
    }
}
