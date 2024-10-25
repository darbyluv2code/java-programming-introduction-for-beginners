package oop.problems.vehicleversion7;

public interface IVehicle {
    void turnOnCar();

    void turnOffCar();

    EngineOrMotor getEngineOrMotor();

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
