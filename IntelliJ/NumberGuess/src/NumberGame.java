import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nick on 8/2/2016.
 */
public class NumberGame {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int secretNum = 1 + r.nextInt(10);
        System.out.println("Time to play a game bud. \n");
        System.out.println("This number will be a number from 1-10 my friend. Guess.");
        int guess = keyboard.nextInt();
        if(guess == secretNum){
            System.out.println("Dank guess.");
        }
        else {
            System.out.println("Ay lmao, ur dumb. The correct guess was " + secretNum);
        }
    }
}
