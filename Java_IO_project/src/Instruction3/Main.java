package Instruction3;

import Instruction3.Problem1.*;
import Instruction3.Problem2.*;
import Instruction3.Problem4.*;
import Instruction3.Problem9.*;
import Instruction3.Problem11.*;
import Instruction3.Problem14.*;
import Instruction3.Problem17.*;
import Instruction3.Problem35.*;
import Instruction3.Problem36.*;
import Instruction3.Problem40.*;
import Instruction3.Problem69.*;
import Instruction3.Problem70.*;
import Instruction3.Problem102.*;
import Instruction3.Problem118.*;
import Instruction3.Problem151.*;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {

        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(10);
        temp.add(15);
        temp.add(3);
        temp.add(7);
        System.out.println("\nProblem 1");
        System.out.println(Problem1.P001(temp,17));
        System.out.println(Problem1.P001(temp,16));


        temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        temp.add(4);
        temp.add(5);
        System.out.println("\nProblem 2");
        System.out.println(Problem2.P002(temp));

        temp = new ArrayList<>();
        temp.add(3);
        temp.add(4);
        temp.add(-1);
        temp.add(1);
        System.out.println("\nProblem 4");
        System.out.println(Problem4.P004(temp));

        temp = new ArrayList<>();
        temp.add(2);
        temp.add(4);
        temp.add(6);
        temp.add(8);
        System.out.println("\nProblem 9");
        System.out.println(Problem9.P009(temp));

        ArrayList<String> strings = new ArrayList<>();
        strings.add("dog");
        strings.add("deer");
        strings.add("deal");
        System.out.println("\nProblem 11");
        System.out.println(Problem11.P011(strings, "de"));

        System.out.println("\nProblem 14");
        System.out.println(Problem14.P014(50000));

        System.out.println("\nProblem 17");
        Problem17.P017("dir\\n\\tSubdir1\\n\\tSubdir2\\n\\t\\tFile.ext");

        strings = new ArrayList<>();
        strings.add("G");
        strings.add("B");
        strings.add("R");
        strings.add("R");
        strings.add("B");
        System.out.println("\nProblem 35");
        System.out.println(Problem35.P035(strings));

        BinaryTree tree =  Problem36.createTree(temp);
        System.out.println("\nProblem 36");
        System.out.println(Problem36.P036(tree));

        temp = new ArrayList<>();
        temp.add(1);
        temp.add(5);
        temp.add(3);
        temp.add(1);
        temp.add(5);
        temp.add(1);
        temp.add(1);
        temp.add(5);
        System.out.println("\nProblem 40");
        System.out.println(Problem40.P040(temp));

        temp = new ArrayList<>();
        temp.add(2);
        temp.add(1);
        temp.add(5);
        temp.add(7);
        temp.add(2);
        temp.add(0);
        temp.add(5);
        System.out.println("\nProblem 69");
        System.out.println(Problem69.P069(temp));

        System.out.println("\nProblem 70");
        System.out.println(Problem70.P070(4));

        temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        temp.add(4);
        temp.add(5);
        System.out.println("\nProblem 102");
        System.out.println(Problem102.P102(temp,9));

        temp = new ArrayList<>();
        temp.add(-9);
        temp.add(-2);
        temp.add(0);
        temp.add(2);
        temp.add(3);
        System.out.println("\nProblem 118");
        System.out.println(Problem118.P118(temp));

        char[][] tab2 = {{'B','B','W'},{'W','W','W'},{'W','W','W'},{'B','B','B'}};
        System.out.println("\nProblem 151");
        Problem151.P151(tab2,2,2,'G');

    }
}
