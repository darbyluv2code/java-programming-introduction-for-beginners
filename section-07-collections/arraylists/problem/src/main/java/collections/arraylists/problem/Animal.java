package collections.arraylists.problem;

public class Animal {
    private String typeOfAnimal;
    private int quantity;

    public Animal(String typeOfAnimal, int quantity) {
        this.typeOfAnimal = typeOfAnimal;
        this.quantity = quantity;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public int getQuantity() {
        return quantity;
    }
}
