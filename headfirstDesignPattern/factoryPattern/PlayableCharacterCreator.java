package factoryPattern;

public class PlayableCharacterCreator implements CharacterCreator {
    private String name;
    private int health;

    public PlayableCharacterCreator(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public Character createCharacter() {
        return new PlayableCharacter(name, health);
    }
}
