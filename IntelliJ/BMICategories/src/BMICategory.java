import java.util.Scanner;

/**
 * Created by Nick on 7/31/2016.
 */
public class BMICategory {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Your height in inches: ");
        int height = keyboard.nextInt();
        System.out.println("Your weight in pounds: ");
        int weight = keyboard.nextInt();

        double BMI = (weight * .45) / ((height * .025) * (height * .025));

        System.out.println("Your BMI is " + BMI);
        if (BMI < 15.0){
            System.out.println("BMI category: very severely underweight");
        }
        if (BMI < 16.0 && BMI > 15.0){
            System.out.println("BMI category: severely underweight");
        }
        if (BMI < 18.4 && BMI > 16.1){
            System.out.println("BMI category: underweight");
        }
        if (BMI < 24.9 && BMI > 18.5){
            System.out.println("BMI category: normal weight");
        }
        if (BMI < 29.9 && BMI > 25.0){
            System.out.println("BMI category: overweight");
        }
        if (BMI < 34.9 && BMI > 30.0){
            System.out.println("BMI category: moderately obese");
        }
        if (BMI < 39.9 && BMI > 35.0){
            System.out.println("BMI category: severely obese");
        }
        if (BMI > 40.0){
            System.out.println("BMI category: morbidly obese");
        }
    }
}
