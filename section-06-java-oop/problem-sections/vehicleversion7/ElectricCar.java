package oop.problems.vehicleversion7;

public class ElectricCar extends Car implements IElectricCar {


    public ElectricCar(int numberOfWheels, int milesPerGallonOrCharge, boolean forSale, int cost, int passengerCount, String type, EngineOrMotor engineOrMotor) {
        super(numberOfWheels, milesPerGallonOrCharge, forSale, cost, passengerCount, type, engineOrMotor);
    }

    @Override
    public void turnOnCar() {
        setCarOn(true);
        System.out.println("Electric motor is running");
    }

    @Override
    public void turnOffCar() {
        setCarOn(true);
        System.out.println("Electric motor is off");
    }

    @Override
    public void chargeCar() {
        System.out.print("Charging car");
    }
}
