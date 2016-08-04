import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nick on 8/3/2016.
 */
public class KeepGuessing {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int num = 1 + r.nextInt(10);
        int guess;
        int tries = 0;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        guess = keyboard.nextInt();
        while (guess != num){
            System.out.println("Your guess: " + guess);
            System.out.println("That is incorrect. Guess again.");
            guess = keyboard.nextInt();
            tries++;
        }

        System.out.println("That's right! You're a good guesser.");
        System.out.println("It only took you " + tries + " tries.");
    }
}
