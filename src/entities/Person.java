
package entities;

import java.util.ArrayList;

public abstract class Person {
    private String fName;
    private String lName;
    private int age;
    private ArrayList<String> fnames = new ArrayList<String>();
    private ArrayList<String> lnames = new ArrayList<String>();
    
    public Person(String fName, String lName, int age)
    {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        
     fnames.add("Aaron");
     fnames.add("Vince");
     fnames.add("Levi");
     fnames.add("Sarah");
     fnames.add("Emily");
     lnames.add("McFarland");
     lnames.add("Maimone");
     lnames.add("Smith");
    }
    public void getInfo()
    {
    
    }
    public String getFName(ArrayList<String> fnames)
    {
        double rn = Math.random();
        int personFName = (int) (rn * fnames.size());
        return fnames.get(personFName);
    }
    public String getLName(ArrayList<String> lnames)
    {
        double rn = Math.random();
        int personLName = (int) (rn * lnames.size());
        return lnames.get(personLName);
    }
    
    //public static void main(String[] Args){
      //Professor prof = new Professor("Dave", "Smith", 34);
      //Student stud = new Student("Joey", "Williams", 20, 914987112, 3.1, "");
      //Visitor vis = new Visitor();//
    }
    
    
    

