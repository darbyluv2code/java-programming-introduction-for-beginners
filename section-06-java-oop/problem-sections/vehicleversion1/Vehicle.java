package oop.problems.vehicleversion1;

/*
* Create a new vehicle class that has a few variables and methods
* int number of wheels
* int miles per gallon
* boolean is car on
*
* method turnOnCar which changes the boolean above to true and prints engine is running
* method turnOffCar which changes the boolean above to false and prints engine is off
* create a new vehicle in the main.java and change wheels, mpg and run turnOn and turnOff
* */

public class Vehicle {

    int numberOfWheels;
    int milesPerGallonOrCharge;
    boolean carOn = false;

    public void turnOnCar() {
        carOn = true;
        System.out.println("Engine is running");
    }

    public void turnOffCar() {
        carOn = false;
        System.out.println("Engine is off");
    }

}
