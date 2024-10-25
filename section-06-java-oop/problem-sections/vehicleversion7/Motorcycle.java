package oop.problems.vehicleversion7;

public class Motorcycle extends Vehicle implements IMotorcycle {

    public Motorcycle (int numberOfWheels, int milesPerGallonOrCharge, boolean forSale, int cost, int passengerCount, String type, EngineOrMotor engineOrMotor) {
        super(numberOfWheels, milesPerGallonOrCharge, forSale, cost, passengerCount, type, engineOrMotor);
    }

    @Override
    public void accelerate() {
        System.out.println("The bike passed the speed limit!");
    }
}
