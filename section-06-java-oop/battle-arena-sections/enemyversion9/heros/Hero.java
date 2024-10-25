package oop.enemyversion9.heros;

import oop.enemyversion9.heros.weapons.Weapon;

public class Hero implements IHero {
    private int healthPoints;
    private int healthPointsRemaining;
    private int attackDamage;

    private boolean isWeaponEquipped = false;

    // Composition
    private Weapon weapon;

    public Hero (int healthPoints, int attackDamage) {
        this.healthPoints = healthPoints;
        this.healthPointsRemaining = healthPoints;
        this.attackDamage = attackDamage;
    }

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public int getHealthPointsRemaining() {
        return healthPointsRemaining;
    }

    @Override
    public void setHealthPointsRemaining(int healthPointsRemaining) {
        this.healthPointsRemaining = healthPointsRemaining;
    }

    @Override
    public int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void equipWeapon() {
        if (getWeapon() != null && !isWeaponEquipped()) {
            setAttackDamage(getAttackDamage() + weapon.getAttackIncrease());
            setWeaponEquipped(true);
        }
    }

    @Override
    public boolean isWeaponEquipped() {
        return isWeaponEquipped;
    }

    @Override
    public void setWeaponEquipped(boolean weaponEquipped) {
        isWeaponEquipped = weaponEquipped;
    }

    @Override
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    @Override
    public void attack() {
        System.out.println("Hero attacks for " + attackDamage + " damage");
    }
}
