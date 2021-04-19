import java.util.Scanner;


public class HealthProfile1test
{


    public static void main(String[] args)
    {
        HealthProfile1 User1 = new Healthprofile1();

        Scanner input = new Scanner (System.in);

        System.out.print("Enter your first name:");
        String firstname = input.nextLine();
        User1.setName(firstname);
        System.out.printf("first name:", User1.getfirstname());



    }
}
