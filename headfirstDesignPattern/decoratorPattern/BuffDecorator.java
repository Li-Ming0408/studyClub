public abstract class BuffDecorator extends Character {
    protected Character decoratedCharacter;

    public BuffDecorator(Character decoratedCharacter) {
        super(decoratedCharacter.name);
        this.decoratedCharacter = decoratedCharacter;
    }

    @Override
    public double attack() {
        return decoratedCharacter.attack();
    }

    @Override
    public double getHealth() {
        return decoratedCharacter.getHealth();
    }

    @Override
    public double getDefense() {
        return decoratedCharacter.getDefense();
    }
}