import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTest {
    @Test
    public void return_correct_when_input_1243(){

        AnswerGenerator answer = mock(AnswerGenerator.class);
        CompareNumber compare = mock(CompareNumber.class);
        when(answer.generator()).thenReturn("1234");
        when(compare.compareNumber("1234","1243")).thenReturn("2A2B");

        Guess guess = new Guess(answer,compare);

        assertThat(guess.guess("1243"),is("2A2B"));
    }

}
