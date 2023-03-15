package hexlet.code;

import java.util.Scanner;

public class App {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Exit");
        System.out.print("Your choice: ");
        int gameChoice = s.nextInt();

        switch (gameChoice) {
            case 1 -> Cli.greetings();
            case 2 -> {
                Even even = new Even();
                even.process();
            }
            default -> {
            }
        }
        s.close();
    }
}
