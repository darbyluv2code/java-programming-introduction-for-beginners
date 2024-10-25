package oop.enemyversion8;

public interface IHero {
    int getHealthPoints();

    int getHealthPointsRemaining();

    void setHealthPointsRemaining(int healthPointsRemaining);

    int getAttackDamage();

    Weapon getWeapon();

    void setWeapon(Weapon weapon);

    void equipWeapon();

    boolean isWeaponEquipped();

    void setWeaponEquipped(boolean weaponEquipped);

    void setAttackDamage(int attackDamage);

    void attack();
}
