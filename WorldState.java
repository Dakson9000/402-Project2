public class WorldState {
  private String monkeyRoom;
  private String boxRoom;
  private String bananaRoom;
  private boolean monkeyLow;
  private boolean monkeyHasBananas;

  public static final String A = "A";
  public static final String B = "B";
  public static final String C = "C";

  public WorldState(String monkey, String box, String banana, boolean monkeyLow, boolean monkeyHasBananas) {
    monkeyRoom = monkey;
    boxRoom = box;
    bananaRoom = banana;
    this.monkeyLow = monkeyLow;
    this.monkeyHasBananas = monkeyHasBananas;
  }

  public String getBoxRoom() {
    return boxRoom;
  }

  public String getBananaRoom() {
    return bananaRoom;
  }

  public String getMonkeyRoom() {
    return bananaRoom;
  }

  public boolean isMonkeyAt(String room) {
    return this.monkeyRoom.equalsIgnoreCase(room);
  }

  public boolean isLow() {
    return monkeyLow;
  }

  public boolean isMonkeyBananas() {
    return monkeyHasBananas;
  }

  public String toString() {
    return "Monkey " + monkeyRoom  
    + "\nBox " + boxRoom 
    + "\nBanana " + bananaRoom
    + "\nMonkey low? " + monkeyLow
    + "\nMonkey win " + monkeyHasBananas;
  }
}
