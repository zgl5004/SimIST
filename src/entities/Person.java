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
    //private String gender;
    
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
        System.out.println("Attributes");
        System.out.println("---------------------------------");
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Charisma: " + charisma);
        System.out.println("Stress: " + stress);
        System.out.println("Disipline: " + disipline);
        System.out.println("Attractiveness: " + attractiveness);
        System.out.println("Luck: " + luck);
        System.out.println();
    }

    public int getIntelligence(){
        return this.intelligence;
    }
    
    public int getCharisma(){
        return this.charisma;
    }
    
    public int getStress(){
        return this.stress;
    }
    
    public int getDisipline(){
        return this.disipline;
    }
    
    public int getAttractiveness(){
        return this.attractiveness;
    }
    
    public int getLuck(){
        return this.luck;
    }
    
}
