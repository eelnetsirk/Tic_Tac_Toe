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

  /**
  * Constructor for Corner player object.
  * @param symbol, either Board.O or Board.X
  * @param name, screen/terminal name for the corner player object
  */
  public CornerPlayer(int symbol, String name){
    super(symbol, name);
  }

}
