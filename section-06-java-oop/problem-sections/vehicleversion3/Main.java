package oop.problems.vehicleversion3;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car(4, 25);
        System.out.println(car1.getNumberOfWheels());
        System.out.println(car1.getMilesPerGallonOrCharge());
        car1.turnOnCar();
        car1.turnOffCar();

        ElectricCar car2 = new ElectricCar(4, 36);
        System.out.println(car2.getNumberOfWheels());
        System.out.println(car2.getMilesPerGallonOrCharge());
        car2.turnOnCar();
        car2.turnOffCar();
    }
}
