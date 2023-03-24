package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    private static final int USER_CHOICE_1 = 1;
    private static final int USER_CHOICE_2 = 2;
    private static final int USER_CHOICE_3 = 3;
    private static final int USER_CHOICE_4 = 4;
    private static final int USER_CHOICE_5 = 5;
    private static final int USER_CHOICE_6 = 6;
    private static final int NUMBER_OF_ATTEMPTS = 2;

    public static void process(int gameChoice) {
        switch (gameChoice) {
            case USER_CHOICE_1 -> {
                Cli.greetings();
            }
            case USER_CHOICE_2 -> {
                Cli.greetings();
                System.out.println(Even.evenDescription());
                game(gameChoice);
            }
            case USER_CHOICE_3 -> {
                Cli.greetings();
                System.out.println(Calc.calcDescription());
                game(gameChoice);
            }
            case USER_CHOICE_4 -> {
                Cli.greetings();
                System.out.println(GCD.gcdDescription());
                game(gameChoice);
            }
            case USER_CHOICE_5 -> {
                Cli.greetings();
                System.out.println(Progression.progressionDescription());
                game(gameChoice);
            }
            case USER_CHOICE_6 -> {
                Cli.greetings();
                System.out.println(Prime.primeDescription());
                game(gameChoice);
            }
            default -> {
            }
        }

    }

    public static void game(int gameChoice) {
        Scanner s = new Scanner(System.in);
        int gameCount = 0;
        boolean winGame = false;
        boolean gameMusGoOn = true;
        String correctAnswer = null;
        String answer = null;

        while (gameMusGoOn) {
            if (gameChoice == USER_CHOICE_2) {
                correctAnswer = Even.evenGame();
            } else if (gameChoice == USER_CHOICE_3) {
                correctAnswer = Calc.calcGame();
            } else if (gameChoice == USER_CHOICE_4) {
                correctAnswer = GCD.gcdGame();
            } else if (gameChoice == USER_CHOICE_5) {
                correctAnswer = Progression.progressionGame();
            } else {
                correctAnswer = Prime.primeGame();
            }
            answer = s.next();
            gameMusGoOn = answer.equals(correctAnswer);
            if (gameMusGoOn && gameCount < NUMBER_OF_ATTEMPTS) {
                gameCount++;
                System.out.println("Correct!");
            } else {
                winGame = answer.equals(correctAnswer);
                gameMusGoOn = false;
            }
        }
        System.out.println(endGame(Cli.getName(), answer, winGame, correctAnswer));
    }

    public static String endGame(String name, String answer, boolean winGame, String correctAnswer) {
        return winGame ? "Congratulations, " + name + "!" : "'" + answer + "' is wrong answer ;(. Correct answer was '"
                + correctAnswer + "'." + "\n" + "Let's try again, " + name + "!";
    }
}
