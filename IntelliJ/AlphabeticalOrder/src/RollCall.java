import java.util.Scanner;

/**
 * Created by Nick on 8/1/2016.
 */
public class RollCall {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String n1 = "Carswell";
        String n2 = "Jones";
        String n3 = "Smith";
        String n4 = "Young";

        String lastName;
        System.out.println("What is your last name? ");
        lastName = keyboard.next();
        int length = n1.compareTo(lastName);

        if (length > 0){
            System.out.println("This won't take long");
        }
        else {
            length = n2.compareTo(lastName);
        }
        if (length > 0){
            System.out.println("That's not too bad.");
        }
        else{
            length = n3.compareTo(lastName);
        }
        if (length > 0){
            System.out.println("Might be a bit.");
        }
        else {
            length = n4.compareTo(lastName);
        }
        if (length > 0){
            System.out.println("It's gonna be a while.");
        }
        else{
            System.out.println("I hope you have no plans today.");
        }



    }
}
