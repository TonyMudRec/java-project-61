package hexlet.code.games;

public class Even {
    private static final int UPPER_BOUND = 100;
    public static String evenDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String evenGame() {
        int randomValue = (int) (Math.random() * UPPER_BOUND);
        System.out.println("Question: " + randomValue);
        System.out.print("Your answer: ");
        return randomValue % 2 == 0 ? "yes" : "no";
    }
}
