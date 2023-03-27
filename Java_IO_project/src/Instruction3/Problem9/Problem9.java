package Instruction3.Problem9;

import java.util.ArrayList;

public class Problem9 {
        /*
        Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.
        For example, [2, 4, 6, 8] should return 12, since we pick 4 and 8. [5, 1, 1, 5] should return 10, since we pick 5 and 5.
        */
        static public Integer P009(ArrayList<Integer> list){
        int sum = 0;
        for (int i=0;i<list.size();i++)
            for (int j=0;j<list.size();j++)
                if ((j-1)!=i && j!=i && (j+1)!=i && sum < list.get(i)+list.get(j))
                    sum = list.get(i)+list.get(j);
        return sum;
    }
}
