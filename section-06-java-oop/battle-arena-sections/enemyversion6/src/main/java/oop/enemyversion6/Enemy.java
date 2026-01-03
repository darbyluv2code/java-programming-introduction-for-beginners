package oop.enemyversion6;

public class Enemy implements IEnemy {

    /*
    Goal: Show Interface
    - Why not just use Enemy as an interface on Zombie/Ogre well we do not want to implement the same
    method every time
    -Zombie battle stance and ogre stare down
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

    @Override
    public void talk() {
        System.out.println("Be prepared to fight!");
    }

    @Override
    public void attack() {
        System.out.println("Monster attacks for " + attackDamage + " damage");
    }

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    @Override
    public int getHealthPointsRemaining() {
        return healthPointsRemaining;
    }

    @Override
    public void setHealthPointsRemaining(int healthPointsRemaining) {
        this.healthPointsRemaining = healthPointsRemaining;
    }

    @Override
    public void specialAttack() {
        System.out.println("Enemy does not have a special attack.");
    }

    @Override
    public int getId() {return id;}

}
