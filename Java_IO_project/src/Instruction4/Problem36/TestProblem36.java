package Instruction4.Problem36;

import Instruction4.Problem14.Problem14;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class TestProblem36 {
    @Test
    @Timeout(1)
    void checkSecondLargest(){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(2);
        temp.add(4);
        temp.add(6);
        temp.add(8);
        BinaryTree tree = Problem36.createTree(temp);
        assertEquals(6, Problem36.P036(tree));
    }
}
