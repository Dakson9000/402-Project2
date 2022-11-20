import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Planner {
  private WorldState worldState;
  private List<Operator> operators;
  private List<WorldState> visitedStates;
  private List<WorldState> frontierStates;


  public Planner(WorldState worldState, List<Operator> operators) {
    this.worldState = worldState;
    this.operators = operators;
    this.visitedStates = new ArrayList<WorldState>();
    this.frontierStates = new ArrayList<WorldState>();
  }


  // Planner must only generate valid plans (those that satisfy the conditions)
  // 
}
