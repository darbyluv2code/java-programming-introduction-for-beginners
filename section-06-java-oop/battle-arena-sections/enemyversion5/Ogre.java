package oop.enemyversion5;

public class Ogre extends Enemy {
    public Ogre(int healthPoints, int attackDamage) {
        super(healthPoints, attackDamage);
    }

    @Override
    public void talk() {
        System.out.println("Ogre is slamming is hands all around!");
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
}
