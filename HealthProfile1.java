package sample;

public class HealthProfile1
{
    private String firstname, lastname, gender;
    private double age, MHR, THR, BMI, THRR, Height, Weight;



    public void setName (String name)
    {
        this.firstname = name;
        this.lastname = name;
    }

    public String getfirstname()
    {
        return firstname;
    }

    public String getlastname()
    {
        return lastname;
    }

    public void setGender(String morf)
    {
        this.gender= morf;
    }

    public String getGender()
    {
        return gender;
    }

    public void setHeight(double Height)
    {
        this.Height = Height;
    }

    public double getHeight()
    {
        return Height;
    }

    public void setWeight(double Weight)
    {
        this.Weight = Weight;
    }

    public double getWeight()
    {
        return Weight;
    }

    public void setBMI (double BMI)
    {
       this.BMI = BMI;
        BMI = (Weight / (Height * Height));
    }

    public double getBMI()
    {
        return BMI;
    }

    public void setAge(double yob)
    {
        this.age = yob;
        age = 2020 - yob;
        MHR = 220 - age;
        THR = (50 * MHR)/100;
        THRR = (85 * MHR)/100;
    }

    public double getAge()
    {
        return age;
    }


}
