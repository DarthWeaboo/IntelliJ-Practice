import java.util.Random;

/**
 * Created by Nick on 8/3/2016.
 */
public class Fortune {
    public static void main(String[] args){
        Random r = new Random();

        int random;
        random = 1 + r.nextInt(6);
        if (random == 1){
            System.out.println("Fortune cookie says: You will find love soon.");
            System.out.println("        26 - 66 - 98 - 12 - 17 - 69");
        }
        if (random == 2){
            System.out.println("Fortune cookie says: Stick with your wife.");
            System.out.println("        78 - 27 - 16 - 45 - 71 - 85");
        }
        if (random == 3){
            System.out.println("Fortune cookie says: Danger ahead.");
            System.out.println("        34 - 88 - 64 - 52 - 11 - 38");
        }
        if (random == 4){
            System.out.println("Fortune cookie says: Great things are to come.");
            System.out.println("        16 - 74 - 48 - 42 - 13 - 24");
        }
        if (random == 5){
            System.out.println("Fortune cookie says: If you don't enjoy life then " +
                    "get a life to enjoy.");
            System.out.println("        90 - 24 - 66 - 31 - 20 - 19");
        }
        if (random == 6){
            System.out.println("Fortune cookie says:  Dank memes.");
            System.out.println("        72 - 81 - 58 - 14 - 10 - 31");
        }

    }
}
