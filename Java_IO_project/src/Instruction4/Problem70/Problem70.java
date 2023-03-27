package Instruction4.Problem70;

public class Problem70 {
    /*
    A number is considered perfect if its digits sum up to exactly 10.
    Given a positive integer n, return the n-th perfect number.
    For example, given 1, you should return 19. Given 2, you should return 28.
    */
    static public int P070(int n){
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
}
