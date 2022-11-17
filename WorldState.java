public class WorldState {
  private String roomMonkeyIn;
  private String roomBoxIn;
  private String roomBananasIn;
  private boolean monkeyLow;
  private boolean monkeyHasBananas;

  public static final String ROOM_A = "A";

  public String getRoomMonkeyIn(){
      return this.roomMonkeyIn;
  }

  public boolean isMonkeyAt(String room) {
      return this.roomMonkeyIn.equalsIgnoreCase(room);
  }

  public boolean isLow() {
    return this.monkeyLow;
  }

}
