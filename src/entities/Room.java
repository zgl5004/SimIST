package entities;

import java.util.ArrayList;

/**
 *
 * @author evangentis
 */
public class Room {
    private int roomNumber;
    private String currentClass;
    private ArrayList<Object>  desks;
    private ArrayList<Object> computers;
    
    public Room(int theRoomNumber){
       this.roomNumber =  theRoomNumber;
       this.currentClass = "";
       this.desks = new ArrayList<Object>();
       this.computers = new ArrayList<Object>();
    }

    /**
     * @return the roomNumber
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * @return the currentClass
     */
    public String getCurrentClass() {
        return currentClass;
    }

    /**
     * @param currentClass the currentClass to set
     */
    public void setCurrentClass(String currentClass) {
        this.currentClass = currentClass;
    }

    /**
     * @return the desks
     */
    public ArrayList<Object> getDesks() {
        return desks;
    }

    /**
     * @param desks the desks to set
     */
    public void setDesks(ArrayList<Object> desks) {
        this.desks = desks;
    }

    /**
     * @return the computers
     */
    public ArrayList<Object> getComputers() {
        return computers;
    }

    /**
     * @param computers the computers to set
     */
    public void setComputers(ArrayList<Object> computers) {
        this.computers = computers;
    }
    
    
}
