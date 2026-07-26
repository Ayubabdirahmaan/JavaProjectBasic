import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        bithday
        Scanner birthDay = new Scanner(System.in);
        System.out.println("Enter year of birthDay:");
        int year = birthDay.nextInt();
        int limit = 2026;
       int result = limit - year;
        System.out.println("Your age is:" + result + " Years");

// add total subjects and avarage
                Scanner total = new Scanner(System.in);
                System.out.println("Enter subject 1 marks");
                int SubjectOne = total.nextInt();
                System.out.println("Enter subject 2 marks");
                 int subjectTwo = total.nextInt();
        System.out.println("Enter subject 3 marks");
        int subjectThree = total.nextInt();
        int totalSubject = SubjectOne + subjectTwo + subjectThree;
        double  resultSubject = (double) totalSubject / 3;
        System.out.println("Total Subject is: " + totalSubject);
        System.out.println("Avarage subject is: " + resultSubject);
    }
}