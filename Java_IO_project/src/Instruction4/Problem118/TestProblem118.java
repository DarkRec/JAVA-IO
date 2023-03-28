package Instruction4.Problem118;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
public class TestProblem118 {
    @Test
    @Timeout(1)
    void checkSquareArray(){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(-9);
        temp.add(-2);
        temp.add(0);
        temp.add(2);
        temp.add(3);

        ArrayList<Integer> test = new ArrayList<>();
        test.add(0);
        test.add(4);
        test.add(4);
        test.add(9);
        test.add(81);

        assertTrue(Problem118.P118(temp).equals(test));
    }
}
