package Instruction4.Problem11;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestProblem11 {
    @Test
    void checkByPrefix() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("dog");
        strings.add("deer");
        strings.add("deal");

        ArrayList<String> test = new ArrayList<>();
        test.add("deer");
        test.add("deal");
        assertTrue(Problem11.P011(strings, "de").equals(test));
    }
}
