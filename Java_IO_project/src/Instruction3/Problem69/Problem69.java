package Instruction3.Problem69;

import java.util.ArrayList;

public class Problem69 {
    /*
    Given a list of integers, return the largest product that can be made by multiplying any three integers.
    For example, if the list is [-10, -10, 5, 2], we should return 500, since that's -10 _ -10 _ 5.
    You can assume the list has at least three integers.
    */
    static public int P069(ArrayList<Integer> list){
        int max = list.get(0)*list.get(1)*list.get(2);
        for(int i =0;i<list.size();i++){
            for(int j =0;j<list.size();j++){
                for (int k =0;k<list.size();k++){
                    if (i!=j && j!=k && i!=k && list.get(i)*list.get(j)*list.get(k) > max){
                        max = list.get(i)*list.get(j)*list.get(k);
                    }
                }
            }
        }
        return max;
    }
}
