public class Guess {

    private String answer;
    private CompareNumber compare;

    public Guess(AnswerGenerator answer, CompareNumber compare) {
        this.answer = answer.generator();
        this.compare = compare;
    }
    public String guess(String input){
        String output = this.compare.compareNumber(this.answer,input);
        return output;
    }
}
