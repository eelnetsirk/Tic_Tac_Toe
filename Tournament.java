/**
* Homework 2: Tic Tac Toe, Tournament
* @author Kristen Lee
* @version 09-13-2018
*
* The tournament class will take two player instances and play a single round of
* tie-tac-toe between the two player instances. The first argument taken will be
* automatically considered player X (Board.X) and the second player will be considered
* player O (Board.O).
*/
import java.util.*;
public class Tournament{
  private int[][] boardArr = new int[3][3];
  Board board = new Board();
  boolean move = false;//false is x and true is o

  public Tournament(){
  }

  void playGame(Player x, Player o){
    x.setSymbol(Board.X);
    o.setSymbol(Board.O);
    while((board.getWinner() == -1)){
      x.makeMove(board);

      //1 is x
      if(board.getWinner() == 1){

      }
      //2 is o
      if(board.getWinner() == 2){

      }
    }
  }
  boolean lastMove(){
    return move;
  }
}
