package oop.enemyversion9.heros.weapons;

public class Weapon implements IWeapon {

    private String weaponType;
    private int attackIncrease;

    public Weapon(String weaponType, int attackIncrease) {
        this.weaponType = weaponType;
        this.attackIncrease = attackIncrease;
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }

    @Override
    public int getAttackIncrease() {
        return attackIncrease;
    }
}
