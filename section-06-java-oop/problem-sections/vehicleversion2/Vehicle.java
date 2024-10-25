package oop.problems.vehicleversion2;
/*
 * Make all class variables private & Use Encapsulation to set and get the data
 * Enhance vehicle to use encapsulation
 * Then create a constructor and enhance our vehicle again to use constructors
 * Create new vehicle with 2 wheels and 36 milespergallon
 * */
public class Vehicle {

    private int numberOfWheels;
    private int milesPerGallonOrCharge;
    private boolean carOn = false;

    public Vehicle(int numberOfWheels, int milesPerGallonOrCharge) {
        this.numberOfWheels = numberOfWheels;
        this.milesPerGallonOrCharge = milesPerGallonOrCharge;
    }

    public void turnOnCar() {
        setCarOn(true);
        System.out.println("Engine is running");
    }

    public void turnOffCar() {
        setCarOn(true);
        System.out.println("Engine is off");
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

//    public void setNumberOfWheels(int numberOfWheels) {
//        this.numberOfWheels = numberOfWheels;
//    }

    public int getMilesPerGallonOrCharge() {
        return milesPerGallonOrCharge;
    }

//    public void setMilesPerGallonOrCharge(int milesPerGallonOrCharge) {
//        this.milesPerGallonOrCharge = milesPerGallonOrCharge;
//    }

    public boolean isCarOn() {
        return carOn;
    }

    public void setCarOn(boolean carOn) {
        this.carOn = carOn;
    }
}
