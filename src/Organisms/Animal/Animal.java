package Organisms.Animal;

import com.sun.org.apache.xpath.internal.operations.Or;
import main.Action;
import main.ActionEnum;
import main.Position;
import main.World;

import java.util.ArrayList;

public class Animal extends Organism{
    Position lastposition;
    public Animal(int power, int initiative, Position position, int liveLength, int powerToReproduce, String sign, World world){
        super(power,initiative,position,liveLength,powerToReproduce,sign,world);
        lastposition=position;
    }

    public Position getLastposition() {
        return lastposition;
    }

    public void setLastposition(Position lastposition) {
        this.lastposition = lastposition;
    }
    public ArrayList move(){
        ArrayList<Action> actions =new ArrayList<>();
        ArrayList<Position> positions=this.getNeighboringPosition;
        Position newPosition;

        if(!positions.isEmpty()){
            java.util.Random random=new java.util.Random();
            int newPositionIndex=random.nextInt(positions.size());
            newPosition=(Position) positions.get(newPositionIndex);
            actions.add(new Action(ActionEnum.MOVE,newPosition,0,this));
            this.setLastposition(this.position);
            Organisms.Organism metOrganism=this.world.getOrganismFromPosition(newPosition);
            if(metOrganism!=null){
                for(Action consequence:metOrganism.consequences(this)){
                    actions.add(consequence);
                }
            }
        }
        return actions;
    }
}
