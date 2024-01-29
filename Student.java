/**
 * The Student class represents a student with a name and date of birth, and provides methods to
 * display the student's name and age.
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student extends StudentCourse {
    public String name;
    public String dob;

  /**
   * The function "displayName" prints the name of a student.
   */
    public void displayName() {
        System.out.println("Student Name: " + name);
    }

   // The `displayAge` method takes a date of birth (dob) as a parameter and calculates the age of the
   // student based on the current date.
    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of student: " + age +"years");


    }

   // The `main` method is the entry point of the Java program. It is the method that is executed when
   // the program is run.
    public static void main(String[] args) {
        Student s=new Student();
        StudentCourse s1 = new StudentCourse();
        s.name = "Sangeetha.M";
        s.displayName();
        s.displayAge("09-02-2004");
        s1.displayStudentcourses();
        s1.displayStudentMarks();

    }
}