public class NPC implements CloneableGameEntity {
    private String name;

    public NPC(String name) {
        this.name = name;
    }

    public NPC cloneEntity() {
        return new NPC(this.name);
    }

    public String toString() {
        return name;
    }
}