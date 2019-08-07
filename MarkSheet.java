import java.util.Scanner;

public class MarkSheet {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("student name");
        String name = scanner.next();
        System.out.println("roll number");
        int rollNumber = scanner.nextInt();
        System.out.println("Please enter stundent mark");
        int mark = scanner.nextInt();
        if (mark >= 80) {
            System.out.println("student pass with A+ grade");
        } else if (mark >= 60) {
            System.out.println("stundent pass with A grade");
        } else if (mark >= 50) {
            System.out.println("student pass with B grade");
        } else if (mark >= 35) {
            System.out.println("student pass with c grade");
        } else {
            System.out.println("student is fail ");
        }
    }

}

