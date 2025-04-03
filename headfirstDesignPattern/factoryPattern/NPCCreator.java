package factoryPattern;

public class NPCCreator implements CharacterCreator {

    private String npcName;

    public NPCCreator(String npcName) {
        this.npcName = npcName;
    }

    @Override
    public Character createCharacter() {
        return new NPC(npcName);
    }
}
