
public class CompareNumber {
    public String compareNumber(String answer, String input) {
        int A = 0, B = 0;
        for (int i = 0; i < input.length(); i++) {
            int index = answer.indexOf(input.charAt(i));
            if (index == i) {
                A++;
            } else if (index != -1) {
                B++;
            }
        }
        return A + "A" + B + "B";
    }
}
