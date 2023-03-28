package Instruction4.Problem4;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class TestProblem4 {
    @Test
    @Timeout(1)
    void checkMissingValue(){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(3);
        temp.add(4);
        temp.add(-1);
        temp.add(1);
        assertEquals(2,Problem4.P004(temp));
    }
}
