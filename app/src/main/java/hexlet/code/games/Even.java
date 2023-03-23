package hexlet.code.games;

public class Even {

    public static String evenDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String evenGame() {
        int randomValue = (int) (Math.random() * 100);
        System.out.println("Question: " + randomValue);
        System.out.print("Your answer: ");
        return randomValue % 2 == 0 ? "yes" : "no";
    }
}
