
package entities;

public abstract class Person {
    private String fName;
    private String lName;
    private int age;
    
    public Person()
    {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }
    
    public void getInfo()
    {
        System.out.println("First name: " + fName + "Last name: " + lName + "Age: " + age);
    }
    
    
}
