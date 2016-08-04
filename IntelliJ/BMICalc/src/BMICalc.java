import java.util.Scanner;

/**
 * Created by Nick on 7/30/2016.
 */
public class BMICalc {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int heightFeet;
        int heightInch;
        int weight;

        System.out.println("Your height (feet only): ");
        heightFeet = keyboard.nextInt();

        System.out.println("Your height (inches): ");
        heightInch = keyboard.nextInt();

        System.out.println("Your weight in pounds: ");
        weight = keyboard.nextInt();

        double BMI = ((weight * .45359)) / (((heightFeet*12 + heightInch) * .0254) * ((heightFeet
                *12 + heightInch) * .0254));

        System.out.println("Your BMI is " + BMI);

    }
}
