import java.util.Scanner;

public class SalesDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sales name ");
        String name = scanner.next();
        System.out.println("sales id");
        String id = scanner.next();
        System.out.println("basic salary");
        double salary = scanner.nextInt();
        double CommissionRate = 0.5;
        double TotalSales, Commission;
        Scanner Read = new Scanner(System.in);
        System.out.println("Please enter total sales ");
        TotalSales = Read.nextDouble();
        if (TotalSales >= 1000)
            CommissionRate = 0.08;
        Commission = CommissionRate * TotalSales;
        System.out.println("The Commision is: " + Commission);
    }
}
