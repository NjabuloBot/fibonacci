package demo.src.test.java;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import demo.src.main.java.com.fibonacci.*;

public class Testseries {
    @Test  
    public void testseries(){  
        series value = new series();
        assertEquals(4,value.numSeries(4)); 
        assertEquals(4,value.numSeries(-4));
    }
}
  
 
  
