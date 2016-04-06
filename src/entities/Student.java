/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author amm6946
 */
public abstract class Student extends Person {
    private int studentIDnum;
    private double GPA;
    private String classStanding;
    
    Student()
    {
        super();
    }
    
  public void getInfo()
  {
      super.getInfo();
      System.out.println(super.fName);
      System.out.println("ID number: " + studentIDnum + "GPA: " + GPA + "Class standing: " + classStanding);
  }
}
