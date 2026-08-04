import java.util.Scanner;

public class Example2 {
    Scanner kb = new Scanner(System.in);
    public Example2() {
        System.out.println("Enter number: ");
       int  n = kb.nextInt();
       if(n > 100) {
           System.out.println(n + " is greater then 100");
       } else if(n < 100) {
           System.out.println(n + " is less then 100");
       }else
           System.out.println(n + " is 100");
    }
}
