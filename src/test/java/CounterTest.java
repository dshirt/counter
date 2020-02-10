import ie.gmit.Counter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CounterTest {

    Counter myCounter;

    public Counter getMyCounter() {
        return myCounter;
    }


    @Test
    void isCounterSetToZero(){
        myCounter = new Counter();
        assertEquals(0, myCounter.getCounter() );
    }


}
