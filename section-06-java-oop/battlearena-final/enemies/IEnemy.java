package battlearena.enemies;

public interface IEnemy {
    void talk();
    void attack();
    int getHealthPoints();
    int getAttackDamage();
    void setAttackDamage(int attackDamage);
    int getHealthPointsRemaining();
    void setHealthPointsRemaining(int healthPointsRemaining);
    void specialAttack();
    int getId();
}
