package factoryPattern;

public class NPC implements NPCCharacter {
    private String npcName;

    public NPC(String npcName) {
        this.npcName = npcName;
    }

    @Override
    public void interact() {
        System.out.println("Interacting with NPC: " + npcName);
    }

    @Override
    public void talk() {
        System.out.println(npcName + " says: 'Hello, adventurer!'");
    }
}
