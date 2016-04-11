package controllers;

import java.util.ArrayList;
import entities.*;
import views.*;

public class Floor {

    protected ArrayList<Unit> unitList = new ArrayList<Unit>();

    public void addUnit(Unit u) {
        this.unitList.add(u);
    }
    
    public void removeUnit(Unit u){
        this.unitList.remove(u);
    } 

    public ArrayList<Unit> getUnitList() {
        return this.unitList;
    }

    public void setUnitList(ArrayList<Unit> unitList) {
        this.unitList = unitList;
    }
    
    public void floorToRoom(Room room1){
        
    }

}
