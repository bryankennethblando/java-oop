package ASSIGNMENT4;

class student extends schoolSystem 
{
    student(String name, int age, String classification) { super(name, age, classification); }

    // overriding the sout of the information in the parent class using the 
    // value of the student subclass
    @Override
    void information()
    {
        // channing of methods of the parent class in it's subclass
        super.display_status();

        System.out.println("Hi I'm student " + getName() + " " +getAge() + " yrs old.");
    }
}
