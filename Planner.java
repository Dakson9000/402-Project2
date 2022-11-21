import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Planner {
  private WorldState worldState;
  private List<Operator> operators;
  private List<WorldState> visitedStates;
  private List<WorldState> frontierStates;


  public Planner(WorldState worldState, ArrayList<Operator> operators) {
    this.worldState = worldState;
    this.operators = operators;
    this.visitedStates = new ArrayList<WorldState>();
    this.frontierStates = new ArrayList<WorldState>();
  }
  public void getPlan() {
    System.out.println("Plan:");
    ArrayList<Operator> masterList = getAllOperators();
    while (!worldState.isMonkeyBananas()) {
      int max = 0;
      int maxIndex = 0;
      WorldState tState;
      Operator tOp;
      for (int index = 0; index < masterList.size(); index++) {
        tState = worldState.clone();
        tOp = masterList.get(index);
        if (tOp.checkPreconditions(tState)) {
          tState = tOp.applyPostconditions(tState);
          // System.out.println(tOp.toString() + ": " + tState.evaluate());
          // System.out.println(tState.toString());
          if (tState.evaluate() > max) {
            max = tState.evaluate();
            maxIndex = index;
          }
        }
      }
      System.out.println(masterList.get(maxIndex).toString());
      worldState = masterList.get(maxIndex).applyPostconditions(worldState);
      //System.out.println(worldState.toString());
    }
  }

  private ArrayList<Operator> getAllOperators() {
    String[] rooms = {"A","B","C"};
    ArrayList<Operator> opList = new ArrayList<Operator>();
    for (String room : rooms) {
      // Move & Push
      for(String secondRoom : rooms) {
        if (!room.equals(secondRoom)) {
          Move tryMove = new Move(room, secondRoom);
          Push tryPush = new Push(room, secondRoom);
          opList.add(tryMove);
          opList.add(tryPush);
        }
      }
    }
    ClimbUp tryClimb = new ClimbUp();
    Grab tryGrab = new Grab();
    opList.add(tryClimb);
    opList.add(tryGrab);
    // System.out.println(opList.toString());
    return opList;
  }
  // Planner must only generate valid plans (those that satisfy the conditions)
  //
}
