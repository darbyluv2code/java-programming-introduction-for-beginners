package oop.problems.vehicleversion8.vehicles;

public interface IVehicle {
    void turnOnCar();

    void turnOffCar();

    int getNumberOfWheels();

    void setNumberOfWheels(int numberOfWheels);

    int getMilesPerGallonOrCharge();

    void setMilesPerGallonOrCharge(int milesPerGallonOrCharge);

    boolean isCarOn();

    void setCarOn(boolean carOn);

    boolean isForSale();

    void setForSale(boolean forSale);

    int getCost();

    int getPassengerCount();

    String getType();
}
