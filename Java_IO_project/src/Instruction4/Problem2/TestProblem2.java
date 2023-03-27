package Instruction4.Problem2;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestProblem2 {
    @Test
    void chekSumOfAandB(){
        ArrayList<Integer> temp = new ArrayList<>();
        int a = 10, b = 5, c = 7, d = 2;
        temp.add(a);
        temp.add(b);
        temp.add(c);
        temp.add(d);

        Problem1 problem = new Problem1();
        assertTrue(problem.P001(temp,a+b));
    }

}
