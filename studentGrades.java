//student.java
//student class that stores a student name and average
public class studentGrades
{
    private String name;
    private int attendance;
    private double exam;
    private double total;
    private double ca;
    private double average;
    private String letterGrade;

    public studentGrades ()
    {
      this.name = name;
      this.exam = exam;
      this. ca= ca;
      total= ca + exam + attendance;
      if  (total > 0)
          if (total <= 100)
              this.total=total;
      if (average > 0)
          if (average <= 100)
              this.average = average;

    }
    public void setName()
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAttendance()
    {
        this.attendance = attendance;
    }
    public int getAttendance()
    {
        return attendance;
    }
    public void setExam()
    {
        this.exam = exam;
    }
    public double getExam()
    {
        return exam;
    }
    public void setTotal()
    {
        this.total= total;
    }
    public double getTotal()
    {
        return total;
    }
    public void setCa()
    {
        this.ca= ca;
    }
    public double getCa()
    {
        return ca;
    }
    public void setAverage()
    {
        this.average= average;
    }
    public double getAverage()
    {
        return average;
    }


    public String getLetterGrade()
    {
        if (total >= 70)
            letterGrade = "A";
        else if (total >=60&& total <=69)
            letterGrade = "B";
        else if (total >=50&& total <=59)
            letterGrade = "C";
        else if (total >=45 && total<=49)
            letterGrade = "D";
        else if (total <45)
            letterGrade="F";

        return letterGrade;
    }
}