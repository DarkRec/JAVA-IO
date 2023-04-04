package Instruction4.Problem14;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class TestProblem14 {

    @Test
    @Timeout(1)
    void checkIfEqualRoundedPI(){
        assertEquals(Math.round(Math.PI), Math.round(Problem14.P014(10000000)));
    }


    @Test
    @Timeout(1)
    void checkException(){
         Problem14.P014(100000000);
    }
}
