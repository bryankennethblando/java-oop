package ASSIGNMENT4;

class teacher extends schoolSystem 
{
    teacher(String name, int age, String classification) {super(name, age, classification);}

    @Override
    void information() 
    {
        super.display_status();
        System.out.println("Hi I'm teacher " + getName() + " " + getAge() + " yrs old");
    }
}