import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CompareNumberTest {

    CompareNumber compare;
    @Before
    public void setUp(){
        compare = new CompareNumber();
    }
    
    @Test
    public void should_return_0A0B_when_input_different_numbers(){
        String result = compare.compareNumber("1234","5678");
        assertThat(result,is("0A0B"));
    }

    @Test
    public void should_return_0A4B_when_input_different_position_numbers(){
        String result = compare.compareNumber("1234","4321");
        assertThat(result,is("0A4B"));
    }

    @Test
    public void should_return_4A0B_when_input_equel_numbers(){
        String result = compare.compareNumber("1234","1234");
        assertThat(result,is("4A0B"));
    }

}
