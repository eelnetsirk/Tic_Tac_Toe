/**
* Homework 2: Tic Tac Toe, Random Player
* @author Kristen Lee
* @version 09-10-2018
* The CornerPlayer class models a Tic-Tac-Toe player. When created,
* instances of this class are told if they are playing X or O, and
* given an identifying string. Then plays by moving to a randomly selected
* open spots on the board.
*/
import java.util.*;
public class RandomPlayer extends Player{
  Random random = new Random();
  List<int[]> arr = new ArrayList<int[]>();

  /**
  * Contructor for RandomPlayer object that makes a move among open positions at random.
  * @param symbol for which the player will be playing, Board.O or Board.X
  * @param b board object on which we are to make a move.
  */
  public RandomPlayer(int symbol, String name){
    super(symbol,name);
  }

  /**
  * Builds a list of available spaces.
  * @param board, board object
  */
  public void buildListOfOpenSpaces(Board b) {
    // build a list of available places to move
    for(int i = 2; i > -1; i--){
      for(int j = 0; j < 3; j++){
        if(b.isOpen(i,j)){
          int holder[] = {i,j};
          arr.add(holder);
        }
      }
    } // end building list of available spaces
  }

  /**
  * Method that empties the arraylist of available spaces on the board when called
  */
  public void emptyListOfOpenSpaces(){
    arr.clear();
  }

  /**
  * Method that makes a move by searching for all open spots on the board
  * then picks a spot using math.random to pick from an array.
  * @param board, board object in which the open spot coordinates are
  */
  public void makeMove(Board b){
    if(
      (b.getWinner() == -1) && (!(b.boardFilled()))
    ){
      buildListOfOpenSpaces(b);
      int r = (int)(Math.random() * arr.size()); //random number index that selects a position
      int col = arr.get(r)[0];
      int row = arr.get(r)[1];
      b.fillPosition(col,row,symbol);
      emptyListOfOpenSpaces();
    } else if (b.getWinner() != -1) {
      System.exit(0);
    }
  }
}
