package oop.problems.vehicleversion7;

/*
Goal:
- Composition
- Add new IEngineOrMotor interface with 3 method headers called:
    String getEngineType();
    void startEngine();
    void stopEngine();
- Create EngineOrMotor class that implements this interface, takes in engineormotortype and passes this into the constructor
- Use composition to add this into the vehicle (instance variables, constructor and get method)
- Add engine to constructor of all vehciles
- create new engine for each vehcile within main
*/
public abstract class Vehicle implements IVehicle {

    private int numberOfWheels;
    private int milesPerGallonOrCharge;
    private boolean carOn = false;

    private boolean forSale;

    private int cost;

    private int passengerCount;

    private String type;

    private EngineOrMotor engineOrMotor;

    public Vehicle(int numberOfWheels, int milesPerGallonOrCharge, boolean forSale, int cost, int passengerCount, String type, EngineOrMotor engineOrMotor) {
        this.numberOfWheels = numberOfWheels;
        this.milesPerGallonOrCharge = milesPerGallonOrCharge;
        this.forSale = forSale;
        this.cost = cost;
        this.passengerCount = passengerCount;
        this.type = type;
        this.engineOrMotor = engineOrMotor;
    }

    @Override
    public void turnOnCar() {
        carOn = true;
        getEngineOrMotor().startEngine();
    }

    @Override
    public void turnOffCar() {
        carOn = false;
        getEngineOrMotor().stopEngine();
    }

    @Override
    public EngineOrMotor getEngineOrMotor() {
        return engineOrMotor;
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
