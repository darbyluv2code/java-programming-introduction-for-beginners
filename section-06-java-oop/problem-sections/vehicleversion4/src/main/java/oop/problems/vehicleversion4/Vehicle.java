package oop.problems.vehicleversion4;
/*
Goal: within main.java implement a new Array that holds two vehicles.
* Create a Car and an Electric car and stick it in the array
* Loop through the Array and print the number of wheels and miles per gallon or charge for each car..
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
