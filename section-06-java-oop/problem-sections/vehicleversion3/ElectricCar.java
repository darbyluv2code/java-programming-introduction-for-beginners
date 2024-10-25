package oop.problems.vehicleversion3;

public class ElectricCar extends Car{


    public ElectricCar(int numberOfWheels, int milesPerGallonOrCharge) {
        super(numberOfWheels, milesPerGallonOrCharge);
    }

    @Override
    public void turnOnCar() {
        setCarOn(true);
        System.out.println("Electric motor is running");
    }

    @Override
    public void turnOffCar() {
        setCarOn(false);
        System.out.println("Electric motor is off");
    }
}
