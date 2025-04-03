package factoryPattern;

public class PlayableCharacter implements Character {
    private String name;
    private int health;

    public PlayableCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public void interact() {
        System.out.println("Interacting with playable character: " + name);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
