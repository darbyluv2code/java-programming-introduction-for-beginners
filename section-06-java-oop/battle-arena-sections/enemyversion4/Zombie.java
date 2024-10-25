package oop.enemyversion4;

public class Zombie extends Enemy {
    public Zombie(int healthPoints, int attackDamage) {
        super(healthPoints, attackDamage);
    }

    @Override
    public void talk() {
        System.out.println("*Grumbling...*");
    }

    public void spreadDisease() {
        System.out.println("Watch out, the zombie trying to spread infection!");
    }
}

