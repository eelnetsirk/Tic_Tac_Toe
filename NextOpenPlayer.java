/**Homework 2: Tic Tac Toe
*@author Kristen Lee
*@version 09-08-2018
*/
import java.util.*;
public class NextOpenPlayer extends Player{
 /**
  *contructs new NextOpenPlayer object
  *@param board symbol, o or x
  *@param name for player object
  */
  public NextOpenPlayer(int symbol, String name){
    super(symbol, name);
  }
 /**
  *Overrides makeMove() method in Player class and makes move at next available spot.
  *@param b board object
  */
  public void makeMove(Board b){
    if(! b.boardFilled()){
      int col = 0;
      int row = 2;
      // 2,0 2,1 2,2
      // 1,0 1,1 1,2
      // 0,0,0,1,0,2
      outerloop : for(int i = 2; i >= 0; i--){
        for (int j = 0; j <= 2; j++){
          if(b.isOpen(j,i)) {
            col = i;
            row = j;
            break outerloop;
          } else continue;
        }
      }
      b.fillPosition(row, col, symbol);
    }
  }
  //TEST METHOD
  // public static void main(String[] args) {
  //   NextOpenPlayer x = new NextOpenPlayer(Board.X, "nop");
  //   Player o = new Player(Board.O, "player");
  //   x.makeMove(b);
  //   System.out.print(b.toString());
  //   o.makeMove(b);
  //   x.makeMove(b);
  //   System.out.print(b.toString());
  //   x.makeMove(b);
  //   System.out.print(b.toString());
  // }
}
