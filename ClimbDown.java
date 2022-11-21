//// CLIMB DOWN /////////
public class ClimbDown implements Operator {
  private String operatorName = "CLIMBDOWN";

  // ClimbDown(): Monkey climbs down from the box

  // Precondition: Monkey and the box are in the same room, and the monkey is HIGH
  // Postcondition: Monkey is at height LOW

  public boolean checkPreconditions(WorldState worldState) {
      if (!worldState.isMonkeyAt(worldState.getBoxRoom())) {
          return false;
      }

      if (worldState.isLow()) {
          return false;
      }
      
      return true;
  }

  public WorldState applyPostconditions(WorldState worldState) {
      // create and return a new WorldState
      // with the monkey’s updated location
      return new WorldState(worldState.getMonkeyRoom(), worldState.getBoxRoom(), worldState.getBananaRoom(), true,
              worldState.isMonkeyBananas());
  }
  
  public String toString() {
    return operatorName;
  }
}
