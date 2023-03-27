package Instruction4.Problem35;

import Instruction4.Problem11.Problem11;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestProblem35 {
    @Test
    void checkIfProperlySorted(){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("G");
        strings.add("B");
        strings.add("R");
        strings.add("R");
        strings.add("B");

        ArrayList<String> test = new ArrayList<>();
        test.add("R");
        test.add("R");
        test.add("G");
        test.add("B");
        test.add("B");
        assertTrue(Problem35.P035(strings).equals(test));
    }
}
