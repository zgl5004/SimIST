package controllers;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrimland
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a whole building
        Building ist = new Building();
        Floor floor1 = ist.getFloor(0);
        Floor floor2 = ist.getFloor(1);
        Floor floor3 = ist.getFloor(2);
        
        // create an example unit
        Unit item = new Unit("Example Unit");
        Person person = new Person("Example Person");
        System.out.println(item.getName());
        System.out.println(person.getName());
        
        // add people to level 1
        ArrayList<Unit> pplOnFlr = floor1.getUnitList();
        floor1.addUnit(new Person("Guy 1"));
        floor1.addUnit(new Person("Girl 1"));
                
        // display all elements in the arraylist
        for (Unit unit : floor1.getUnitList()) {
            System.out.println(unit.getName());
        }
        
    }
    
}
