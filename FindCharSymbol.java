import java.util.Scanner;

public class FindCharSymbol
{
    public static void main(String[] args)
    {
        Scanner UserInput = new Scanner(System.in) ;

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

        System.out.println("B1 = "+b1);
        System.out.println("B2 = "+b2);
        System.out.println("B3 = "+b3);
        System.out.println("B4 = "+b4);
    }
}
