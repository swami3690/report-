import java.util.Scanner;

public class StudentPassOrFail {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("student marks in English");
        int mark = scanner.nextInt();
        System.out.println("student mark in Maths");
        String name = scanner.next();
        System.out.println("student marks in Sience");

        if (mark >=35){
            System.out.println("student is pass");
        }
        else if (mark<=35){
            System.out.println("Student is fail");

        }


    }
}
