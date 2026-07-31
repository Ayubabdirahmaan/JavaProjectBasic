import java.util.Scanner;

public class DisplayTest {
    public void DisplayOne() {
        Scanner test = new Scanner(System.in);
        System.out.println("Enter You name");
        String FullName = test.next();
        System.out.println("Enter Your Age");
        int age = test.nextInt();
        System.out.println("My Name: " + FullName + " And My Age: "+ age);
    }
}
