package Instruction4.Problem2;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class TestProblem2 {

    @Test
    @Timeout(1)
    void checkFirstElementOfArray(){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        temp.add(4);
        temp.add(5);
        assertEquals(120,Problem2.P002(temp).get(0));
    }
}
