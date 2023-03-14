package hexlet.code;

public class Cli {

    public static String name;

    public static void greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = App.s.next().toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println();
        System.out.println("Hello, " + name + "!");
    }
}
