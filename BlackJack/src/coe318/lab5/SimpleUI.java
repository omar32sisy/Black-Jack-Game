package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        System.out.println("House Holds:\n"+game.getHouseCards()+"\n");
        System.out.println("You Hold:\n"+game.getYourCards()+"\n");    }

  @Override
    public boolean hitMe() {
       Scanner s =new Scanner(System.in);
        System.out.println("another Card? ");
        String answer=s.next();
        if (answer.equals("y"))
            return true;
        else if(answer.equals("n"));
            return false;
        
    }

  @Override
    public void gameOver() {
int yScore=game.score(game.getYourCards());
        int hScore=game.score(game.getHouseCards());
        System.out.println("Game over!");
        
        this.display();
        
        System.out.println("Your score: "+yScore+", House score"+hScore);
       
        if((hScore>21 && yScore<=21) || (yScore<=21&&hScore<=21&&yScore>hScore) )
            System.out.println("You win");
        else
            System.out.println("House wins");
           


    }

}