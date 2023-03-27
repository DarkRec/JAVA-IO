package Instruction3.Problem102;

import java.util.ArrayList;

public class Problem102 {
        /*
        Given a list of integers and a number K, return which contiguous elements of the list sum to K.
        For example, if the list is [1, 2, 3, 4, 5] and K is 9, then it should return [2, 3, 4].
        */
    static public ArrayList<Integer> P102(ArrayList<Integer> list, int K) {
        ArrayList<Integer> toReturn = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            int temp = 0;
            toReturn = new ArrayList<Integer>();
            for (int j = 0; j < list.size() - i; j++) {
                if (temp < K) {
                    temp += list.get(i + j);
                    toReturn.add(list.get(i + j));
                }
                if (temp == K) {
                    return toReturn;
                }
            }
        }
        return toReturn;
    }
}
