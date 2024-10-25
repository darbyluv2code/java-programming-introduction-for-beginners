package oop.enemyversion1;

public class Implementation {

    public static void main(String[] args) {
        Enemy zombie = new Enemy();

        zombie.typeOfEnemy = "Zombie";

        System.out.println(zombie.typeOfEnemy + " has " + zombie.healthPoints +
                " health points and can do attack of " + zombie.attackDamage);

        zombie.talk();
        zombie.walkForward();
        zombie.attack();
    }
}
