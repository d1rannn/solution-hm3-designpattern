public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room originalRoom = new Room("Treasure Room", "Filled with gold.");
        Room clonedRoom = originalRoom.cloneEntity();
        System.out.println("Original: " + originalRoom);
        System.out.println("Clone: " + clonedRoom);
    }
}