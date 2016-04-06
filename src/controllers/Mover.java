package controllers;

import java.util.ArrayList;

public abstract class Mover {

    protected ArrayList<Floor> floors;

    public Mover() {
        ArrayList<Floor> floors = new ArrayList<Floor>();
    }

    public void addFloor(Floor f) {
        floors.add(f);
    }

    public void removeFloor(Floor f) {
        floors.remove(f);
    }

    //Needs to be overridden by child classes.
    public abstract void moveUp(int floorNum);
    
    public abstract void moveDown(int floorNum); 

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }

}