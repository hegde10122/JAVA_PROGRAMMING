import java.security.SecureRandom;

/**
 * Created by User on 13-11-2016.
 *
 *
 * You roll two dice.Each die has six faces, which contains one,two,three,four,five and six spots respectively.
 * After the dice have come to rest, the sum of the spots on the two upward faces is calculated.
 * If the sum is 7 or 11 on the first throw, you win.
 * If the sum is 2,3 or 12 on the first throw (called craps) you lose (i.e. the house wins).
 * If the sum is 4,5,6,8,9 or 10 on the first throw, that sum becomes your point.
 * To win, you must continue rolling the dice until "you make your point" (i.e. roll that same point value).
 * YOu lose by rolling a 7 before making your point
  */
public class Craps {

    //enum type with constants that represent the game status
    private enum Status {CONTINUE,WON,LOST};

    //create secure random number generator for use in method rollDice
    private static final SecureRandom sc = new SecureRandom();

    //constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    //plays one game of craps
    public static void main(String[] args){

        int myPoint = 0; //point if no win or loss on first roll
        Status gameStatus; //can  contain CONTINUE,WON or LOST
        int sumOfDice = rollDice(); //first roll of the dice

        //determine game status and point bvased on first roll
        switch(sumOfDice){

            case SEVEN: //win with 7 on first roll
            case YO_LEVEN: //win with 11 on the first roll
                gameStatus = Status.WON;
                break;

            case SNAKE_EYES ://lose with 2 on the first roll
            case TREY: //lose with 3 on the first roll
            case BOX_CARS: //lose with 12 on the first roll
                gameStatus = Status.LOST;
                break;
            default: //did not win or lose,so remember point
                gameStatus = Status.CONTINUE; //game is not over
                myPoint = sumOfDice; //remember the point
                System.out.printf("Point is %d%n",myPoint);
                break;
        }

        //while game is not complete
        while(gameStatus == Status.CONTINUE){ //not WON or LOST
                sumOfDice = rollDice(); //roll dice again

              //determine game status
              if(sumOfDice == myPoint) //win by making point
                    gameStatus = Status.WON;
              else
                  if(sumOfDice == SEVEN) //lose by roliing 7 before point
                    gameStatus = Status.LOST;
        }

            if(gameStatus == Status.WON)
                System.out.println("player wins");
            else
                System.out.println("player loses");

    }

    //roll dice,calculate sum and display results
    private static int rollDice(){

        //pick random die values
        int die1 = 1 + sc.nextInt(6); //first die roll
        int die2 = 1 + sc.nextInt(6); //second die roll

        int sum = die1 + die2;//sum of die values

        //display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n",die1,die2,sum);

        return sum;
    }
}
