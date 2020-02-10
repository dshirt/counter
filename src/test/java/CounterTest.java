import ie.gmit.Counter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CounterTest {

    Counter myCounter;

    public Counter getMyCounter() {
        return myCounter;
    }


    @Test
    void testIsCounterSetToZero(){
        myCounter = new Counter();
        assertEquals(0, myCounter.getCounter() );
    }

    @Test
    void testIncrementCounter(){
        myCounter = new Counter();
        myCounter.incrementCount();
        assertEquals(1, myCounter.getCounter() );

    }

    @Test
    void testDecrementCounter(){
        myCounter = new Counter();
        myCounter.decrementCount();
        assertEquals(-1, myCounter.getCounter() );

    }

    @Test
    void testSingleArgConstructor(){
        assertThrows(IllegalArgumentException.class, ()->{new Counter(-1);});
    }



}
