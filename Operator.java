public interface Operator {
  public boolean checkPreconditions(WorldState worldState);
  public WorldState applyPostconditions(WorldState worldState);
}