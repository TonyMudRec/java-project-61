package hexlet.code;

public class Calc {

    public static String calcDescription() {
        return "What is the result of the expression?";
    }

    public static String calcGame() {
        int randomValue1 = (int) (Math.random() * 100);
        int randomValue2 = (int) (Math.random() * 10);
        int randomExpression = 0;
        String expression = null;

        if (Math.random() < 0.3) {
            randomExpression = randomValue1 + randomValue2;
            expression = "+";
        } else if (Math.random() >= 0.3 && Math.random() < 0.6) {
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
