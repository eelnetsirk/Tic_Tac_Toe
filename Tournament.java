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
  //tracks the player that moved last, false is x and true is o
  private boolean move = false;
  Board b;// = new Board();

  public Tournament(){
    this.b = new Board();
  }

  void playGame(Player x, Player o){
    System.out.println("inside playGame()");
    x.setSymbol(Board.X);
    o.setSymbol(Board.O);


    //while getWinner returns -1, or no winners, continue to ask x and o for a move
    while((b.getWinner() == -1)&&(!b.boardFilled())){
      //move == false == x
      if(!(move)){
        move = !move;
        o.makeMove(b);
        System.out.println(b.toString());

        //move == true == o
      }
      else if(move){
        move = !move;
        x.makeMove(b);
        System.out.println(b.toString());
      }
      else if(b.boardFilled()) break;
    }//end while
    if(b.getWinner() == 1){
      System.out.println("User " + x.name + " has won!");
      System.out.println("X says: " + x.celebrate());
      System.out.println("O says: " + o.mourn());
    }
    if(b.getWinner() == 2){
      System.out.println("User " + o.name + " has won!");
      System.out.println("O says: " + o.celebrate());
      System.out.println("X says: " + x.mourn());
    }
  }
    protected boolean lastMove(){
      return move;
    }
}
