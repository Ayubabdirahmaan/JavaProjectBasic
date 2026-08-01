import java.util.Scanner;

public class Example1 {
    Scanner userInfo  = new Scanner(System.in);
    String nameOne,nameTwo,nameThree;
    public  void input () {
        System.out.println("Enter fist name: ");
        nameOne = userInfo.nextLine();
        System.out.println("Enter second name: ");
        nameTwo = userInfo.nextLine();
        System.out.println("Enter third name");
        nameThree = userInfo.nextLine();
    }
    public  void  Display() {
        System.out.println("My Full Name Is: " + nameOne + nameTwo + nameThree);
    }
}
