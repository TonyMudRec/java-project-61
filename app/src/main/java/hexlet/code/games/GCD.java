package hexlet.code.games;

public class GCD {

    public static String gcdDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String gcdGame() {
        int randomValue1 = (int) (Math.random() * 100);
        int randomValue2 = (int) (Math.random() * 100);
        int dividend = Math.max(randomValue1, randomValue2);
        int divisor = Math.min(randomValue1, randomValue2);
        int lastDivisor = 0;

        while (divisor != 0) {
            lastDivisor = divisor;
            divisor = dividend % divisor;
            dividend = lastDivisor;
        }
        System.out.println("Question: " + randomValue1 + " " + randomValue2);
        System.out.print("Your answer: ");
        return Integer.toString(lastDivisor);
    }
}
