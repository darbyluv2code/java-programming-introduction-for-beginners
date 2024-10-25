package oop.enemyversion3;

public class Implementation {

    public static void main(String[] args){
        Zombie zombie = new Zombie(5, 1);

        zombie.talk();
        zombie.walkForward();
        System.out.println(zombie.getHealthPoints());
        zombie.spreadDisease();
/** ------------- Does not work with Enemy object */
//        Enemy zombie2 = new Enemy(5, 10);
//        zombie2.spreadDisease();


        Ogre ogre = new Ogre(20, 5);
        ogre.talk();
        ogre.walkForward();
        System.out.println(ogre.getHealthPoints());


        System.out.println(zombie.getId());
        System.out.println(ogre.getId());

    }
}
