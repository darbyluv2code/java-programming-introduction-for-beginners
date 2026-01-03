package oop.enemyversion4;

public class Enemy {

    /*
    Goal: Show Polymorphism
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
