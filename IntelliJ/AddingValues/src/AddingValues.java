import java.util.Scanner;

/**
 * Created by Nick on 8/3/2016.
 */
public class AddingValues {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me.");
        int num = keyboard.nextInt();
        int total = 0;
        while (num != 0) {
            System.out.print("Number: " + num + "\n");
            total += num;
            System.out.println("Your total so far is " + total);
            num = keyboard.nextInt();
        }
        System.out.println("Your total is " + total);
    }
}
