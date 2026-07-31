import java.util.Scanner;

public class DisplayTest {
    public void DisplayOne() {
        Scanner test = new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1 = test.nextInt();
        System.out.println("Enter number 2");
        int number2 = test.nextInt();

        int sum = number1 + number2;
        System.out.println("Total is:" + sum);
    }
}
