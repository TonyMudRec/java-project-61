package hexlet.code;

public interface Engine {
    String getDescription();

    String game();

    default void process() {
        int gameCount = 0;
        boolean winGame = false;
        boolean gameMusGoOn = true;
        String correctAnswer = null;
        String answer = null;

        Cli.greetings();
        System.out.println(getDescription());
        while (gameMusGoOn) {
            correctAnswer = game();
            answer = App.s.next();
            gameMusGoOn = answer.equals(correctAnswer);
            if (gameMusGoOn && gameCount < 2) {
                gameCount++;
                System.out.println("Correct!");
            } else {
                winGame = answer.equals(correctAnswer);
                gameMusGoOn = false;
            }
        }
        System.out.println(endGame(Cli.name, answer, winGame, correctAnswer));
    }

    default String endGame(String name, String answer, boolean winGame, String correctAnswer) {
        return winGame ? "Congratulations, " + name + "!" : "'" + answer + "' is wrong answer ;(. Correct answer was '"
                + correctAnswer + "'." + "\n" + "Let's try again, " + name + "!";
    }
}
