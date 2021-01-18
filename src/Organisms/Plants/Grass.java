package Organisms.Plants;

import Organisms.Animal.Organism;
import main.Position;
import main.World;

public class Grass extends Plant{
    public Grass(Position position, World world){
        super(0,0,position,6,3,"G",world);
    }

    @Override
    public Organism clone() {
        return new Grass(this.getPosition(),this.getWorld());
    }

    @Override
    public void initParams() {
        this.setPower(0);
        this.setInitiative(0);
        this.setLiveLength(6);
        this.setSign("G");
        this.setPowerToReproduce(3);
        return null;
    }
}
