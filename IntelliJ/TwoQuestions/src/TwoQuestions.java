import java.util.Scanner;

/**
 * Created by Nick on 7/31/2016.
 */
public class TwoQuestions {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and i'll try to guess it.\n");
        System.out.println("Question 1) Is it an animal, vegetable, or mineral?");
        String answerOne = keyboard.next();
        System.out.println("Question 2) Is it bigger than a breadbox?");
        String answerTwo = keyboard.next();




        if(answerOne.equals("animal"))
            if(answerTwo.equals("no"))
                System.out.println("My guess is that you're thinking of a mouse. \n " +
                        "I would ask you if I'm right, but I don't actually care.");

        if(answerOne.equals("animal"))
            if(answerTwo.equals("yes"))
                System.out.println("My guess is that you're thinking of a moose \n " +
                        "I would ask you if I'm right, but I don't actually care.");

        if(answerOne.equals("mineral"))
            if(answerTwo.equals("no"))
                System.out.println("My guess is that you're thinking of a paper clip. \n " +
                        "I would ask you if I'm right, but I don't actually care.");

        if(answerOne.equals("mineral"))
            if(answerTwo.equals("yes"))
                System.out.println("My guess is that you're thinking of a Camaro. \n" +
                        "I would ask you if I'm right, but I don't actually care.");

        if(answerOne.equals("vegetable"))
            if(answerTwo.equals("no"))
                System.out.println("My guess is that you're thinking of a carrot.\n " +
                        "I would ask you if I'm right, but I don't actually care.");

        if(answerOne.equals("vegetable"))
            if(answerTwo.equals("yes"))
                System.out.println("My guess is that you're thinking of a Watermelon.\n " +
                        "I would ask you if I'm right, but I don't actually care.");
    }
}
