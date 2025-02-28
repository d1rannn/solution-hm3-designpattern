public class MUDCombinedDemo {
    public static void main(String[] args) {
        SimpleDungeonBuilder builder = (SimpleDungeonBuilder) new SimpleDungeonBuilder()
            .setDungeonName("Elder Ruins")
            .addRoom(new Room("Main Hall", "A vast chamber."))
            .addNPC(new NPC("Ancient Guardian"));
        
        Dungeon dungeon = builder.build();
        Room templateRoom = new Room("Side Chamber", "Dusty and old.");
        dungeon.display();
        
        Room clonedRoom = templateRoom.cloneEntity();
        System.out.println("Cloned Room: " + clonedRoom);
    }
}