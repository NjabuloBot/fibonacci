package demo.src.test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import demo.src.main.java.com.fibonacci.fibSequence;

public class TestfibSequence {

    @Test
    public void testfibSequence(){
        fibSequence seq = new fibSequence();
        assertEquals("0 1 1 2 3", seq.sequence(5));
    }
    
}
