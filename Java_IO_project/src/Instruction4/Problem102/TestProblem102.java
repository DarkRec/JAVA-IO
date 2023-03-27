package Instruction4.Problem102;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestProblem102 {
    @Test
    void checkValueOfContiguousElements(){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        temp.add(4);
        temp.add(5);

        ArrayList<Integer> test = new ArrayList<>();
        test.add(2);
        test.add(3);
        test.add(4);

        assertTrue(Problem102.P102(temp,9).equals(test));
    }
}
