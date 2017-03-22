/**
 * Created by Nick on 2/23/2017.
 */
public class NumberPuzzle {
    public static void main(String[] args){
        for (int i = 10; i < 99; i++){
            for (int j = 10; j < 99; j++){
                if (i + j == 60 && i - j == 14){
                    System.out.print(i);
                    System.out.println(" " + j);
                }
            }
        }
    }
}
