package oop.problems.vehicleversion6;

public class ElectricCar extends Car implements IElectricCar {


    public ElectricCar(int numberOfWheels, int milesPerGallonOrCharge, boolean forSale, int cost, int passengerCount, String type) {
        super(numberOfWheels, milesPerGallonOrCharge, forSale, cost, passengerCount, type);
    }

    public void turnOnCar() {
        setCarOn(true);
        System.out.println("Electric motor is running");
    }

    public void turnOffCar() {
        setCarOn(true);
        System.out.println("Electric motor is off");
    }

    public void chargeCar() {
        System.out.print("Charging car");
    }
}
