package hexlet.code.games;

public class Calc {
    private static final int UPPER_BOUND_FIRST = 100;
    private static final int UPPER_BOUND_SECOND = 10;
    private static final double PROBABILITY_1 = 0.3;
    private static final double PROBABILITY_2 = 0.6;

    public static String calcDescription() {
        return "What is the result of the expression?";
    }

    public static String calcGame() {
        int randomValue1 = (int) (Math.random() * UPPER_BOUND_FIRST);
        int randomValue2 = (int) (Math.random() * UPPER_BOUND_SECOND);
        int randomExpression;
        String expression;

        if (Math.random() < PROBABILITY_1) {
            randomExpression = randomValue1 + randomValue2;
            expression = "+";
        } else if (Math.random() >= PROBABILITY_1 && Math.random() < PROBABILITY_2) {
            randomExpression = randomValue1 - randomValue2;
            expression = "-";
        } else {
            randomExpression = randomValue1 * randomValue2;
            expression = "*";
        }
        System.out.println("Question: " + randomValue1 + " " + expression + " " + randomValue2);
        System.out.print("Your answer: ");
        return Integer.toString(randomExpression);
    }
}
