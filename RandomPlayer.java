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
    
  }


  // public void makeMove(Board b){
  //   if(! b.boardFilled()){
  //     int[][] arr = new int[3][3];
  //     int counter = 0;
  //     int r;
  //     int x = 0;
  //     int y = 0;
  //
  //     for(int i = 2; i >= 0; i--){
  //       for(int j = 0; j < 3; j++){
  //         if(b.isOpen(i,j)){
  //           counter ++;
  //           arr[i][j] = counter;
  //         }//end if
  //       }//inner for
  //     }//outer for
  //     r = (int)((Math.random() * 3) + 1);
  //     for(int i = 0; i < 3; i ++){
  //       for(int j = 0; j < 3; j++){
  //         if(arr[i][j] == r){
  //           x = i;
  //           y = j;
  //         }
  //       }
  //     }
  //     if(x == 0) x = 2;
  //     else if (x == 2) x = 0;
  //     b.fillPosition(x, y, symbol);
  //   }//end if board filled
  // }
  // public void makeMove(Board b){
  //   if(! b.boardFilled()){
  //     int col = (int)(Math.random() * 2);
  //     int row = (int)(Math.random() * 2);
  //     if(b.isOpen(col, row)) b.fillPosition(col, row, symbol);
  //   }
  // }
  public static void main(String[] args) {
    Board b = new Board();
    RandomPlayer x = new RandomPlayer(Board.X, "x");
    RandomPlayer o = new RandomPlayer(Board.O, "o");
    x.makeMove(b);
    System.out.println(b.toString());
    o.makeMove(b);
    System.out.println(b.toString());
  }
}
