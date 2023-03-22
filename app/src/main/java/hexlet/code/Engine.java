package hexlet.code;

public class Engine {

    public static void process(int gameChoice) {
        int gameCount = 0;
        boolean winGame = false;
        boolean gameMusGoOn = true;
        String correctAnswer = null;
        String answer = null;

        switch (gameChoice) {
            case 1 -> {
                Cli.greetings();
            }
            case 2 -> {
                Cli.greetings();
                System.out.println(Even.evenDescription());
            }
            case 3 -> {
                Cli.greetings();
                System.out.println(Calc.calcDescription());
            }
            case 4 -> {
                Cli.greetings();
                System.out.println(GCD.gcdDescription());
            }
            case 5 -> {
                Cli.greetings();
                System.out.println(Progression.progressionDescription());
            }
            case 6 -> {
                Cli.greetings();
                System.out.println(Prime.primeDescription());
            }
            default -> {

            }
        }
        while (gameMusGoOn) {
            switch (gameChoice) {
                case 2 -> {
                    correctAnswer = Even.evenGame();
                }
                case 3 -> {
                    correctAnswer = Calc.calcGame();
                }
                case 4 -> {
                    correctAnswer = GCD.gcdGame();
                }
                case 5 -> {
                    correctAnswer = Progression.progressionGame();
                }
                case 6 -> {
                    correctAnswer = Prime.primeGame();
                }
                default -> {

                }
            }
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

    public static String endGame(String name, String answer, boolean winGame, String correctAnswer) {
        return winGame ? "Congratulations, " + name + "!" : "'" + answer + "' is wrong answer ;(. Correct answer was '"
                + correctAnswer + "'." + "\n" + "Let's try again, " + name + "!";
    }
}
