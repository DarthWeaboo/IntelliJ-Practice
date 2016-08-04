import java.util.Scanner;

/**
 * Created by Nick on 7/31/2016.
 */
public class AgeMessages {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = keyboard.next();
        System.out.println("Your age: ");
        int age = keyboard.nextInt();

        if(age < 16){
            System.out.println("You can't drive, " + name + ".");
        }
        if(age > 15 && age < 18){
            System.out.println("You can drive but not vote, " + name + ".");
        }
        if(age > 17 && age < 25){
            System.out.println("You can vote but not rent a car, " + name + ".");
        }
        if(age > 24){
            System.out.println("You can do pretty much anything, " + name + ".");
        }
    }
}
