import java.util.Scanner;

class FindCharSymbol2
{
    public static void main(String[] args)
    {
        char ch1 = '5';
        char ch2 = 'A';

        // if ch1 is digit then b1 will be "true"
        boolean b1 = Character.isDigit(ch1);

        // if ch1 is character then b3 will be true
        boolean b3 = Character.isAlphabetic(ch1);

        // if ch2 is digit then b2 will be "true"
        boolean b2 = Character.isDigit(ch2);

        //if ch2 is character then b4 will be true
        boolean b4 =Character.isAlphabetic(ch2);

        if( b1 = true )
        {
            System.out.println(" your input " + ch1+ " is DIGIT");
        }
        else if (b3 = false)
        {
            System.out.println("your input " + ch1+ " is character");
        }

        if (b2 =  false)
        {
            System.out.println("your input " +ch2 + " is DIGIT");
        }
        else if(b4 = true)
        {
            System.out.println("your input is " +ch2+ " character");
        }
    }
}
