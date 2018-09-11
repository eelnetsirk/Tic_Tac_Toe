/**Homework 2: Tic tac toe

* The RandomPlayer class models a Tic-Tac-Toe player. When created,
* instances of this class are told if they are playing X or O, and
* given an identifying string. Then plays by moving to random open
* spots on the board.
* @author Kristen Lee
* @version 09-08-2018
*
*/
import java.util.*;
public class RandomPlayer extends Player{
  Random r = new Random();
  static Board b = new Board();
  /**
  * Contructor for RandomPlayer object that makes a move among open positions at random.
  * @param symbol for which the player will be playing, Board.O or Board.X
  * @param name String for which the player will be displayed as.
  */
  public RandomPlayer(int symbol, String name){
    super(symbol, name);
  }

  /**
  * This method makes a move by randomly picking an open space on the board using Math.random.
  * @param b board object on which we are to make a move.
  */
  public void makeMove(Board b){
    if(! b.boardFilled()){
      int r = 0;//random number index that selects a position
      List<int[]> arr = new ArrayList<int[]>();
      //for loop to add all coordinates on the board into the arraylist
      for(int i = 2; i > -1; i--){
        for(int j = 0; j < 3; j++){
          if(b.isOpen(i,j)){
            int holder[] = {i,j};
            arr.add(holder);
          }
        }
      }
      r = (int)(Math.random() * arr.size());
      int col = arr.get(r)[0];
      int row = arr.get(r)[1];
      b.fillPosition(col,row,symbol);
    }
  }
  // public static void main(String[] args) {
  //   RandomPlayer o = new RandomPlayer(Board.O, "o");
  //   RandomPlayer x = new RandomPlayer(Board.X, "x");
  //   o.makeMove(b);
  //   System.out.println(b.toString());
  //   x.makeMove(b);
  //   System.out.println(b.toString());
  //   o.makeMove(b);
  //   System.out.println(b.toString());
  //   x.makeMove(b);
  //   System.out.println(b.toString());
  //   o.makeMove(b);
  //   System.out.println(b.toString());
  //   x.makeMove(b);
  //   System.out.println(b.toString());
  //   o.makeMove(b);
  //   System.out.println(b.toString());
  //   x.makeMove(b);
  //   System.out.println(b.toString());
  //   o.makeMove(b);
  //   System.out.println(b.toString());
  //   x.makeMove(b);
  //   System.out.println(b.toString());
  // }
}
