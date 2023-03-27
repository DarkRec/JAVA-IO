package Instruction4.Problem151;

public class Problem151 {
    /*
    Given a 2-D matrix representing an image, a location of a pixel in the screen and a color C, replace the color of the given pixel and all adjacent same colored pixels with C.
    For example, given the following matrix, and location pixel of (2, 2), and 'G' for green:
    B B W
    W W W
    W W W
    B B B
    */
    static public char[][] P151(char[][] tab,int x,int y, char newChar) {
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
