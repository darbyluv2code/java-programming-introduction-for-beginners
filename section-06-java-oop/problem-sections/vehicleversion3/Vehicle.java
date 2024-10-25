package oop.problems.vehicleversion3;
/*
Goal: Show Inheritance
- Implement Car object that extends vehicle object
- Implement ElectricCar object that extends Car object
- Within ElectricCar override turnOnCar to Electric motor is running
- Within ElectricCar override turnOffCar to Electric motor is off
-@Override
*/
public class Vehicle {

    private int numberOfWheels;
    private int milesPerGallonOrCharge;
    private boolean carOn = false;

    public Vehicle(int numberOfWheels, int milesPerGallonOrCharge) {
        this.numberOfWheels = numberOfWheels;
        this.milesPerGallonOrCharge = milesPerGallonOrCharge;
    }

    public void turnOnCar() {
        carOn = true;
        System.out.println("Engine is running");
    }

    public void turnOffCar() {
        carOn = false;
        System.out.println("Engine is off");
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getMilesPerGallonOrCharge() {
        return milesPerGallonOrCharge;
    }

    public void setMilesPerGallonOrCharge(int milesPerGallonOrCharge) {
        this.milesPerGallonOrCharge = milesPerGallonOrCharge;
    }

    public boolean isCarOn() {
        return carOn;
    }

    public void setCarOn(boolean carOn) {
        this.carOn = carOn;
    }
}
