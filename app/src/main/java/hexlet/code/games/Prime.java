package hexlet.code.games;

public class Prime {

    public static String primeDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String primeGame() {
        int value = (int) (Math.random() * 100) + 2;
        System.out.println("Question: " + value);
        System.out.print("Your answer: ");
        if (value == 2 || value == 3 || value == 5 || value == 7) {
            return "yes";
        }
        if (value % 2 != 0 && value % 3 != 0 && value % 5 != 0 && value % 7 != 0) {
            return "yes";
        }
        return "no";
    }
}

