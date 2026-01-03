package oop.enemyversion5;

public class Zombie extends Enemy {
    public Zombie(int healthPoints, int attackDamage) {
        super(healthPoints, attackDamage);
    }

    @Override
    public void talk() {
        System.out.println("*Grumbling...*");
    }

    @Override
    public void specialAttack() {
        boolean didSpecialAttackWork =  Math.random() < .50;
        if (didSpecialAttackWork) {
            setHealthPointsRemaining(getHealthPointsRemaining() + 2);
            System.out.println("Zombie regenerated 2 HP!");
        }
    }

    @Override
    public void attack() {
        System.out.println("Zombie attacks for " + getAttackDamage() + " damage");
    }
}

