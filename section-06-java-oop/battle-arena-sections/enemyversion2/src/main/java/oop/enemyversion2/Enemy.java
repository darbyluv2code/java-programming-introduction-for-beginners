package oop.enemyversion2;

public class Enemy {

    /*
    Goal: Show Encapsulation
    - Display Zombie walking, speaking and attacking.
    - Display Zombie getting their health and attacking
    - Create a new Enemy Ogre who needs more attack than the Zombie
    - Use setter to set Ogre health and attack
    - What happens if you forget to add one of them? We can prevent this by creating a constructor
    - Create second Ogre object referencing
    - Create constructor
    */

    // Look into typeOfEnemy
    private String typeOfEnemy;
    private int healthPoints;
    private int attackDamage;

    public Enemy(String typeOfEnemy, int healthPoints, int attackDamage) {
        this.typeOfEnemy = typeOfEnemy;
        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
    }

    public void talk() {
        System.out.println("I am a " + typeOfEnemy + " Be prepared to fight!");
    }

    public void walkForward() {
        System.out.println(typeOfEnemy + " moves closer to you");
    }

    public void attack() {
        System.out.println(typeOfEnemy + " attacks for " + attackDamage + " damage");
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
}
