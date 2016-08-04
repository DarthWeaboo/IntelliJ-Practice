import java.util.Scanner;

/**
 * Created by Nick on 8/3/2016.
 */
public class EnterPIN {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        int tries = 0;

        System.out.println("Welcome to the Bank of Bratticus");
        System.out.println("Enter your PIN: ");
        int entry = keyboard.nextInt();
        tries++;

        while (entry != pin && tries < 3){
            System.out.println("Incorrect PIN. Try again.");
            System.out.println("Enter your PIN: ");
            entry = keyboard.nextInt();
            tries++;
        }

        if (entry == pin) {
            System.out.println("\nPIN accepted. You now have access to your account. ");

        }
        else if (tries >= 3){
            System.out.println("You have run out tries. Account locked.");
        }
    }
}
