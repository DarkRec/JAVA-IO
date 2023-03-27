package Instruction4.Problem151;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
public class TestProblem151 {
    @Test
    void checkReplacement(){
        char[][] tab = {{'B','B','W'},{'W','W','W'},{'W','W','W'},{'B','B','B'}};
        char[][] test = {{'B','B','G'},{'G','G','G'},{'G','G','G'},{'B','B','B'}};

        assertTrue(Arrays.deepEquals(Problem151.P151(tab,2,2,'G'),test));
    }
}
