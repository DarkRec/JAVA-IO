package Instruction4.Problem2;

import java.util.ArrayList;

public class Problem2 {
    /*
    Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
    For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
    Follow-up: what if you can't use division?
    */
    static public ArrayList<Integer> P002(ArrayList<Integer> list){
        ArrayList<Integer> productList = new ArrayList<Integer>();
        for (int i=0;i<list.size();i++) {
            Integer product = 1;
            for (int j = 0; j < list.size(); j++){
                if (i!=j)
                    product*=list.get(j);
            }
            productList.add(product);
        }
        return productList;
    }
}
