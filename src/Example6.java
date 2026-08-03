import java.util.Scanner;

public class Example6 {
    Scanner calculateOperators = new Scanner(System.in);
    int num1,num2,num3,num4,num5;
    int result;
    public void  inputExample () {
        System.out.println("Enter number one:");
        num1 = calculateOperators.nextInt();
        System.out.println("Enter number two: ");
        num2 = calculateOperators.nextInt();
        System.out.println("Enter number three:");
        num3 = calculateOperators.nextInt();
        System.out.println("Enter number four:");
        num4 = calculateOperators.nextInt();
        System.out.println("Enter number five");
        num5 = calculateOperators.nextInt();
        result = num1 + num2 - num3 * num4 / num5;
    }
    public  void displayExample () {
        System.out.println("Total of calculate: " + result);
    }
}
