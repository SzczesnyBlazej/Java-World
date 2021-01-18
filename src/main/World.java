package main;

import java.util.ArrayList;

public class World {
    private final int X;
    private final int Y;
    private int turn;
    private ArrayList<Organism> Organisms = new ArrayList<Organism>();
    String separator=" ";

    public World(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn +=1;
    }

    public ArrayList<Organism> getOrganisms() {
        return Organisms;
    }

    public void setOrganisms(ArrayList<Organism> organisms) {
        Organisms = organisms;
    }

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public String toString(){
        String result="\nTurn:"+this.getTurn()+"\n";
        for(int Y=0;Y<this.Y;Y++){
            for(int X=0;X<this.X;X++){
                Organism organism = this.getOrganismFromPosition(new Position(X,Y));
                if(organism!=null){
                    result+=organism.toString();
                }
                else {
                    result+=separator;
                }
            }
            result+="\n";
        }
        this.setTurn(getTurn());
        return result;
    }
    public ArrayList filterFreePositions(Position position){

    }

}
