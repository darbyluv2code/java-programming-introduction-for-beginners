package oop.enemyversion9.enemies.individualenemy;

import oop.enemyversion9.enemies.Enemy;

public class Ogre extends Enemy implements IOgre {
    public Ogre(int healthPoints, int attackDamage) {
        super(healthPoints, attackDamage);
    }

    @Override
    public void specialAttack() {
        boolean didSpecialAttackWork =  Math.random() < .20;
        if (didSpecialAttackWork) {
            setAttackDamage(getAttackDamage() + 4);
            System.out.println("Ogre gets angry and its attack has increased by 4!");
        }
    }

    @Override
    public void attack() {
        System.out.println("Ogre attacks for " + getAttackDamage() + " damage");
    }

    public void battleStand() {
        System.out.println("Ogre eyes stare at the opponent and it drops to all four limbs");
    }
}
