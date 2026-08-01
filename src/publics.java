import java.util.Scanner;

public class publics {
    Scanner info = new Scanner(System.in);
    String name1,name2,name3;
    public  void publics() {

        System.out.println("Enter you name");
        name1 = info.nextLine();
        name2 = info.nextLine();
        name3 = info.nextLine();

        System.out.println("My full name is: " + name1 + name2 + name3);
    }
}
