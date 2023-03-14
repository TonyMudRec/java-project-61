import java.util.Scanner;

public class Cli {

    public static String NAME;
    public static void greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        NAME =App.s.next().toLowerCase();
        NAME = NAME.substring(0, 1).toUpperCase() + NAME.substring(1);
        System.out.println();
        System.out.println("Hello, " + NAME + "!");
    }
}
