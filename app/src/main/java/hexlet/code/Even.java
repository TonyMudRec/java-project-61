import java.util.Scanner;

public class Even extends Game {

    int randomValue;
    String answer;
    String correctAnswer;

    @Override
    public void game() {
        Cli.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (gameMusGoOn) {
            randomValue = (int) (Math.random() * 100);
            System.out.println("Question: " + randomValue);
            System.out.print("Your answer: ");
            answer = App.s.next();
            correctAnswer = randomValue % 2 == 0 ? "yes" : "no";
            gameMusGoOn = isCorrectAnswer(answer);
            if (isCorrectAnswer(answer) && gameCount < 2) {
                gameCount++;
                System.out.println("Correct!");
            } else {
                winGame = isCorrectAnswer(answer) && gameCount == 2;
                gameMusGoOn = false;
            }
        }
        System.out.println(endGame(Cli.NAME, winGame));
    }

    @Override
    public String endGame(String name, boolean winGame) {
        return winGame ? "Congratulations, " + name + "!" : "'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'." + "\n" + "Let's try again, " + name + "!";
    }

    @Override
    public boolean isCorrectAnswer(String answer) {
        return (randomValue % 2 == 0 && answer.equals("yes")) | (randomValue % 2 != 0 && answer.equals("no"));
    }
}


