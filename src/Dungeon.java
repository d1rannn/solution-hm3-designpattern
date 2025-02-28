import java.util.List;

public class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }

    public void display() {
        System.out.println("Dungeon: " + name);
        System.out.println("Rooms: " + rooms);
        System.out.println("NPCs: " + npcs);
    }
}