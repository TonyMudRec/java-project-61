package hexlet.code;

import java.util.Scanner;

public class App {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Exit");
        int gameChoice = s.nextInt();
        System.out.println("Your choice: " + gameChoice + "\n");
        switch (gameChoice) {
            case 1:
                Cli.greetings();
                break;
            case 2:
                Even even = new Even();
                even.game();
                break;
            case 3:
                break;
        }
        s.close();
    }
}
