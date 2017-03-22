/**
 * Created by Nick on 11/12/2016.
 */
public class Ant {
    int idNumber;
    boolean isLiving;
    int lifeSpan;
    int previous;
    int intOfBirth;
    ColonyNode location;

    //custom constructor
    public Ant(ColonyNode node){
        idNumber = 0;
        lifeSpan = 0;
        previous = 0;
        isLiving = true;
        location = node;
    }

    //base constructor
    public Ant(){

    }

    public void move(ColonyNode moveTo){
        location.removeAnt(this);
        location = moveTo;
        location.addAnt(this);
    }

    public void setIdNumber(int id){
        this.idNumber = id;
    }

    public void setIntOfBirth(int currentTurn){
        intOfBirth = currentTurn;
    }

    public void death(){
        location.removeAnt(this);
    }

    public void nextTurn(int currentTurn){

    }
}
