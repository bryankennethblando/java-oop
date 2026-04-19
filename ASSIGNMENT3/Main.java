public class Main 
{
    public static void main (String[] args)
    {
        // creating the object which is the first student
        student first_student = new student("Bryan Blando", 20, 85);
        
        // then printing the infomation using the getters
        System.out.println("Student1 Name: " + first_student.get_name());
        System.out.println("Age: " + first_student.get_age());
        System.out.println("Grade: " + first_student.get_grade());

        // the second student object
        student second_student = new student("Kafka Toml", 21, 99);

        // the info
        System.out.println("\nStudent2 Name: " + second_student.get_name());
        System.out.println("Age: " + second_student.get_age());
        System.out.println("Grade: " + second_student.get_grade());


        // testing the validation with the third student object
        student  test_student = new student("Gorilla Rod", 120, -1);

        // the age and grade will default to zero because it didn't pass the validation
        System.out.println("\nStudent Name: " + test_student.get_name());
        System.out.println("Age: " + test_student.get_age());
        System.out.println("Grade: " + test_student.get_grade());
    }
}