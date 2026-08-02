import java.util.Scanner;

public class Example5 {
    Scanner calculateMath = new Scanner(System.in);
    int num1,num2,num3;
    int result;
    int module;
    public void calculateInput () {
        System.out.println("Enter number 1:");
        num1 = calculateMath.nextInt();
        System.out.println("Enter number 2:");
        num2 = calculateMath.nextInt();
        System.out.println("Enter number 3:");
        num3 = calculateMath.nextInt();
        result = num1 + num2 + num3;
        module = result % 5;
    }
    public void calculateDisplay () {
        System.out.println(result);
        System.out.println(module);
    }
}
