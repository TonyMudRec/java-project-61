package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static final Scanner S = new Scanner(System.in);
    private static String name;

    public static String getName() {
        return name;
    }

    public static void greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = S.next().toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println();
        System.out.println("Hello, " + name + "!");
        S.close();
    }
}
