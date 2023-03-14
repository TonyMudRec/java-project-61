public abstract class Game {
    public boolean gameMusGoOn = true;
    int gameCount = 0;
    boolean winGame;

    public abstract void game();

    public abstract String endGame(String NAME, boolean winGame);

    public abstract boolean isCorrectAnswer(String answer);
}
