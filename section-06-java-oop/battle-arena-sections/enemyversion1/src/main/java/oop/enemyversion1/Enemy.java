package oop.enemyversion1;

public class Enemy {

    /*
    Goal: Show public interface for class.
    - Talk about Abstraction
    - Display Zombie walking, speaking and attacking.
    */

    String typeOfEnemy;
    int healthPoints = 10;
    int attackDamage = 1;

    public void talk() {
        System.out.println("I am a " + typeOfEnemy + " Be prepared to fight!");
    }

    public void walkForward() {
        System.out.println(typeOfEnemy + " moves closer to you");
    }

    public void attack() {
        System.out.println(typeOfEnemy + " attacks for " + attackDamage + " damage");
    }
}
