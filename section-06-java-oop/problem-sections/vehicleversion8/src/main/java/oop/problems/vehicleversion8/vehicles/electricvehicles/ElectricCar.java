package oop.problems.vehicleversion8.vehicles.electricvehicles;

import oop.problems.vehicleversion8.vehicles.gasvehicles.Car;

public class ElectricCar extends Car implements IElectricCar {


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

    @Override
    public void chargeCar() {
        System.out.print("Charging car");
    }
}
