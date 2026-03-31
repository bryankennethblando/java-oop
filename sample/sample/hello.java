package sample;

class Student
{
    // 5 examples of attributes of a student
    String name;
    int age;
    int studentId;
    int grade_level;
    String gender;

    // a constructor method that modify these attributes with
    // the parameters of the attributes
    public Student(String name, int age, int studentId, int grade_level, String gender)
    {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.grade_level = grade_level;
        this.gender = gender;
        System.out.println("Information has been collected");
    }

    // a void method that only use for display and even on returning a value from the operation
    public void information()
    {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student Id: " + studentId);
        System.out.println("Grade Level: " + grade_level);
        System.out.println("Gender: " + gender);
    }

    public void greet()
    {
        System.out.println("Hello Student " + name);
        System.out.println("Welcome to your first lesson in OOP.");
    }
}

public class hello 
{
    public static void main(String[] args) 
    {
        // initializing a class paired with the constructor mehtod to pass the values on the attributes in the class
        Student studentOne = new Student("Bryan", 20, 1567, 14, "Male");

        // to call the other methods we can use the ".MethodName"
        studentOne.information(); // to print the student info
        studentOne.greet(); // to print the greeting message for student
        
    }
} 