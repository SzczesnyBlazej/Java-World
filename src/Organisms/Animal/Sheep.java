package Organisms.Animal;


import main.Position;
import main.World;

public class Sheep extends Animal {
    public Sheep(Position position, World world){
        super(3,3,position,10,6,"G",world);


    }
    @Override
    public void initParams() {
        this.setPower(3);
        this.setInitiative(3);
        this.setLiveLength(10);
        this.setPowerToReproduce(6);
        this.setSign("G");
    }

    @Override
    public Organism clone() {
        return new Sheep(this.getPosition(),this.getWorld());
    }

}
