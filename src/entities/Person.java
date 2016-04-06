
package entities;

import java.util.ArrayList;

public abstract class Person {
    private String fName;
    private String lName;
    private int age;
    private ArrayList<String> names = new ArrayList<String>();
   
    
    public Person(String fName, String lName, int age, ArrayList<String> names)
    {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.names = names;
     names.add("Aaron");
     names.add("Vince");
     names.add("Levi");
     names.add("Sarah");
     names.add("Emily");
     names.add("McFarland");
     names.add("Maimone");
     names.add("Smith");
    }
    public void getInfo()
    {
        System.out.println("First name: " + fName + "Last name: " + lName + "Age: " + age);
    }
    
    
    
}
