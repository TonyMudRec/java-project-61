package hexlet.code;

public abstract class Game {
    public boolean gameMusGoOn = true;
    int gameCount = 0;

    public abstract void game();

    public abstract String endGame(String name, String answer, boolean winGame);

    public abstract boolean isCorrectAnswer(String answer);
}
