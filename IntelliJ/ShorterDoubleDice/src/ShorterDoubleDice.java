import java.util.Random;

/**
 * Created by Nick on 8/3/2016.
 */
public class ShorterDoubleDice {
    public static void main(String[] args){
        Random rng = new Random();
        int roll1 = 1 + rng.nextInt(6);
        int roll2 = 1 + rng.nextInt(6);

        do {
            System.out.println("Roll #1: " + roll1);
            System.out.println("Roll #2: " + roll2);
            System.out.println("Your total is " + (roll1 + roll2));
            roll1 = 1 + rng.nextInt(6);
            roll2 = 1 + rng.nextInt(6);
        }
        while(roll1 != roll2);
        System.out.println("Roll #1: " + roll1);
        System.out.println("Roll #2: " + roll2);
        System.out.println("The total is " + (roll1 + roll2));
    }
}
