public class GCD implements Engine {
    @Override
    public String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String game() {
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
