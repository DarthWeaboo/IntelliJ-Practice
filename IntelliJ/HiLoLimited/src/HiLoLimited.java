import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nick on 8/3/2016.
 */
public class HiLoLimited {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int num = 1 + r.nextInt(100);
        int tries = 1;
        System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
        int guess = keyboard.nextInt();


        while (guess != num && tries < 7){
            System.out.println("Guess #" + tries + ": "  +guess);
            tries++;


            if (guess < num){
                System.out.println("Sorry, your guess is too low.");
                System.out.println("Guess #" + tries + ":");
                guess = keyboard.nextInt();
            }

            if (guess > num){
                System.out.println("Sorry, your guess is too high.");
                System.out.println("Guess #" + tries + ":");
                guess = keyboard.nextInt();
            }
        }
        if (guess == num) {
            System.out.println("You guessed it! What are the odds??");
        }
        else{
            System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
        }
    }
}
