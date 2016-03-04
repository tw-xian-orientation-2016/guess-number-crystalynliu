
public class CompareNumber {
    public String compareNumber(String answer, String input) {
        String[] numbers = input.split("");
        int A = 0, B = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (answer.indexOf(numbers[i]) != -1) {
                A++;
            }
        }
        return A + "A" + B + "B";
    }
}
