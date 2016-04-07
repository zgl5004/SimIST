
package entities;

import java.util.ArrayList;

public class Person {
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
    public String getInfo()
    {
     return("First Name: " + this.fName + "Last Name: " + this.lName + " Age: " + this.age);
    }
   
    
    public static void main(String[] Args)
    {
      Professor prof = new Professor("Dave", "Smith", 34, "Bachelor's in IST", 68970);
      Student stud = new Student("Joey", "Williams", 20, 914987112, 3.1, "");
      Visitor vis = new Visitor("Vincent", "Maimone", 20);
    }
}
    
    
    

