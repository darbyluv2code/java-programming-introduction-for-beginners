package oop.enemyversion2;

public class Implementation {

    public static void main(String[] args){
//        Enemy zombie = new Enemy();
//        zombie.setHealthPoints(10);
//        zombie.setAttackDamage(1);
//        System.out.println("Zombie has " + zombie.getHealthPoints() +
//                " health points and can do attack of " + zombie.getAttackDamage());
//
//        zombie.talk();
//        zombie.walkForward();
//        zombie.attack();
//
//        System.out.println("----");
/**-----------------------*/
//        Enemy ogre = new Enemy();
//        ogre.setHealthPoints(20);
//        ogre.setAttackDamage(3);
//
//        System.out.println("Ogre has " + ogre.getHealthPoints() +
//                " health points and can do attack of " + ogre.getAttackDamage());
//
//        ogre.talk();
//        ogre.walkForward();
//        ogre.attack();
/**-----------------------*/
//        Enemy ogre = new Enemy(20, 3);
//
//        System.out.println("Ogre has " + ogre.getHealthPoints() +
//                " health points and can do attack of " + ogre.getAttackDamage());
//
//        ogre.talk();
//        ogre.walkForward();
//        ogre.attack();
/**-----------------------*/
        Enemy ogre1 = new Enemy("Ogre", 20, 3);

        Enemy ogre2 = ogre1;

        ogre1.setHealthPoints(15);

        System.out.println(ogre1.getHealthPoints());
        System.out.println(ogre2.getHealthPoints());

    }
}
