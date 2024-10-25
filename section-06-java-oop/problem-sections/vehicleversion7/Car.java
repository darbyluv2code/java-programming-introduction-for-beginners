package oop.problems.vehicleversion7;

public class Car extends Vehicle implements ICar {

    public Car(int numberOfWheels, int milesPerGallonOrCharge, boolean forSale, int cost, int passengerCount, String type, EngineOrMotor engineOrMotor) {
        super(numberOfWheels, milesPerGallonOrCharge, forSale, cost, passengerCount, type, engineOrMotor);

    }

    @Override
    public void openTrunk() {
        System.out.print("Trunk opens up");
    }
}
