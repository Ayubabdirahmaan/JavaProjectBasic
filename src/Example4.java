import java.util.Scanner;

public class Example4 {
    Scanner birthDay = new Scanner(System.in);
    int year;
    int currentYear;
    int age;
    public  void  testInput() {
        System.out.println("Enter year of birthDay");
        year = birthDay.nextInt();
        currentYear = 2026;
        age = currentYear - year;
    }
    public  void  testDisplay () {
        System.out.println("Your age is:" + age);
    }
}
