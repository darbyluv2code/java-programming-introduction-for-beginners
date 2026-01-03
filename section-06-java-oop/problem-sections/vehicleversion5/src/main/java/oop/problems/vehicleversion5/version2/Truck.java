package oop.problems.vehicleversion5.version2;

public class Truck extends Vehicle {

    private String[] itemsCurrentlyInBed = new String[2];

    public Truck (int numberOfWheels, int milesPerGallonOrCharge, boolean forSale, int cost, int passengerCount, String type) {
        super(numberOfWheels, milesPerGallonOrCharge, forSale, cost, passengerCount, type);
    }

    public String[] getItemsCurrentlyInBed() {
        return itemsCurrentlyInBed;
    }

    public void setItemsCurrentlyInBed(String[] itemsCurrentlyInBed) {
        this.itemsCurrentlyInBed = itemsCurrentlyInBed;
    }

    public void viewItemsCurrentlyInBed() {
        for (String item: getItemsCurrentlyInBed()) {
            System.out.println(item);
        }
    }
}
