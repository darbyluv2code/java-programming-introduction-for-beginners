package oop.problems.vehicleversion8.vehicles;

/*
Goal:
- Organize how you please :-)

*/
public abstract class Vehicle implements IVehicle {

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

    @Override
    public void turnOnCar() {
        carOn = true;
        System.out.println("Engine is running");
    }

    @Override
    public void turnOffCar() {
        carOn = false;
        System.out.println("Engine is off");
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public int getMilesPerGallonOrCharge() {
        return milesPerGallonOrCharge;
    }

    @Override
    public void setMilesPerGallonOrCharge(int milesPerGallonOrCharge) {
        this.milesPerGallonOrCharge = milesPerGallonOrCharge;
    }

    @Override
    public boolean isCarOn() {
        return carOn;
    }

    @Override
    public void setCarOn(boolean carOn) {
        this.carOn = carOn;
    }

    @Override
    public boolean isForSale() {
        return forSale;
    }

    @Override
    public void setForSale(boolean forSale) {
        this.forSale = forSale;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public int getPassengerCount() {
        return passengerCount;
    }

    @Override
    public String getType() {
        return type;
    }
}
