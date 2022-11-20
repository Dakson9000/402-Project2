public class ClimbUp implements Operator {
    private String operatorName = "CLIMBUP";

    public boolean checkPreconditions(WorldState worldState) {
        if (!worldState.isMonkeyAt(worldState.getBoxRoom())) {
            return false;
        }

        if (!worldState.isLow()) {
            return false;
        }

        return true;
    }

    public WorldState applyPostconditions(WorldState worldState) {
        // create and return a new WorldState
        // with the monkey’s updated location
        return new WorldState(worldState.getMonkeyRoom(), worldState.getBoxRoom(), worldState.getBananaRoom(), false,
                worldState.isMonkeyBananas());
    }
  
}
