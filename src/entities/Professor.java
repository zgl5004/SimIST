/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author vqm5108
 */
public abstract class Professor extends Person
{
    private String degree;
    private int salary;
    private boolean tenure;
    
    public Professor(String fName, String lName, int age)
    {
        super(fName, lName, age);
    }
    
}
