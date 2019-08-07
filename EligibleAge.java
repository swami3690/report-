import java.util.Scanner;

public class EligibleAge
{
    public static void main(String[] args)
    {
        Scanner myobject = new Scanner(System.in);
        System.out.println("please enter age");

        int age = myobject.nextInt();

        if (age >= 18)
        {
            System.out.println("should be eligible to vote");
        }
        else
        {
            System.out.println("should not be eligible  for vote");
        }
    }
}


















