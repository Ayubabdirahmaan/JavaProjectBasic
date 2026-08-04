import java.util.Scanner;

public class Example3 {
    Scanner kb = new Scanner(System.in);
    public Example3() {
        System.out.println("Enter Average marks" );
        int average = kb.nextInt();
        System.out.println("Enter Age");
        int age = kb.nextInt();

        if(age >= 18) {
            if(average >=50 ) {
                System.out.println("You can join University");
            }
        }
    }
}
