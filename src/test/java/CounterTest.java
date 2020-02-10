import ie.gmit.Counter;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class CounterTest {


    Counter myCounter;


    public Counter getMyCounter() {
        return myCounter;
    }

    @DisplayName("Checking counter is set to zero")
    @Test
    void testIsCounterSetToZero(){
        assertEquals(0, myCounter.getCounter() );
    }

    @DisplayName("Checking counter incremented by 1")
    @Test
    void testIncrementCounter(){
        myCounter.incrementCount();
        assertEquals(1, myCounter.getCounter() );
    }

    @DisplayName("Checking counter is decremented by 1")
    @Test
    void testDecrementCounter(){
        myCounter.decrementCount();
        assertEquals(-1, myCounter.getCounter() );
    }

    @DisplayName("Checking that single arg constructor throws Exception")
    @Test
    void testSingleArgConstructor(){
        assertThrows(IllegalArgumentException.class, ()->{new Counter(-1);});
    }

    @BeforeEach
     void init(TestInfo testInfo, TestReporter testReporter){
        testReporter.publishEntry("Testing"+ " "+ testInfo.getDisplayName());
        myCounter = new Counter();
        System.out.println();
    }

    @BeforeAll
    static void testStart(){
        System.out.println("********* Starting Test ***********");
        System.out.println();
    }

    @AfterAll
    static void testEnd(){
        System.out.println("********* Ending Test ***********");
        System.out.println();
    }



}
