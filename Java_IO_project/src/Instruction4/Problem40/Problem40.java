package Instruction4.Problem40;

import java.util.ArrayList;
import java.util.Collections;

public class Problem40 {
    /*
    Given an array of integers where every integer occurs three times except for one integer, which only occurs once, find and return the non-duplicated integer.
    For example, given [6, 1, 3, 3, 3, 6, 6], return 1. Given [13, 19, 13, 13], return 19.
    */
    static public int P040(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            if (Collections.frequency(list,list.get(i)) == 1)
                return list.get(i);
        }
        return 0;
    }
}
