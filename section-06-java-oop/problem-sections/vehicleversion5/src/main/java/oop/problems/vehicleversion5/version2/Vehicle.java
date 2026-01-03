package oop.problems.vehicleversion5.version2;
/*
Goal:
- Only display vehicles for sale
*/
public class Vehicle {

    private int numberOfWheels;
    private int milesPerGallonOrCharge;
    private boolean carOn = false;

    private boolean forSale;

    private int cost;

    private int passengerCount;

    private String type;

    public Vehicle(int numberOfWheels, int milesPerGallonOrCharge, boolean forSale, int cost, int passengerCount, String type) {
        this.numberOfWheels = numberOfWheels;
        this.milesPerGallonOrCharge = milesPerGallonOrCharge;
        this.forSale = forSale;
        this.cost = cost;
        this.passengerCount = passengerCount;
        this.type = type;
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

    public boolean isForSale() {
        return forSale;
    }

    public void setForSale(boolean forSale) {
        this.forSale = forSale;
    }

    public int getCost() {
        return cost;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public String getType() {
        return type;
    }
}
