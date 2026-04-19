public class student
{
    private String name;
    private int age = 0;
    private int grade = 0;

    private boolean is_valid_age(int age) { return age >= 1 && age <= 100; }
    private boolean is_valid_grade(int grade) {return grade >= 0 && grade <= 100; }

    // a setter; where we set the information of the student 
    // in this constructor of the class - student_record
    public student (String name, int age, int grade)
    {
        // a normal setting a value for the name variable
        this.name = name;

        // validation for age first before setting a value
        if (is_valid_age(age)) { this.age = age; }
        else { System.out.println("\nAge must be in the range of 1-100"); } 

        // same validation applies with this line of code
        if (is_valid_grade(grade)) {this.grade = grade; }
        else { System.out.println("Grade must be in the range of 0-100"); }
    }

    // getters
    public String get_name () { return name; }
    public int get_age () { return age; }
    public int get_grade () { return grade; }
}