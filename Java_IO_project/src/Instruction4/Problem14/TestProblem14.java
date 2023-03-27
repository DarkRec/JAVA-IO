package Instruction4.Problem14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem14 {

    @Test
    void checkIfEqualRoundedPI(){
        assertEquals(Math.round(Math.PI), Math.round(Problem14.P014(500000)));
    }
}
