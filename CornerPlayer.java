/**
* Homework 2: Tic Tac Toe, Corner Player
* @author Kristen Lee
* @version 09-10-2018
* The CornerPlayer class models a Tic-Tac-Toe player. When created,
* instances of this class are told if they are playing X or O, and
* given an identifying string. Then plays by moving to first open
* corner spots on the board.
*/
import java.util.*;
public class CornerPlayer extends RandomPlayer{
  // static Board b = new Board();
  Random random = new Random();
  ArrayList<String> remaining_corner_list;

  /**
  * Constructor for Corner player object.
  * @param symbol, either Board.O or Board.X
  * @param name, screen/terminal name for the corner player object
  */
  public CornerPlayer(int symbol, String name){
    super(symbol, name);
    this.remaining_corner_list = new ArrayList<String>();
    this.remaining_corner_list.add("20");
    this.remaining_corner_list.add("22");
    this.remaining_corner_list.add("00");
    this.remaining_corner_list.add("02");
  }

  /**
  * Updates the list of available corner spots, remaining_corner_list does not return.
  */
  void updateRemainingCornerList(Board b) {
    if (!b.isOpen(2,0)) {
      this.remaining_corner_list.remove("20");
    }
    if (!b.isOpen(2,2)) {
      this.remaining_corner_list.remove("22");
    }
    if (!b.isOpen(0,0)) {
      this.remaining_corner_list.remove("00");
    }
    if (!b.isOpen(0,2)) {
      this.remaining_corner_list.remove("02");
    }
  }

  /**
  * Checks the corner spots on the board to see if they are open
  * if so, add it to an array that will store the coordinates
  * @param board, board object in which the game is played
  */
  boolean cornerOpen(Board b){
    if(remaining_corner_list.size() != 0) return true;
    else return false;
  }

  /**
  * Prints the remaining available spots on the board, in arr.
  */
  public void printRemainingList() {
    for (int i = 0; i < arr.size(); i++) {
      for (int j = 0; j < arr.get(i).length; j++) {
        System.out.print(arr.get(i)[j]);
      }
      System.out.println();
    }
    System.out.println();
  }

  /**
  * Method to make a move with priority for corner spots. Otherwise, just take
  * a random spot.
  * @param board, board object
  */
  public void makeMove(Board b){
    updateRemainingCornerList(b);
    if(cornerOpen(b)){//checks for corner spots first
      //get ms since jan 1 1970
      int ms_since_1970 = (int)(System.currentTimeMillis() / 10001);
      int index = ms_since_1970 % remaining_corner_list.size();
      int col = remaining_corner_list.get(index).charAt(0) - 48;
      int row = remaining_corner_list.get(index).charAt(1) - 48;
      b.fillPosition(col,row,symbol);
      updateRemainingCornerList(b);
    } else if(!cornerOpen(b)){
      super.makeMove(b);
      updateRemainingCornerList(b);
    }
  }
}
