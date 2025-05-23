package oop.problems.vehicleversion7;

public class Main {
    public static void main(String[] args){
        Vehicle[] vehicleSaleLot = new Vehicle[4];

        vehicleSaleLot[0] = new Car(4, 25, false, 30000, 5, "Car", new EngineOrMotor("V4"));
        vehicleSaleLot[1] = new ElectricCar(4, 25, true, 50000, 5, "Electric Car", new EngineOrMotor("Electric Motor"));
        Truck truck = new Truck(4, 16, true, 45000, 3, "Truck", new EngineOrMotor("V8"));

        truck.setItemsCurrentlyInBed(new String[]{"Chair", "stuff"});

        // truck.viewItemsCurrentlyInBed();

        vehicleSaleLot[2] = truck;

        Motorcycle motorcycle = new Motorcycle(2, 70, true, 15000, 2, "Motorcycle", new EngineOrMotor("V4"));

        // motorcycle.accelerate();

        vehicleSaleLot[3] = motorcycle;

        viewVehiclesOnLot(vehicleSaleLot);
    }

    public static void viewVehiclesOnLot(Vehicle[] vehicleSaleLot) {
        System.out.println("Number of vehicles on our lot: " + vehicleSaleLot.length);
        System.out.println("Here are the cars that are for sale: ");


        for (int x = 0; x < vehicleSaleLot.length; x++) {
            if (!vehicleSaleLot[x].isForSale()) {continue;}
            System.out.println(vehicleSaleLot[x].getType() + " has " + vehicleSaleLot[x].getNumberOfWheels() +
                " wheels, " + "can hold " + vehicleSaleLot[x].getPassengerCount() + " passengers and can drive " +
                vehicleSaleLot[x].getMilesPerGallonOrCharge() + " miles per gallon or charge and it costs : $"
                + vehicleSaleLot[x].getCost());
        }
    }
}
