package Instruction3;

import java.util.*;

public class Problem {

    boolean P001(ArrayList<Integer> list, Integer val){
        /*
        Given a list of numbers, return whether any two sums to k. For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
        Bonus: Can you do this in one pass?
        */
        for (int i=0;i<list.size();i++)
            for (Integer integer : list)
                if (list.get(i) + integer == val)
                    return true;
        return false;
    }

    ArrayList<Integer> P002(ArrayList<Integer> list){
        /*
        Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
        For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
        Follow-up: what if you can't use division?
        */
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

    int P004(ArrayList<Integer> list) {
        /*
        Given an array of integers, find the first missing positive integer in linear time and constant space.
        In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
        For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
        You can modify the input array in-place.
        */
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

    void P007(){}

    Integer P009(ArrayList<Integer> list){
        /*
        Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.
        For example, [2, 4, 6, 8] should return 12, since we pick 4 and 8. [5, 1, 1, 5] should return 10, since we pick 5 and 5.
        */
        int sum = 0;
        for (int i=0;i<list.size();i++)
            for (int j=0;j<list.size();j++)
                if ((j-1)!=i && j!=i && (j+1)!=i && sum < list.get(i)+list.get(j))
                    sum = list.get(i)+list.get(j);
        return sum;
    }
    ArrayList<String> P011(ArrayList<String> strings, String pre){
        /*
        Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.
        For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
        Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.
        */
        ArrayList<String> preList= new ArrayList<String>();
        for (String string : strings) {
            if (string.startsWith(pre)) {
                preList.add(string);
            }
        }
        return preList;
    }
    String P014(int tests){
        /*
        The area of a circle is defined as r^2. Estimate \pi to 3 decimal places using a Monte Carlo method.
        Hint: The basic equation of a circle is x^2 + y^2 = r^2.
        */
        int inCircle=0;
        Random rand = new Random();
        for (int i=0;i<tests;i++) {
            double r1 = rand.nextDouble();
            double r2 = rand.nextDouble();

            if (Math.pow(r1, 2) + Math.pow(r2, 2) < 1)
                inCircle++;
        }
        return String.format("%.4g%n", 4*(double)inCircle/(double)tests);
    }
    String P017(String dir) {
        /*
        Suppose we represent our file system by a string in the following manner:
        The string "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" represents:
        */
        String[] words = dir.split("\\\\");
        int max = 0, temp=0;
        for (String word : words) {
            if(word.charAt(0) == 'n') {
                temp=0;
                System.out.print("\n" + word.substring(1));
            }
            else if(word.charAt(0) == 't') {
                temp += 1;
                System.out.print("\t" + word.substring(1));
            }
            else {
                temp+=1;
                System.out.print(word);
            }
            if (temp>max) {
                max = temp;
            }
        }
        return dir;
    }
    ArrayList<String> P035(ArrayList<String> list){
        /*
        Given an array of strictly the characters 'R', 'G', and 'B', segregate the values of the array so that all the Rs come first, the Gs come second, and the Bs come last. You can only swap elements of the array.
        Do this in linear time and in-place.

        For example, given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'], it should become ['R', 'R', 'R', 'G', 'G', 'B', 'B'].
        */
        list.sort(Collections.reverseOrder());
        return list;
    }

    int P040(ArrayList<Integer> list){
        /*
        Given an array of integers where every integer occurs three times except for one integer, which only occurs once, find and return the non-duplicated integer.
        For example, given [6, 1, 3, 3, 3, 6, 6], return 1. Given [13, 19, 13, 13], return 19.
        */
        for(int i=0;i<list.size();i++){
            if (Collections.frequency(list,list.get(i)) == 1)
                return list.get(i);
        }
        return 0;
    }

    int P069(ArrayList<Integer> list){
        /*
        Given a list of integers, return the largest product that can be made by multiplying any three integers.
        For example, if the list is [-10, -10, 5, 2], we should return 500, since that's -10 _ -10 _ 5.
        You can assume the list has at least three integers.
        */
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
    int P070(int n){
        /*
        A number is considered perfect if its digits sum up to exactly 10.
        Given a positive integer n, return the n-th perfect number.
        For example, given 1, you should return 19. Given 2, you should return 28.
        */
        int x=19;
        int fin=1;
        while(fin<n){
            x++;
            int s = 0;
            for (int i=0;i<String.valueOf(x).length();i++){
                if (s<10)
                    s += Character.getNumericValue(Integer.toString(x).charAt(i));
                else
                    break;
            }
            if (s == 10)
                fin++;
        }
        return x;
    }
    ArrayList<Integer> P102(ArrayList<Integer> list, int K) {
        /*
        Given a list of integers and a number K, return which contiguous elements of the list sum to K.
        For example, if the list is [1, 2, 3, 4, 5] and K is 9, then it should return [2, 3, 4].
        */
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
    ArrayList<Integer> P118(ArrayList<Integer> list) {
        /*
        Given a sorted list of integers, square the elements and give the output in sorted order.
        For example, given [-9, -2, 0, 2, 3], return [0, 4, 4, 9, 81].
        */
        ArrayList<Integer> toReturn = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            toReturn.add((int) Math.pow(list.get(i),2));
        }
        toReturn.sort(Comparator.naturalOrder());
        return toReturn;
    }
    char[][] P151(char[][] tab,int x,int y, char newChar) {
        /*
        Given a 2-D matrix representing an image, a location of a pixel in the screen and a color C, replace the color of the given pixel and all adjacent same colored pixels with C.
        For example, given the following matrix, and location pixel of (2, 2), and 'G' for green:
        B B W
        W W W
        W W W
        B B B
        */
        char s = tab[x][y];
        for(int i=0;i< tab.length;i++)
            for(int j=0;j<tab[i].length;j++)
                if(tab[i][j] == s)
                    tab[i][j] = newChar;


        for(int i=0;i< tab.length;i++) {
            for (int j = 0; j < tab[i].length; j++)
                System.out.print(tab[i][j]+" ");
            System.out.println("\n");
        }
        return tab;
    }
}
