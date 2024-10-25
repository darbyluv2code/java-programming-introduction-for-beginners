package oop.problems.vehicleversion2;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle1 = new Vehicle(4, 25);

        System.out.println(vehicle1.getNumberOfWheels());
        System.out.println(vehicle1.getMilesPerGallonOrCharge());
        vehicle1.turnOnCar();
        vehicle1.turnOffCar();

        Vehicle vehicle2 = new Vehicle(2, 36);

        System.out.println(vehicle2.getNumberOfWheels());
        System.out.println(vehicle2.getMilesPerGallonOrCharge());
        vehicle2.turnOnCar();
        vehicle2.turnOffCar();
    }
}
