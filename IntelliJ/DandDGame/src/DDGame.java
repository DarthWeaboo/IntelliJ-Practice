import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nick on 8/2/2016.
 */
public class DDGame {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int stamina = 1 + r.nextInt(10);
        int strength = 1 + r.nextInt(10);
        int luck = 1 + r.nextInt(10);
        int intellect = 1 + r.nextInt(10);
        int spirit = 1 + r.nextInt(10);
        int powerLevel = stamina + strength + luck + intellect + spirit;
        System.out.println("Choose a name for your Hero! ");
        String name = keyboard.next();
        System.out.println("Good to meet you " + name + ". I wish you luck on your journey " +
                "through the perilous Dark Mountain of Darkness.");
        System.out.println("These are your stats: ");
        System.out.println("Strength: " + strength);
        System.out.println("Stamina: " + stamina);
        System.out.println("Intellect: " + intellect);
        System.out.println("Spirit: " + spirit);
        if (powerLevel > 20 && powerLevel < 35){
            System.out.println("You're looking quite strong, " + name);
        }
        if (powerLevel > 35){
            System.out.println("I've never seen a hero of your caliber in all my years! " +
                    "This journey might be easy for the likes of you, " + name);
        }
        if (powerLevel < 20 && powerLevel > 5){
            System.out.println("This journey will be a tough one, " + name);
        }
        if (powerLevel < 5){
            System.out.println("I'm sorry, " + name + ", but there is no hope for you " +
                    "on this journey.");
        }
        System.out.println("Do you wish to carry on with your journey? (yes or no)");
        String d1 = keyboard.next();
        if (d1.equals("yes")){
            System.out.println("I wish you luck, " + name);
        }
        if (d1.equals("no")) {
            System.out.println("So be it. The Dark Lord of Darkness from the Dark " +
                    "Mountain of Darkness will kill us all.");
            System.out.println("GAME OVER.");

        }


    }
}
