package ASSIGNMENT4;

public class Main 
{
    public static void main(String[] args) 
    {
        // creating the object for the parent class schoolSystem
        schoolSystem firstStudent, facultyMember;

        // then initializing the subclass from the objects where create at the top
        firstStudent = new student("Bryan Kenneth Blando", 20, "_");
        facultyMember = new teacher("Prof. Ryke Patch", 40, "Faculty");

        // displaying their information
        firstStudent.information();
        facultyMember.information();
    }
}
