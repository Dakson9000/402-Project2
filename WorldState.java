public class WorldState {
  private String monkeyRoom;
  private String boxRoom;
  private String bananaRoom;
  private boolean monkeyLow;
  private boolean monkeyHasBananas;

  public static final String A = "A";
  public static final String B = "B";
  public static final String C = "C";

  public WorldState(String monkey, String box, String banana) {
    monkeyRoom = monkey;
    boxRoom = box;
    bananaRoom = banana;
  }
  public String getMonkeyRoom() {
    return bananaRoom;
    
  }

  public boolean isMonkeyAt(String room) {
    return this.roomMonkeyIn.equalsIgnoreCase(room);
  }

  public boolean isLow() {
    return this.monkeyLow;
  }

}
