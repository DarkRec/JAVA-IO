package Instruction3.Problem17;

public class Problem17 {
    /*
    Suppose we represent our file system by a string in the following manner:
    The string "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" represents:
    */
    static public String P017(String dir) {
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
}
