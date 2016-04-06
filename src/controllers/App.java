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
        // create an example unit
        Unit unit = new Unit("Example Unit");
        Person person = new Person("Example Person");
        System.out.println(unit.getName());
        System.out.println(person.getName());
        
        // create a test floor class
        //Floor floor = new Floor();
        //ArrayList<Unit> pplOnFlr = floor.getUnitList();
    }
    
}
