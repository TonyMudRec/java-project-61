package hexlet.code;

public class Even implements Engine {

    int randomValue;

    @Override
    public String getDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String game() {
        randomValue = (int) (Math.random() * 100);
        System.out.println("Question: " + randomValue);
        System.out.print("Your answer: ");
        return randomValue % 2 == 0 ? "yes" : "no";
    }
}
