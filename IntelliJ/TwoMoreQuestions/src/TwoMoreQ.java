import java.util.Scanner;

/**
 * Created by Nick on 7/31/2016.
 */
public class TwoMoreQ {
    public static void main(String [] agrs) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("TWO MORE QUESTIONS, BABY!\n");
        System.out.println("Think of something and I'll try to guess it!\n");
        System.out.println("Question 1) Does it stay inside or outside or both? ");
        String a1 = keyboard.next();
        System.out.println("Question 2) Is it a living thing? ");
        String a2 = keyboard.next();

        if (a1.equals("outside") && a2.equals("yes")){
            System.out.println("Then what else could you be thinking of besides a python?");
        }
        if (a1.equals("outside") && a2.equals("no")){
            System.out.println("It's a billboard.");
        }
        if (a1.equals("inside") && a2.equals("yes")){
            System.out.println("It has to be a houseplant.");
        }
        if (a1.equals("inside") && a2.equals("no")){
            System.out.println("Gonna say shower curtain");
        }
        if (a1.equals("both") && a2.equals("yes")){
            System.out.println("Dog.");
        }
        if (a1.equals("both") && a2.equals("no")){
            System.out.println("Let's guess cell phone.");
        }
    }
}
