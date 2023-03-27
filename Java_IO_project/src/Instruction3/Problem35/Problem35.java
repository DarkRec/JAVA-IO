package Instruction3.Problem35;

import java.util.ArrayList;
import java.util.Collections;

public class Problem35 {
    /*
    Given an array of strictly the characters 'R', 'G', and 'B', segregate the values of the array so that all the Rs come first, the Gs come second, and the Bs come last. You can only swap elements of the array.
    Do this in linear time and in-place.

    For example, given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'], it should become ['R', 'R', 'R', 'G', 'G', 'B', 'B'].
    */
    static public ArrayList<String> P035(ArrayList<String> list){
        list.sort(Collections.reverseOrder());
        return list;
    }

}
