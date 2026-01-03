package oop.problems.vehicleversion5.version1;

public class ElectricCar extends Car {


    public ElectricCar(int numberOfWheels, int milesPerGallonOrCharge, boolean forSale, int cost, int passengerCount, String type) {
        super(numberOfWheels, milesPerGallonOrCharge, forSale, cost, passengerCount, type);
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
}
