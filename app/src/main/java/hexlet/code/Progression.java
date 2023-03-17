package hexlet.code;

public class Progression implements Engine {

    @Override
    public String getDescription() {
        return "What number is missing in the progression?";
    }

    @Override
    public String game() {
        int progressionLength = (int) (Math.random() * 5) + 5;
        int hiddenPosition = (int) (Math.random() * progressionLength);
        int progressionCoefficient = (int) (Math.random() * 5) + 1;
        int startProgressionValue = (int) (Math.random() * 20);
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
