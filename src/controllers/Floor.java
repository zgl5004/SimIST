package controllers;

import java.util.ArrayList;

public class Floor {

    protected ArrayList<Unit> unitList;

    public Floor() {
        ArrayList<Unit> unitList = new ArrayList<Unit>();
    }

    public void addUnit(Unit u) {
        unitList.add(u);
    }
    
    public void removeUnit(Unit u){
        unitList.remove(u);
    } 

    public ArrayList<Unit> getUnitList() {
        return unitList;
    }

    public void setUnitList(ArrayList<Unit> unitList) {
        this.unitList = unitList;
    }

}
