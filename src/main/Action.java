package main;

import Organisms.Animal.Organism;

public class Action {
    ActionEnum action;
    Position position;
    int value;
    Organism organism;

    public Action(ActionEnum action, Position pozycja, int value, Organism organism) {
        this.action = action;
        this.position = position;
        this.value = value;
        this.organism = organism;
    }

    public ActionEnum getAction() {
        return action;
    }

    public Position getPosition() {
        return position;
    }

    public int getValue() {
        return value;
    }

    public Organism getOrganism() {
        return organism;
    }

    @Override
    public String toString() {
        String classname=this.organism.getClass().getSimpleName();
        switch (action){
            case MOVE:
                return String.format(classname+" move from "+this.organism.getPosition()+ " to "+this.position );
            case REMOVE:
                return String.format(classname+" remove from "+this.organism.getPosition());
            case ADD:
                return String.format(classname+" added at "+this.position );
            case INCREASEPOWER:
                return String.format(classname+" move from "+this.position );
            default:
                return "";

        }
    }
}
