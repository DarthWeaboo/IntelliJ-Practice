import java.util.Scanner;

/**
 * Created by Nick on 8/1/2016.
 */
public class GenderGame {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String gender;
        int age;
        String firstName;
        String lastName;
        String married;

        System.out.println("What is your gender (M or F): ");
        gender = keyboard.next();
        System.out.println("First name: ");
        firstName = keyboard.next();
        System.out.println("Last name: ");
        lastName = keyboard.next();
        System.out.println("Age: ");
        age = keyboard.nextInt();

        if (gender.equals("M") && age >= 20){
            System.out.println("Then I shall call you Mr. " + lastName);
        }
        if (gender.equals("M") && age < 20){
            System.out.println("Then I shall call you " + firstName + lastName);
        }
        if (gender.equals("F") && age < 20){
            System.out.println("Then I shall call you " + firstName + lastName);
        }
        if (gender.equals("F") && age >= 20){
            System.out.println("Are you married, " + firstName + " (y or n)?");
            married = keyboard.next();
            if (married.equals("y")){
                System.out.println("Then I shall call you Mrs. " + lastName);
            }
            if (married.equals("n")){
                System.out.println("Then I shall call you Ms. " + lastName);
            }
        }

    }
}
