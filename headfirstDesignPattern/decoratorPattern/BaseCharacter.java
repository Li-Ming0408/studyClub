public class BaseCharacter extends Character {
    private double health;
    private double attack;
    private double defense;

    public BaseCharacter(String name, double health, double attack, double defense) {
        super(name);
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    @Override
    public double attack() {
        return attack;
    }

    @Override
    public double getHealth() {
        return health;
    }

    @Override
    public double getDefense() {
        return defense;
    }
}