package controllers;

import java.util.ArrayList;
import entities.*;
import views.*;

public class FloorController {
    private GameFrame frame1;
    private Floor floor1;
    
    public FloorController(){
        frame1 = new GameFrame("Test Room");
        frame1.add(floor1);
    }

    //protected ArrayList<Unit> unitList = new ArrayList<Unit>();

//    public void addUnit(Unit u) {
//        this.unitList.add(u);
//    }
//    
//    public void removeUnit(Unit u){
//        this.unitList.remove(u);
//    } 
//
//    public ArrayList<Unit> getUnitList() {
//        return this.unitList;
//    }
//
//    public void setUnitList(ArrayList<Unit> unitList) {
//        this.unitList = unitList;
//    }
    
    public void floorToRoom(Room room1){
        frame1.remove(floor1);
        frame1.add(room1);
        room1.setFocusable(true);
        room1.requestFocusInWindow();
        frame1.revalidate();
        frame1.repaint();
    }

}
