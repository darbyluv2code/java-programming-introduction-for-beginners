package oop.enemyversion9;

import oop.enemyversion9.enemies.Enemy;
import oop.enemyversion9.enemies.individualenemy.Ogre;
import oop.enemyversion9.enemies.individualenemy.Zombie;
import oop.enemyversion9.heros.Hero;
import oop.enemyversion9.heros.weapons.Weapon;

import static oop.enemyversion5.Enemy.getNumberOfEnemies;

public class Implementation {

    public static void main(String[] args) {
        Zombie zombie = new Zombie(10, 1);

        Ogre ogre = new Ogre(10, 3);

        System.out.println("There are " + getNumberOfEnemies()
                + " enemies ready to fight!");

        zombie.talk();
        zombie.battleStand();

        ogre.talk();
        ogre.battleStand();

       // battle(zombie, ogre);



        Zombie zombie2 = new Zombie(10, 1);
        Weapon weapon = new Weapon("Sword", 5);
        Hero hero = new Hero(25, 1);
        hero.setWeapon(weapon);
        hero.equipWeapon();
        heroBattle(hero, zombie2);
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

    public static void heroBattle(Hero hero, Enemy enemy) {
        while (hero.getHealthPointsRemaining() > 0 && enemy.getHealthPointsRemaining() > 0) {
            System.out.println("-------------");
            enemy.specialAttack();
            System.out.println("Hero: " + hero.getHealthPointsRemaining() + " HP left");
            System.out.println("Enemy: " + enemy.getHealthPointsRemaining() + " HP left ");
            enemy.attack();
            hero.setHealthPointsRemaining(hero.getHealthPointsRemaining() - enemy.getAttackDamage());
            hero.attack();
            enemy.setHealthPointsRemaining(enemy.getHealthPointsRemaining() - hero.getAttackDamage());
        }

        System.out.println("-------------");

        if (hero.getHealthPointsRemaining() > 0) {
            System.out.println("Hero wins!");
        } else {
            System.out.println("Enemy wins!");
        }
    }
}
