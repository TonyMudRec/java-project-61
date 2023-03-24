package hexlet.code.games;

public class Progression {
    private static final int UPPER_BOUND_PROGRESSION_LENGTH = 5;
    private static final int UPPER_BOUND_PROGRESSION_COEFFICIENT = 5;
    private static final int INDENT_PROGRESSION_LENGTH = 5;
    private static final int UPPER_BOUND_START_PROGRESSION = 20;
    private static final int INDENT_PROGRESSION_COEFFICIENT = 20;

    public static String progressionDescription() {
        return "What number is missing in the progression?";
    }

    public static String progressionGame() {
        int progressionLength = (int) (Math.random() * UPPER_BOUND_PROGRESSION_LENGTH) + INDENT_PROGRESSION_LENGTH;
        int hiddenPosition = (int) (Math.random() * progressionLength);
        int progressionCoefficient = (int) (Math.random() * UPPER_BOUND_PROGRESSION_COEFFICIENT)
                + INDENT_PROGRESSION_COEFFICIENT;
        int startProgressionValue = (int) (Math.random() * UPPER_BOUND_START_PROGRESSION);
        String hiddenValue = null;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < progressionLength; i++) {
            if (i == hiddenPosition) {
                sb.append("..").append(" ");
                hiddenValue = Integer.toString(startProgressionValue);
            } else {
                sb.append(startProgressionValue).append(" ");
            }
            startProgressionValue += progressionCoefficient;
        }
        System.out.println("Question: " + sb);
        System.out.print("Your answer: ");
        return hiddenValue;
    }
}
