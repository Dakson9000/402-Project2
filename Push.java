public class Push implements Operator {
  private String operatorName = "PUSH";
  private String pushFrom;
  private String pushTo;

  public Push(String from, String to) {
    this.pushFrom = from;
    this.pushTo = to;
  }

  public boolean checkPreconditions(WorldState worldState) {
    if (!worldState.isMonkeyAt(worldState.getBoxRoom())) {
      return false;
    }

    if (!worldState.isLow()) {
      return false;
    }

    if (!worldState.getBoxRoom().equalsIgnoreCase(pushFrom)) {
      return false;
    }

    return true;
  }

  public WorldState applyPostconditions(WorldState worldState) {
    // create and return a new WorldState
    // with the monkey’s updated location
    return new WorldState(worldState.getMonkeyRoom(), pushTo, worldState.getBananaRoom(), worldState.isLow(),
        worldState.isMonkeyBananas());
  }

  public String toString() {
    return operatorName + "(" + pushFrom + "," + pushTo + ")";
}
}
