package Instruction4.Problem1;

import java.util.ArrayList;

public class Problem1 {
    /*
    Given a list of numbers, return whether any two sums to k. For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
    Bonus: Can you do this in one pass?
    */
    static public boolean P001(ArrayList<Integer> list, Integer val){
        for (int i=0;i<list.size();i++)
            for (Integer integer : list)
                if (list.get(i) + integer == val)
                    return true;
        return false;
    }

}
