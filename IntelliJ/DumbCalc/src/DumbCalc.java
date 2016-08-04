import java.util.Scanner;

/**
 * Created by Nick on 7/30/2016.
 */
public class DumbCalc {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double firstNum;
        double secondNum;
        double thirdNum;

        System.out.println("What is your first number? ");
        firstNum = keyboard.nextDouble();

        System.out.println("What is your second number? ");
        secondNum = keyboard.nextDouble();

        System.out.println("What is your third number? ");
        thirdNum = keyboard.nextDouble();

        double dumbCalc = (firstNum + secondNum + thirdNum) / 2;

        System.out.println("(" + firstNum + " + " + secondNum + " + " + thirdNum + ") / 2 is... " + dumbCalc);


    }
}
