import java.util.Scanner;

public class Testclass {
    Scanner solution = new Scanner(System.in);
    int number1,number2;
    int sum;
    public  void  input() {
        System.out.println("Enter number 1: ");
         number1 = solution.nextByte();
        System.out.println("Enter number 2: ");
        number2 = solution.nextInt();
    }
//    methos of
    public  void Testclass() {
        sum = number1 + number2;

    }
    public void calculate () {
        System.out.println("Total number is:" + sum);
    }
}
