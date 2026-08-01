import java.util.Scanner;

public class Testclass {
    public  void Testclass() {
        Scanner solution = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = solution.nextByte();
        System.out.println("Enter number 2: ");
        int number2 = solution.nextInt();

        int sum = number1 + number2;
        System.out.println("Total number is:" + sum);
    }
}
