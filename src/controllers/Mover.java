package controllers;

import java.util.ArrayList;

public class Mover {

    protected ArrayList<Floor> floors;
    
    public Mover(){
        ArrayList<Floor> floors = new ArrayList<Floor>();
    }
    
    public void addFloor(Floor f){
        floors.add(f);
    }
    
    public void removeFloor(Floor f){
        floors.remove(f);
    }

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }
    
}
