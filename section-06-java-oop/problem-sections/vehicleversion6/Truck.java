package oop.problems.vehicleversion6;

public class Truck extends Vehicle implements ITruck {

    private String[] itemsCurrentlyInBed = new String[2];

    public Truck (int numberOfWheels, int milesPerGallonOrCharge, boolean forSale, int cost, int passengerCount, String type) {
        super(numberOfWheels, milesPerGallonOrCharge, forSale, cost, passengerCount, type);
    }

    @Override
    public String[] getItemsCurrentlyInBed() {
        return itemsCurrentlyInBed;
    }

    @Override
    public void setItemsCurrentlyInBed(String[] itemsCurrentlyInBed) {
        this.itemsCurrentlyInBed = itemsCurrentlyInBed;
    }

    @Override
    public void viewItemsCurrentlyInBed() {
        for (String item: getItemsCurrentlyInBed()) {
            System.out.println(item);
        }
    }
}
