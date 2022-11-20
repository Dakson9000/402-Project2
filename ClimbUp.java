public class ClimbUp implements Operator{

  public boolean checkPreconditions(WorldState worldState) {
    if (worldState.getMonkeyRoom().equalsIgnoreCase(worldState.getBoxRoom())
    && worldState.isLow()) {
      return true;
    }
    return false;
  }

  public WorldState applyPostconditions(WorldState worldState) {
    // TODO Auto-generated method stub
    return null;
  }
  
}
