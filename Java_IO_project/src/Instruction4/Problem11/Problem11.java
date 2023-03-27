package Instruction4.Problem11;

import java.util.ArrayList;

public class Problem11 {
        /*
        Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.
        For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
        Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.
        */
    static public ArrayList<String> P011(ArrayList<String> strings, String pre){
        ArrayList<String> preList= new ArrayList<String>();
        for (String string : strings) {
            if (string.startsWith(pre)) {
                preList.add(string);
            }
        }
        return preList;
    }
}
