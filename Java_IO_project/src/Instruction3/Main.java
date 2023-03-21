package Instruction3;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {

        Problem zadanie = new Problem();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(10);
        temp.add(15);
        temp.add(3);
        temp.add(7);
        System.out.println("\nProblem 1");
        System.out.println(zadanie.P001(temp,17));

        temp = new ArrayList<Integer>();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        temp.add(4);
        temp.add(5);
        System.out.println("\nProblem 2");
        System.out.println(zadanie.P002(temp));

        temp = new ArrayList<Integer>();
        temp.add(3);
        temp.add(4);
        temp.add(-1);
        temp.add(1);
        System.out.println("\nProblem 4");
        System.out.println(zadanie.P004(temp));

        temp = new ArrayList<Integer>();
        temp.add(2);
        temp.add(4);
        temp.add(6);
        temp.add(8);
        System.out.println("\nProblem 9");
        System.out.println(zadanie.P009(temp));

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("dog");
        strings.add("deer");
        strings.add("deal");
        System.out.println("\nProblem 11");
        System.out.println(zadanie.P011(strings, "de"));

        System.out.println("\nProblem 14");
        System.out.println(zadanie.P014(50000));

        System.out.println("\nProblem 17");
        zadanie.P017("dir\\n\\tsubdir1\\n\\tsubdir2\\n\\t\\tfile.ext");

        strings = new ArrayList<String>();
        strings.add("G");;
        strings.add("B");;
        strings.add("R");
        strings.add("R");
        strings.add("B");
        System.out.println("\nProblem 35");
        System.out.println(zadanie.P035(strings));

        temp = new ArrayList<Integer>();
        temp.add(1);
        temp.add(5);
        temp.add(3);
        temp.add(1);
        temp.add(5);
        temp.add(1);
        temp.add(1);
        temp.add(5);
        System.out.println("\nProblem 40");
        System.out.println(zadanie.P040(temp));

        temp = new ArrayList<Integer>();
        temp.add(2);
        temp.add(1);
        temp.add(5);
        temp.add(7);
        temp.add(2);
        temp.add(0);
        temp.add(5);
        System.out.println("\nProblem 69");
        System.out.println(zadanie.P069(temp));

        System.out.println("\nProblem 70");
        System.out.println(zadanie.P070(4));

        temp = new ArrayList<Integer>();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        temp.add(4);
        temp.add(5);
        System.out.println("\nProblem 102");
        System.out.println(zadanie.P102(temp,9));

        temp = new ArrayList<Integer>();
        temp.add(-9);
        temp.add(-2);
        temp.add(0);
        temp.add(2);
        temp.add(3);
        System.out.println("\nProblem 118");
        System.out.println(zadanie.P118(temp));

        char[][] tab2 = {{'B','B','W'},{'W','W','W'},{'W','W','W'},{'B','B','B'}};
        System.out.println("\nProblem 151");
        zadanie.P151(tab2,2,2,'G');

    }
}
