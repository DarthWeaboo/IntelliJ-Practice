import javax.swing.*;

/**
 * Created by Nick on 7/31/2016.
 */
public class Prog611 {
    public static void main (String[] args){
        String name = JOptionPane.showInputDialog("What is your name?");

        String input = JOptionPane.showInputDialog("How old are you?");
        int age = Integer.parseInt(input);

        System.out.print("Hello, " + name + ".");
        System.out.println(" Next year, you'll be " + (age+1));

        System.exit(0);
    }
}
