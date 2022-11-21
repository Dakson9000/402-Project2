public class Grab implements Operator {
    private String operatorName = "GRAB";

    public boolean checkPreconditions(WorldState worldState) {
        if (!worldState.isMonkeyAt(worldState.getBananaRoom())) {
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
        return new WorldState(worldState.getMonkeyRoom(), worldState.getBoxRoom(), worldState.getBananaRoom(), worldState.isLow(),
                true);
    }
    public String toString() {
        return operatorName;
    }
}