import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nick on 8/3/2016.
 */
public class Monte {
    public static void main(String[] args){
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        int guess;
        int correct = 1 + r.nextInt(3);
        String guess1 = "       AA ## ## \n" +
                        "       AA ## ## \n" +
                        "       1  2  3";
        String guess2 = "       ## AA ## \n" +
                        "       ## AA ## \n" +
                        "       1  2  3";
        String guess3 = "       ## ## AA \n" +
                        "       ## ## AA \n" +
                        "       1  2  3";
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash \n " +
                "He glances at you out of the corner of his eye and starts shuffling. He lays \n" +
                "down three cards. \n " +
                "\n");
        System.out.println("Which one is the ace?");
        System.out.println("");
        System.out.println("        ## ## ## ");
        System.out.println("        ## ## ## ");
        System.out.println("        1  2  3  ");
        guess = keyboard.nextInt();
        if (correct == 1 && guess == 1){
            System.out.println("You nailed it! Eddie reluctantly hands over your winnings, scowling.");
            System.out.println(guess1);
        }
        if (correct == 2 && guess == 2){
            System.out.println("You nailed it! Eddie reluctantly hands over your winnings, scowling");
            System.out.println(guess2);
        }
        if (correct == 3 && guess == 3){
            System.out.println("You nailed it! Eddie reluctantly hands over your winnings, scowling");
            System.out.println(guess3);
        }
        if (guess != correct && correct == 1){
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + correct);
            System.out.println(guess1);
        }
        if (guess != correct && correct == 2){
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + correct);
            System.out.println(guess2);
        }
        if (guess != correct && correct == 3){
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + correct);
            System.out.println(guess3);
        }
    }
}
