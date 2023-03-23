package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    private static final Scanner S = new Scanner(System.in);

    public static void process(int gameChoice) {
        int gameCount = 0;
        boolean winGame = false;
        boolean gameMusGoOn = true;
        String correctAnswer = null;
        String answer = null;

        switch (gameChoice) {
            case 1:
                Cli.greetings();
                return;
            case 2:
                Cli.greetings();
                System.out.println(Even.evenDescription());
                break;
            case 3:
                Cli.greetings();
                System.out.println(Calc.calcDescription());
                break;
            case 4:
                Cli.greetings();
                System.out.println(GCD.gcdDescription());
                break;
            case 5:
                Cli.greetings();
                System.out.println(Progression.progressionDescription());
                break;
            case 6:
                Cli.greetings();
                System.out.println(Prime.primeDescription());
                break;
            default:
                return;
        }
        while (gameMusGoOn) {
            switch (gameChoice) {
                case 2:
                    correctAnswer = Even.evenGame();
                    break;
                case 3:
                    correctAnswer = Calc.calcGame();
                    break;
                case 4:
                    correctAnswer = GCD.gcdGame();
                    break;
                case 5:
                    correctAnswer = Progression.progressionGame();
                    break;
                case 6:
                    correctAnswer = Prime.primeGame();
                    break;
                default:
                    break;
            }
            answer = S.next();
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
        S.close();
    }

    public static String endGame(String name, String answer, boolean winGame, String correctAnswer) {
        return winGame ? "Congratulations, " + name + "!" : "'" + answer + "' is wrong answer ;(. Correct answer was '"
                + correctAnswer + "'." + "\n" + "Let's try again, " + name + "!";
    }
}
