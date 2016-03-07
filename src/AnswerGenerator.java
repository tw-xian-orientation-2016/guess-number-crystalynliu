import java.util.Random;

public class AnswerGenerator {
    private Random random;

    public AnswerGenerator(Random random) {
        this.random = random;
    }

    public String generator() {
        String answer = "";
        do {
            String number = Integer.toString(this.random.nextInt(10));
            if (answer.indexOf(number) == -1) {
                answer += number;
            }
        } while (answer.length() < 4);
        return answer;
    }
}
