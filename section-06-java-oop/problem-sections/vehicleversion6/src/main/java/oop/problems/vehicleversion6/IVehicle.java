package oop.problems.vehicleversion6;

public interface IVehicle {
    void turnOnCar();

    void turnOffCar();

    int getNumbersOfWheels();

    void setNumbersOfWheels(int numbersOfWheels);

    int getMilesPerGallonOrCharge();

    void setMilesPerGallonOrCharge(int milesPerGallonOrCharge);

    boolean isCarOn();

    void setIsCarOn(boolean isCarOn);

    boolean isForSale();

    int getCost();

    int getPassengerCount();

    String getType();
}
