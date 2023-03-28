package Instruction4.Problem70;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class TestProblem70 {
    @Test
    @Timeout(1)
    void checkPerfectNumber(){
        assertEquals(46, Problem70.P070(4));
    }
}
