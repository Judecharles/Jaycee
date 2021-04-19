//program to test studentgrades.java
;
import java.util.Scanner;

public class studentGradesTest
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        studentGrades studentsGrades1 = new studentGrades();
        int gradeCounter = 1;

      while(input.hasNext())
      {
          System.out.print("Enter student name:");
          String name= input.nextLine();
          studentsGrades1.setName();
          System.out.print("Enter student attendance score:");
          int attendance = input.nextInt();
          studentsGrades1.setAttendance();
          System.out.print("Enter student continous assessment score:");
          double ca = input.nextDouble();
          studentsGrades1.setCa();
          System.out.print("Enter the student Examination score:");
          double exam = input.nextDouble();
          studentsGrades1.setExam();
          gradeCounter++;

      }
      System.out.printf("%s%5$%28$%15s%10s%10s", "S/N","Name","Attendance",
              "Continous assessment", "Examination", "Grade");
      System.out.printf("%s%5s%28d%\t\t\t.2f%\t\t\t.2f%10s%n", gradeCounter,
              studentsGrades1.getName(),studentsGrades1.getAttendance(),studentsGrades1.getCa(),
              studentsGrades1.getExam(),studentsGrades1.getTotal());

    }
}
