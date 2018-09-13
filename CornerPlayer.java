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
  static Board b = new Board();

  /**
  * Constructor for Corner player object.
  * @param symbol, either Board.O or Board.X
  * @param name, screen/terminal name for the corner player object
  */
  public CornerPlayer(int symbol, String name){
    super(symbol, name);
  }
  /**
  * Checks the corner spots on the board to see if they are open
  * if so, add it to an array that will store the coordinates
  * @param board, board object in which the game is played
  */
  boolean cornerOpen(Board b){
    for(int i = 2; i > -1; i--){
      for(int j = 0; j < 3; j++){
        if((!b.boardFilled()) && (b.getWinner() == -1)) {
          if(!(i == 1 && j == 1)){
            int[] holder = {i,j};
            arr.add(holder);
          }
        }
      }
    }//end outer for loop
    if(arr.size() != 0) return true;
    else return false;
  }
  /**
  * Makes a corner move if a corner spot is available. If not, it calls upon
  * make move
  //test main
  public static void main(String[] args) {
    CornerPlayer x = new CornerPlayer(Board.X, "x");
    RandomPlayer o = new RandomPlayer(Board.O, "o");
  }
}
