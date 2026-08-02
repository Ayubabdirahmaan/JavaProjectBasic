import java.util.Scanner;

public class Example2 {
    Scanner subjects = new Scanner(System.in);
    int subject1,subject2,subject3;
    int sum;
    public  void inputUser() {
        System.out.println("Enter Subject one: ");
        subject1 = subjects.nextInt();
        System.out.println("Enter Subject two: ");
        subject2 = subjects.nextInt();
        System.out.println("Enter subject three: ");
        subject3 = subjects.nextInt();
        sum = subject1 + subject2 + subject3;
    }
    public  void  displayUser() {
        System.out.println("Total of subjects is: " + sum);
    }
}
