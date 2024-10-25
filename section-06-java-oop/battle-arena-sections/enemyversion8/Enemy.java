package oop.enemyversion8;

public abstract class Enemy implements IEnemy {

    /*
    Goal: Create Hero and IHero & Weapon and IWeapon
    Hero will have new instances variables
    - healthPoints
    - healthPointsRemaining
    - attackDamage
    - isWeaponEquipped = false
    - weapon

    Weapon will have
    - weaponType
    - attackIncrease

    Make a hero, that can attach a weapon that increases their attack to fight a zombie or ogre

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

}
