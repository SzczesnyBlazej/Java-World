package main;

import Organisms.Animal.Organism;
import Organisms.Animal.Wolf;

public class Main {
    public static void main(String[] args){
        World world=new World(8,8);
        Position position=new Position(0,0);
        Wolf wolf=new Wolf(position,world);


    }
}
