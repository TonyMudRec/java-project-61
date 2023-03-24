package hexlet.code.games;

public class Prime {
    private static final int UPPER_BOUND = 100;
    private static final int PRIME_VALUE_2 = 2;
    private static final int PRIME_VALUE_3 = 3;
    private static final int PRIME_VALUE_5 = 5;
    private static final int PRIME_VALUE_7 = 7;
    private static final int INDENT = 2;
    public static String primeDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String primeGame() {
        int value = (int) (Math.random() * UPPER_BOUND) + INDENT;
        System.out.println("Question: " + value);
        System.out.print("Your answer: ");
        if (value == PRIME_VALUE_2 || value == PRIME_VALUE_3 || value == PRIME_VALUE_5 || value == PRIME_VALUE_7) {
            return "yes";
        }
        if (value % PRIME_VALUE_2 != 0 && value % PRIME_VALUE_3 != 0 && value % PRIME_VALUE_5 != 0
                && value % PRIME_VALUE_7 != 0) {
            return "yes";
        }
        return "no";
    }
}

