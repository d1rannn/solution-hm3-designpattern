public class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
            .setDungeonName("Shadow Cave")
            .addRoom(new Room("Entrance Hall", "Dark and damp."))
            .addNPC(new NPC("Goblin King"))
            .build();
        dungeon.display();
    }
}