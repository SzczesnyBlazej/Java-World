package Organisms.Animal;

import com.sun.org.apache.xpath.internal.operations.Or;
import main.Action;
import main.ActionEnum;
import main.Position;
import main.World;

import java.util.ArrayList;

public abstract class Animal extends Organism  {
    Position lastposition;

    public Animal(int power, int initiative, Position position, int liveLength, int powerToReproduce, String sign, World world) {
        super(power, initiative, position, liveLength, powerToReproduce, sign, world);
        lastposition = position;
    }

    public Position getLastposition() {
        return lastposition;
    }

    public void setLastposition(Position lastposition) {
        this.lastposition = lastposition;
    }


}
