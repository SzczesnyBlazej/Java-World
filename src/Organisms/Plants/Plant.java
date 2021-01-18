package Organisms.Plants;
import main.World;
import Organisms.Animal.Organism;
import main.Action;
import main.ActionEnum;
import main.Position;


import java.util.ArrayList;

public abstract class Plant extends Organism {
    public Plant(int power, int initiative, Position position, int liveLength, int powerToReproduce, String sign, World world){
        super(power,initiative,position,liveLength,powerToReproduce,sign,world);
    }

    @Override
    public ArrayList move() {
        return new ArrayList<>();
    }

    @Override
    public ArrayList action() {
        ArrayList<Action> actions=new ArrayList<>() ;
        Organism newPlant;
        Position newPosition;
        if(this.ifReproduce()){
            ArrayList<Position> pomPosition =this.getFreeNeighbornPosition(this.position);
            if(!pomPosition.isEmpty()){
                java.util.Random random=new java.util.Random();
                int newPositionIndex=random.nextInt(pomPosition.size());
                newPosition=pomPosition.get(newPositionIndex);
                newPlant=this.clone();
                newPlant.setPosition(newPosition);
                this.setPower(this.getPower()/2);
                actions.add(new Action(ActionEnum.ADD,newPosition,0,newPlant));
            }
        }
        return actions;
    }
    public ArrayList getFreeNeighbornPosition(Position position){
        return this.world.filterFreePositions(this.getFreeNeighbornPosition(position));
    }
}
