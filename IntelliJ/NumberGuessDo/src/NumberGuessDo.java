import java.util.Random;
import java.util.Scanner;


/**
 * Created by Nick on 8/3/2016.
 */
public class NumberGuessDo {
    public static void main(String[] args){
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        int num = 1 + r.nextInt(10);
        int guess;
        int tries = 0;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        guess = keyboard.nextInt();
        tries++;
        do {
            System.out.println("That is incorrect. Guess again.");
            System.out.println("Your guess: " + guess);
            guess = keyboard.nextInt();
            tries++;
        }while (guess != num);
        System.out.println("That's right! You're a good guesser.");
        System.out.println("It only took you " + tries + " tries.");
    }
}
