package collections.arraylists.problem;

import java.util.ArrayList;

public class Main {

    /**
     * Create new Animal object with String typeOfAnimal and int quantity
     * Create a new ArrayList farmAnimals that holds the Animal Object
     * Add a cow, chicken, goat & pig with different quantities.
     * print and get the second index animal
     * add a new animal, duck with a quantity of your choice to the 1 index
     * remove the last animal from the ArrayList
     * Print all animals
     * */


    public static void main(String[] args) {

        ArrayList<Animal> farmAnimals = new ArrayList<>();
        farmAnimals.add(new Animal("Cow", 5));
        farmAnimals.add(new Animal("Chicken", 8));
        farmAnimals.add(new Animal("Goat", 3));
        farmAnimals.add(new Animal("Pig", 6));

        System.out.println(farmAnimals.get(2));
        farmAnimals.add(1, new Animal("Duck", 2));
        farmAnimals.remove(4);

        for (Animal a: farmAnimals) {
            System.out.println(a.getTypeOfAnimal());
        }
    }
}
