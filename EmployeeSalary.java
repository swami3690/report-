import java.util.Scanner;

public class EmployeeSalary {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("employee name ");
        String name = scanner.next();
        System.out.println("employee id");
        String id = scanner.next();
        System.out.println("basic salary");
        double salary = scanner.nextInt();
        double HRA = ((salary*10)/100);
        System.out.println("HRA"+HRA);
        double DA = ((salary*8)/100);
        System.out.println("DA"+DA);
        double TA = ((salary*9)/100);
        System.out.println("TA"+TA);
        double PF = ((salary*20)/100);
        System.out.println("PF"+PF);
        double grosssalary = (salary+HRA+DA+TA-PF);
        System.out.println("gross salary"+ grosssalary);









    }





    }



