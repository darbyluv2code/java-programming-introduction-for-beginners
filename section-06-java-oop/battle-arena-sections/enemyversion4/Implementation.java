package oop.enemyversion4;

public class Implementation {

    public static void main(String[] args) {
        Zombie zombie = new Zombie(10, 1);
        zombie.spreadDisease();
        Ogre ogre = new Ogre(20, 3);

        battle(zombie);
        battle(ogre);
    }

    public static void battle(Enemy e) {
        e.talk();
        e.attack();
    }
}
