package oop.enemyversion6;

import static oop.enemyversion5.Enemy.getNumberOfEnemies;

public class Implementation {

    public static void main(String[] args) {
        Zombie zombie = new Zombie(10, 1);
        Ogre ogre = new Ogre(10, 3);

        System.out.println("There are " + getNumberOfEnemies()
                + " enemies ready to fight!");

        zombie.talk();
        zombie.battleStance();

        ogre.talk();
        ogre.stareDown();

        battle(zombie, ogre);
    }

    public static void battle(Enemy e1, Enemy e2) {

        while (e1.getHealthPointsRemaining() > 0 && e2.getHealthPointsRemaining() > 0) {
            System.out.println("-------------");
            e1.specialAttack();
            e2.specialAttack();
            System.out.println("Enemy 1: " + e1.getHealthPointsRemaining() + " HP left");
            System.out.println("Enemy 2: " + e2.getHealthPointsRemaining() + " HP left ");
            e2.attack();
            e1.setHealthPointsRemaining(e1.getHealthPointsRemaining() - e2.getAttackDamage());
            e1.attack();
            e2.setHealthPointsRemaining(e2.getHealthPointsRemaining() - e1.getAttackDamage());
        }

        System.out.println("-------------");

        if (e1.getHealthPointsRemaining() > 0) {
            System.out.println("Enemy 1 wins!");
        } else {
            System.out.println("Enemy 2 wins!");
        }
    }
}
