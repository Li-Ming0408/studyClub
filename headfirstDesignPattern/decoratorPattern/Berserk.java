public class Berserk extends BuffDecorator {
    public Berserk(Character decoratedCharacter) {
        super(decoratedCharacter);
    }

    @Override
    public double attack() {
        return decoratedCharacter.attack() * 1.5;
    }

    @Override
    public double getDefense() {
        return decoratedCharacter.getDefense() * 0.5;
    }
}