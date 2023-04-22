public class Student {
    String firstName, lastName, year, course, section;
    float midtermGrade, finalGrade, averageGrade;

    Student(String firstName, String lastName, String year, String course, String section, float midtermGrade, float finalGrade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.course = course;
        this.section = section;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

    void introduceSelf(){
        System.out.println("Full Name : " + firstName + " " + lastName);
        System.out.println("Course    : " + course);
        System.out.println("Section   : " + section);
    }

    void evaluateGrade(){
        averageGrade = (midtermGrade + finalGrade)/2;

        if (averageGrade  >= 75.0f){
            System.out.println("Your average grade is " + averageGrade + " you passed");
        }
        else if(averageGrade >= 95.0f){
            System.out.println("Your average grade is " + averageGrade + " You are an honor student");
        }
        else{
            System.out.println("Your average grade is " + averageGrade + " You failed");
        }
        
        } 
}
