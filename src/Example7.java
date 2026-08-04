import java.util.Scanner;

public class Example7 {
    Scanner langauge = new Scanner(System.in);
    String language1,language2;
    public void InputLanguages () {
        System.out.println("Enter Language 1:");
        language1 = langauge.nextLine();

    }
    public void secondInput() {
        System.out.println("Enter langauge 2:");
        language2 = langauge.nextLine();
    }
    public void displayLanguage() {
        System.out.println("as somalia people mother tangue is: " + language1 + " and second language is  " + language2);
    }
}
