import java.util.Scanner;

/**
 * Created by Nick on 8/3/2016.
 */
public class CountingLoops {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type in a message, and I'll display it five times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();
        System.out.println("How many times? ");
        int times = keyboard.nextInt();

        int count = 0;
        while (count < times){
            System.out.println(((1 + count) * 10) + ". " + message);
            count++;
        }
    }
}
