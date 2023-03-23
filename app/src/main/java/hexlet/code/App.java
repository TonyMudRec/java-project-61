package hexlet.code;

import java.util.Scanner;

public class App {

    private static final Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("7 - Exit");
        System.out.print("Your choice: ");
        int gameChoice = S.nextInt();
        Engine.process(gameChoice);
        S.close();
    }
}
