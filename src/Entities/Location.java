/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Adam
 */
public class Location {
    private Floor floor;
    private Room room;
    private int xValue;
    
    Location(Floor floor, Room room){
        this.room = room;
        this.floor = floor;
    }
    
    
    public Room getRoom(){
        return room;
    }
    
    
    public Floor getFloor(){
        return floor;
    }
    
    
    public void setRoom(Room room){
        this.room = room;
    }
    
    
    public void setFloor(Floor floor){
        this.floor = floor;
    }
    
            
}
