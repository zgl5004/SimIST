
package entities;

public abstract class Person {
    private String fName;
    private String lName;
    private int age;
    
    public Person(String fName, String lName, int age)
    {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }
    
    public void getInfo()
    {
        System.out.println("First name: " + fName + "Last name: " + lName + "Age: " + age);
    }
    
    public static void main(String[] Args){
        
    }
    
    
}
