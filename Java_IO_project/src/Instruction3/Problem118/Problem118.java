package Instruction3.Problem118;

import java.util.ArrayList;
import java.util.Comparator;

public class Problem118 {
    /*
    Given a sorted list of integers, square the elements and give the output in sorted order.
    For example, given [-9, -2, 0, 2, 3], return [0, 4, 4, 9, 81].
    */
    static public ArrayList<Integer> P118(ArrayList<Integer> list) {
        ArrayList<Integer> toReturn = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            toReturn.add((int) Math.pow(list.get(i),2));
        }
        toReturn.sort(Comparator.naturalOrder());
        return toReturn;
    }
}
