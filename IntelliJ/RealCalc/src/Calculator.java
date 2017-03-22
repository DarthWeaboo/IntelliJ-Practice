import java.util.Scanner;

/**
 * Created by Nick on 2/20/2017.
 */
public class Calculator {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        double operand1 = 1;
        while (operand1 != 0) {
            System.out.println(">");
            operand1 = keyboard.nextDouble();
            String optr = keyboard.next();
            if (optr.equals("!")){
                System.out.println(calc(operand1, optr));
            }
            else {
                double operand2 = keyboard.nextDouble();
                System.out.println(calc(operand1, operand2, optr));
            }
            if (!optr.equals("+") && !optr.equals("-") && !optr.equals("*")
                    && !optr.equals("/") && !optr.equals("%") && !optr.equals("!")){
                operand1 = 0;
                System.out.println("Not a valid operator!");
            }
        }

    }

    public static double calc(double oprnd, double oprnd2, String operator){
        if (operator.equals("+")){
            return oprnd + oprnd2;
        }
        else if (operator.equals("-")){
            return oprnd - oprnd2;
        }
        else if (operator.equals("*")){
            return oprnd * oprnd2;
        }
        else if (operator.equals("/")){
            return oprnd / oprnd2;
        }
        else if (operator.equals("^")){
            double original = oprnd;
            for (double i = 0; i < oprnd2; i++){
                oprnd *= original;
            }
            return oprnd;

        }
        else if (operator.equals("%")){
            return oprnd % oprnd2;
        }

        return 0;
    }
    public static double calc(double oprnd, String operator){
        for (double i = oprnd-1; i > 0; i--){
            oprnd *= i;
        }
        return oprnd;
    }
}
