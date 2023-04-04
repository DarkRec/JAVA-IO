package Instruction4.Problem1;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class TestProblem1 {
    @Test
    @Timeout(1)
    void checkSumOfAAndB(){
        ArrayList<Integer> temp = new ArrayList<>();
        int a = 10, b = 5, c = 7, d = 2;
        temp.add(10);
        temp.add(5);
        temp.add(7);
        temp.add(2);

        Problem1 problem = new Problem1();
        assertTrue(problem.P001(temp,a+b));

    }
}
