package Organisms.Plants;

import Organisms.Animal.Organism;
import main.Action;
import main.ActionEnum;
import main.Position;
import main.World;

import java.util.ArrayList;

public class Mushroom extends Plant{
    public Mushroom(Position position, World world){
        super(0,0,position,12,4,"M",world);
    }

    @Override
    public void initParams() {
        this.setPower(0);
        this.setInitiative(0);
        this.setLiveLength(12);
        this.setPowerToReproduce(4);
        this.setSign("M");

    }

    @Override
    public Organism clone() {
        return null;
    }
    @Override
    public ArrayList<Action> consequences(Organism atackingOrganism){
        ArrayList<Action> result =new ArrayList<Action>();
        if(this.getPower()<=atackingOrganism.getPower()){
            result.add(new Action(ActionEnum.REMOVE,new Position(-1,-1),0,this));
        }
        result.add(new Action(ActionEnum.REMOVE,new Position(-1,-1),0,atackingOrganism));
        return result;
    }
}
