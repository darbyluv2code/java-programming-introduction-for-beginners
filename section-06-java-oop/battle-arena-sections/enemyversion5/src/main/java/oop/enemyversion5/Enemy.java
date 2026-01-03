package oop.enemyversion5;

public class Enemy {

    /*
    Goal: Show Full implementation of fight!
    - Special attacks
    - Make app look cleaner
    - New static method to display how many monsters are in the arena
    */

    private int id;
    private int healthPoints;
    private int healthPointsRemaining;
    private int attackDamage;
    private static int numberOfEnemies;

    public Enemy(int healthPoints, int attackDamage) {
        this.healthPoints = healthPoints;
        this.healthPointsRemaining = healthPoints;
        this.attackDamage = attackDamage;
        numberOfEnemies++;
        this.id = numberOfEnemies;
    }

    public void talk() {
        System.out.println("Be prepared to fight!");
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

    public int getHealthPointsRemaining() {
        return healthPointsRemaining;
    }

    public void setHealthPointsRemaining(int healthPointsRemaining) {
        this.healthPointsRemaining = healthPointsRemaining;
    }

    public void specialAttack() {
        System.out.println("Enemy does not have a special attack.");
    }

    public int getId() {return id;}

    public static int getNumberOfEnemies() {
        return numberOfEnemies;
    }
}
