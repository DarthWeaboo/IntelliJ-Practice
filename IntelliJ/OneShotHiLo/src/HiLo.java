import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nick on 8/3/2016.
 */
public class HiLo {
    public static void main(String[] args){
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        int ranNum = 1 + r.nextInt(100);
        int guess;
        System.out.println("I'm thinking of a number between 1-100. Guess it.");
        guess = keyboard.nextInt();
        if (ranNum == guess){
            System.out.println("You guessed it! What are the odds??");
        }
        if (guess > ranNum){
            System.out.println("Sorry, you are too high. I was thinking of " + ranNum);
        }
        if (guess < ranNum){
            System.out.println("Sorry, you are too low. I was thinking of " + ranNum);
        }
    }
}
