import java.util.Scanner;

public class MemoryClass {
    public  void Display() {
        Scanner UserInfo = new Scanner(System.in);
        System.out.println("Please Enter your name");
        String Name = UserInfo.nextLine();
        System.out.println("My name is: " + Name);
    }
}
