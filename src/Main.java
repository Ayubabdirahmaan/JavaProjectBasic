import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        birth day
        Scanner bithDay = new Scanner(System.in);
        System.out.println("Enter your bithday");
        int day = 2026;
        int sources = bithDay.nextInt();
        int result = day - sources;
        System.out.println("Your age is:" + result );

//        calaculate your subjects
        Scanner subjectOne = new Scanner(System.in);

        System.out.println("Enter subject 1:");
        int subOne = subjectOne.nextInt();
        Scanner subjectTwo = new Scanner(System.in);
        System.out.println("Enter subject 2: ");
        int subTwo = subjectTwo.nextInt();
        Scanner subjectThree = new Scanner(System.in);
        System.out.println("Enter subject 3: ");
        int subThree = subjectThree.nextInt();
        int total = subOne + subTwo + subThree;
        double average = (double) total /3;
        System.out.println("Total of Subjects : " + total);
        System.out.println("Average of Subjects:" + average);
    }
}