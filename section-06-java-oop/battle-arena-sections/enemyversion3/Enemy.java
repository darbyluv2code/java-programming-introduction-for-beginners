package oop.enemyversion3;

public class Enemy {

    /*
    Goal: Show Inheritance
    - Implement Zombie object
    - Explain Superclass / super()
    - Override talk function
    - Create SpreadDisease that Parent does not have
    - Create Ogre class
    - Implement Smash
    - Explain Static
    - Static get all enemies
    - Static get id for each enemy
    -@Override
    */

    private int id;
    private int healthPoints;
    private int attackDamage;
    private static int numberOfEnemies;

    public Enemy(int healthPoints, int attackDamage) {
        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
        numberOfEnemies++;
        this.id = numberOfEnemies;
    }

    public void talk() {
        System.out.println("Be prepared to fight!");
    }

    public void walkForward() {
        System.out.println("Monster moves closer to you");
    }

    public void attack() {
        System.out.println("Monster attacks for " + attackDamage + " damage");
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

    public int getId() {return id;}
}
