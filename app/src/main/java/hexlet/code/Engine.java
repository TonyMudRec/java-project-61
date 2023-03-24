package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {

    public static void process(int gameChoice) {
        switch (gameChoice) {
            case 1:
                Cli.greetings();
                return;
            case 2:
                Cli.greetings();
                System.out.println(Even.evenDescription());
                game(gameChoice);
                break;
            case 3:
                Cli.greetings();
                System.out.println(Calc.calcDescription());
                game(gameChoice);
                break;
            case 4:
                Cli.greetings();
                System.out.println(GCD.gcdDescription());
                game(gameChoice);
                break;
            case 5:
                Cli.greetings();
                System.out.println(Progression.progressionDescription());
                game(gameChoice);
                break;
            case 6:
                Cli.greetings();
                System.out.println(Prime.primeDescription());
                game(gameChoice);
                break;
            default:
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
            if (gameChoice == 2) {
                correctAnswer = Even.evenGame();
            } else if (gameChoice == 3) {
                correctAnswer = Calc.calcGame();
            } else if (gameChoice == 4) {
                correctAnswer = GCD.gcdGame();
            } else if (gameChoice == 5) {
                correctAnswer = Progression.progressionGame();
            } else {
                correctAnswer = Prime.primeGame();
            }
            answer = s.next();
            gameMusGoOn = answer.equals(correctAnswer);
            if (gameMusGoOn && gameCount < 2) {
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
