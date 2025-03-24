public abstract class Character {
    String name;

    public Character(String name) {
        this.name = name;
    }

    public abstract double attack();

    public abstract double getHealth();

    public abstract double getDefense();
}