import java.util.Scanner;

public class publics {
    Scanner info = new Scanner(System.in);
    String name1,name2,name3;
    public  void publics() {

        System.out.println("Enter you name one");
        name1 = info.nextLine();
        System.out.println("Enter you name two");
        name2 = info.nextLine();
        System.out.println("Enter you name three");
        name3 = info.nextLine();

        System.out.println("My full name is: " + name1 + name2 + name3);
    }
}
