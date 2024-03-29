package Instruction4.Problem69;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class TestProblem69 {
    @Test
    @Timeout(1)
    void checkIfLargestProduct(){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(-10);
        temp.add(-10);
        temp.add(5);
        temp.add(2);
        assertEquals(500, Problem69.P069(temp));
    }
}
