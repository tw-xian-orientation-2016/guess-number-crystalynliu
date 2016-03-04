
public class CompareNumber {
    public String compareNumber(String answer, String input) {
        String[] numbers = input.split("");
        int A = 0, B = 0;
        for (int i = 0; i < numbers.length; i++) {
            int index = answer.indexOf(numbers[i]);
            if ( index != -1) {
                if(i == index){
                    A++;
                }else {
                    B++;
                }
            }
        }
        return A + "A" + B + "B";
    }
}
