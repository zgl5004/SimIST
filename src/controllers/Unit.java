package controllers;

/**
 * Interim Unit class, representing a mobile object in the IST building.
 * @author lvw5264
 */
public class Unit {
    protected String name;
    protected Floor floor;
    
    public Unit(String name, Floor floor) {
        this.name = name;
        this.floor = floor;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Floor getFloor() {
        return this.floor;
    }
    
    public int getFloorLevel() {
        return this.floor.getLevel();
    }
    
    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}
