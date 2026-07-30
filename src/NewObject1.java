import java.util.Scanner;

public class NewObject1 {
   public  void NewObject1 () {
       Scanner calculate = new Scanner(System.in);
       System.out.println("Enter Number one");
       int a = calculate.nextInt();
       System.out.println("Enter Number Two");
       int b = calculate.nextInt();
       int sum = a + b;
       System.out.println("Total is " + sum);
   }
   public  void Display () {
       double subjectOne = 100;
       double subjectTwo = 99;
       double subjectThree = 90;

       double calculate = subjectOne + subjectTwo + subjectThree;
       double avarage = calculate / 3;
       System.out.println("Total Subjects: " + calculate);
       System.out.println("Average of Subject: "+ avarage);

   }
}
