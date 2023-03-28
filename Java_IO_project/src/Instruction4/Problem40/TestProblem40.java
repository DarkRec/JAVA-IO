package Instruction4.Problem40;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class TestProblem40 {
    @Test
    @Timeout(1)
    void checkIfValueOccursOnlyOnce(){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(6);
        temp.add(1);
        temp.add(3);
        temp.add(3);
        temp.add(3);
        temp.add(6);
        temp.add(6);
        assertEquals(1, Problem40.P040(temp));
    }
}
