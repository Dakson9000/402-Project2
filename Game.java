import java.util.*;
public class Game {
  Scanner scan = new Scanner(System.in);
  public void startGame() {
    line();
    String monkeyRoom = getRoom("Monkey");
    String boxRoom = getRoom("Box");
    String bananaRoom = getRoom("Banana");
  }

  public void line() {
    System.out.println("====================================================");
  }

  public String getRoom(String object) {
    boolean gotValidRoom = false;
    String userRoom = "";
    while (!gotValidRoom) {
      System.out.println("Select which room the " + object + " starts in:");
      System.out.println("[1] Room A");
      System.out.println("[2] Room B");
      System.out.println("[3] Room C");
      System.out.print("==> ");

      userRoom = scan.nextLine();
      System.out.println();

      gotValidRoom = isRoom(userRoom);
      if (!gotValidRoom) {
        System.out.println("Sorry, not valid room\n");
      }
    }
    return userRoom;
  }

  public boolean isRoom(String tryRoom) {
    return (tryRoom.equalsIgnoreCase("A") 
    || tryRoom.equalsIgnoreCase("B") 
    || tryRoom.equalsIgnoreCase("C"));
  }
}
