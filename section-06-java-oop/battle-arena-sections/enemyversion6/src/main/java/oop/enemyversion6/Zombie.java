package oop.enemyversion6;

public class Zombie extends Enemy implements IZombie {
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

    @Override
    public void battleStance() {
        System.out.println("Zombie cracks neck, and sticks arms out.");
    }
}

