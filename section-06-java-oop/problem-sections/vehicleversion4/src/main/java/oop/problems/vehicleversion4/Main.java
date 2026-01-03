package oop.problems.vehicleversion4;

public class Main {
    public static void main(String[] args){
        Vehicle[] vehicleSaleLot = new Vehicle[2];

        vehicleSaleLot[0] = new Car(4, 25);
        vehicleSaleLot[1] = new ElectricCar(4, 40);

        System.out.println("Number of vehicles on our lot: " + vehicleSaleLot.length);

        for (int x = 0; x < vehicleSaleLot.length; x++) {
            System.out.println("Vehicle has " + vehicleSaleLot[x].getNumberOfWheels() + " wheels and can drive " +
                    vehicleSaleLot[x].getMilesPerGallonOrCharge() + " per gallon or charge");
        }
    }
}
