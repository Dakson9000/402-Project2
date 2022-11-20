public class Move implements Operator{
    private String operatorName = "MOVE";
    private String moveFrom;
    private String moveTo;

    public Move(String from, String to) {
    this.moveFrom = from;
    this.moveTo = to;
    }

    public boolean checkPreconditions(WorldState worldState) {
    if(!worldState.isMonkeyAt(moveFrom)){
    return false;
    }

    if(!worldState.isLow()){
    return false;
    }

    return true;
    }

    public WorldState applyPostconditions(WorldState worldState) {
        WorldState newState = new WorldState(moveTo, 
            worldState.getBoxRoom(),
            worldState.getBananaRoom(), 
            worldState.isLow(), 
            worldState.isMonkeyBananas());        
        //create and return a new WorldState
        //with the monkey’s updated location
        return newState;
    }

}

