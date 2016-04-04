/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.util.Random;

/**
 *
 * @author Jon
 */
public class Person {
    private int intelligence;
    private int charisma;
    private int stress;
    private int disipline;
    private int attractiveness;
    private int luck;
    private String gender;
    
    Person(){
        Random rand = new Random();
        
        int intelligence = rand.nextInt(10) + 1;
        this.intelligence = intelligence;
        
        int charisma = rand.nextInt(10) + 1;
        this.charisma = charisma;
        
        int stress = rand.nextInt(10) + 1;
        this.stress = stress;
        
        int disipline = rand.nextInt(10) + 1;
        this.disipline = disipline;
        
        int attractiveness = rand.nextInt(10) + 1;
        this.attractiveness = attractiveness;
        
        int luck = rand.nextInt(10) + 1;
        this.luck = luck;
        
        //gender under construction
    }
    
    public void printAttributes(){
        
    }
    
}
