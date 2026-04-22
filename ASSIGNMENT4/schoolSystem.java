package ASSIGNMENT4;

public class schoolSystem 
{   
    protected String name;
    protected String classification;
    protected int age;

    schoolSystem(String name, int age, String classification) 
    { 
        this.name = name; 
        this.age = age; 
        this.classification = classification;
    }

    // validation if the person in schoolSystem is part of faculty or a student
    private boolean isFaculty(String classification) { return classification == "Faculty"; }

    // getters
    String getName() { return name; }
    int getAge() { return age; }

    // displaying the status of the person either a faculty member or a student
    void display_status()
    {
        if(isFaculty(classification))
        {
            System.out.println("Member of the School Faculty Team");
        }
        else
        {
            System.out.println("A Student of the School");
        }
    }

    // printing the information of the person such as it's name and age
    void information()
    {
        System.out.println("Hi I'm " + name + age + " yrs old.");
    }
}
