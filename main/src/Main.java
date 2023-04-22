import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("First name: ");
        String firstName = scan.nextLine();

        System.out.print("Last name: ");
        String lastName = scan.nextLine();

        System.out.print("Year: ");
        String year = scan.nextLine();

        System.out.print("Course: ");
        String course = scan.nextLine();

        System.out.print("Section: ");
        String section = scan.nextLine();

        System.out.print("Midterm Grade: ");
        float midtermGrade = scan.nextFloat();

        System.out.print("Final Grade: ");
        float finalGrade = scan.nextFloat();
        
        
        Student s = new Student(firstName, lastName, year, course, section, midtermGrade, finalGrade);
        s.introduceSelf();
        s.evaluateGrade();
    }
}
