import java.util.Scanner;

/**
 * Created by Nick on 7/31/2016.
 */
public class Adventure {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("LETS GET IT FAM");
        System.out.println("You are in a dank house! Would you like to go \"upstairs\" or into the " +
                "\"kitchen\"?");
        String q1 = keyboard.next();
        if(q1.equals("kitchen"))
        {
            System.out.println("There is a long countertop with dank dishes everywhere fam. Off to one side " +
                    "there is, as you'd expect, a LIT refrigerator. You may open the \"refrigerator\" or look in" +
                    "a \"cabinet\".");
        }

        if (q1.equals("upstairs")){
            System.out.println("Upstairs you see a hallway. At the end of the hallway is the master \"bedroom\"" +
                    ". There is also a \"bathroom\" off the hallway. Where would you like to go?");
        }

    }
}
