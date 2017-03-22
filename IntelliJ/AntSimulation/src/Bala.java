import java.util.ArrayList;
import java.util.Random;


/**
 * Created by Nick on 11/12/2016.
 */
public class Bala extends Ant{

    public void attack(){
        ArrayList<Ant> otherAnt = location.notBala();
        Random r = new Random();
        int roll = r.nextInt(2);
        if (roll == 0){
            otherAnt.get(0).death();
        }

    }

    public void move(ColonyNode node){
        location.removeAnt(this);
        location = node;
        location.addAnt(this);
    }

    //base constructor
    Bala(){

    }

    Bala(ColonyNode node){
        location = node;
        previous = -1;
    }

    public void nextTurn(int currentTurn){
        if (previous == currentTurn){
            return;
        }
        if (365 * 10 < (currentTurn - intOfBirth)){
            death();
            return;
        }


        previous = currentTurn;

        ArrayList<Ant> otherAnt = location.notBala();
        if (otherAnt.size() > 0){
            attack();
        }
        else {
            Random r = new Random();
            ArrayList<ColonyNode> colList = location.getAdjacentNodes();
            ColonyNode nextLoc;
            nextLoc = colList.get(r.nextInt(colList.size()));
            move(nextLoc);
        }
    }
}
