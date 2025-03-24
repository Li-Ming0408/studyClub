public class Sacrifice extends BuffDecorator {
    public Sacrifice(Character decoratedCharacter) {
        super(decoratedCharacter);
    }

    @Override
    public double attack() {
        return decoratedCharacter.attack() * 1.2;
    }

    @Override
    public double getHealth() {
        return decoratedCharacter.getHealth() * 0.9;
    }

    @Override
    public double getDefense() {
        return decoratedCharacter.getDefense() * 1.2;
    }
}