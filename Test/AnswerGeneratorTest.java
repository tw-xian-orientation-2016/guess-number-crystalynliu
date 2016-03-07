import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnswerGeneratorTest {
    @Test
    public void return_1234_when_input_1_2_3_4_5() {
        Random random = mock(Random.class);

        when(random.nextInt(10)).thenReturn(1, 2, 3, 4, 5);

        AnswerGenerator answer = new AnswerGenerator(random);
        assertThat(answer.generator(), is("1234"));
    }

    @Test
    public void return_1234_when_input_1_2_2_4_5() {
        Random random = mock(Random.class);

        when(random.nextInt(10)).thenReturn(1, 2, 2, 4, 5);

        AnswerGenerator answer = new AnswerGenerator(random);
        assertThat(answer.generator(), is("1245"));
    }
}
