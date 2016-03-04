import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessIntergrationTest {

    Guess guess;

    @Before
    public void setUp(){
        Random random = mock(Random.class);
        when(random.nextInt(10)).thenReturn(1,2,3,4);
        guess = new Guess(new AnswerGenerator(random),new CompareNumber());
    }

    @Test
    public void retrun_0A0B_when_input_wrong_number(){
        assertThat(guess.guess("5678"),is("0A0B"));
    }

    @Test
    public void retrun_4A0B_when_input_right_number(){
        assertThat(guess.guess("1234"),is("4A0B"));
    }

    @Test
    public void retrun_0A4B_when_input_wrong_position_number(){
        assertThat(guess.guess("4321"),is("0A4B"));
    }
}
