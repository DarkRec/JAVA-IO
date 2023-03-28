package Instruction4.Problem9;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class TestProblem9 {
    @Test
    @Timeout(1)
    void checkLargestSum(){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(2);
        temp.add(4);
        temp.add(6);
        temp.add(8);
        assertEquals(12, Problem9.P009(temp));
    }
}
