package Instruction4.Problem4;

import java.util.ArrayList;
import java.util.Comparator;

public class Problem4 {
    /*
    Given an array of integers, find the first missing positive integer in linear time and constant space.
    In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
    For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
    You can modify the input array in-place.
    */
    static public int P004(ArrayList<Integer> list) {
        ArrayList<Integer> sorted = (ArrayList<Integer>) list.clone();
        sorted.sort(Comparator.naturalOrder());
        sorted.add(sorted.get(sorted.size() - 1) + 1);
        boolean one = false;
        for (int i = 0; i < sorted.size() - 1; i++) {
            if (sorted.get(i) == 1)
                one = true;
            if (sorted.get(i) > 0) {
                if (sorted.get(i) == 1)
                    one = true;
                else if(!one)
                    return 1;
                if (sorted.get(i) + 1 != sorted.get(i + 1))
                    return sorted.get(i) + 1;
            }
        }
        return sorted.get(sorted.size() - 1);
    }
}
