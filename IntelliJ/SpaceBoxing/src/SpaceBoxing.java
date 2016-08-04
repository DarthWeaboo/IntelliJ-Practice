import java.util.Scanner;

/**
 * Created by Nick on 7/30/2016.
 */
public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double weight;
        int planet;
        System.out.println("Please enter your current Earth weight: " );
        weight = keyboard.nextDouble();

        System.out.println("I have information for the following planets: ");
        System.out.println("   1. Venus   2. Mars    3. Jupiter");
        System.out.println("   4. Saturn  5. Uranus  6. Neptune \n");
        System.out.println("Which planet are you visiting? ");
        planet = keyboard.nextInt();

        if (planet == 1){
            weight = weight * .78;
            System.out.println("Your weight would be " + weight + " pounds on that planet.");
        }
        else if (planet == 2){
            weight = weight * .39;
            System.out.println("Your weight would be " + weight + " pounds on that planet.");
        }
        else if (planet == 3){
            weight = weight * 2.65;
            System.out.println("Your weight would be " + weight + " pounds on that planet.");
        }
        else if (planet == 4){
            weight = weight * 1.17;
            System.out.println("Your weight would be " + weight + " pounds on that planet.");
        }
        else if (planet == 5){
            weight = weight * 1.05;
            System.out.println("Your weight would be " + weight + " pounds on that planet.");
        }
        else if (planet == 6){
            weight = weight * 1.23;
            System.out.println("Your weight would be " + weight + " pounds on that planet.");
        }
        else {
            System.out.println("Incorrect input.");
        }
    }
}
