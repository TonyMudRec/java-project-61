package hexlet.code;

import java.util.Scanner;

public class App {

    static Scanner s = new Scanner(System.in);

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
        int gameChoice = s.nextInt();

        switch (gameChoice) {
            case 1 -> Cli.greetings();
            case 2 -> {
                Even even = new Even();
                even.process();
            }
            case 3 -> {
                Calc calc = new Calc();
                calc.process();
            }
            case 4 -> {
                GCD gcd = new GCD();
                gcd.process();
            }
            case 5 -> {
                Progression pro = new Progression();
                pro.process();
            }
            case 6 -> {
                Prime prime = new Prime();
                prime.process();
            }
            default -> {
            }
        }
        s.close();
    }
}
