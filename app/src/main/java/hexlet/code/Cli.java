package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String name;

    public static String getName() {
        return name;
    }

    public static void greetings() {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = s.next().toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println();
        System.out.println("Hello, " + name + "!");
    }
}
