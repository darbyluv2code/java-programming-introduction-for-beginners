package oop.problems.vehicleversion1;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();

        vehicle.numberOfWheels = 4;
        vehicle.milesPerGallonOrCharge = 25;
        System.out.println(vehicle.numberOfWheels);
        System.out.println(vehicle.milesPerGallonOrCharge);
        vehicle.turnOnCar();
        vehicle.turnOffCar();
    }
}
