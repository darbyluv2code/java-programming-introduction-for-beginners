package oop.enemyversion4;

public class Ogre extends Enemy {
    public Ogre(int healthPoints, int attackDamage) {
        super(healthPoints, attackDamage);
    }

    @Override
    public void talk() {
        System.out.println("Ogre is slamming is hands all around!");
    }
}
