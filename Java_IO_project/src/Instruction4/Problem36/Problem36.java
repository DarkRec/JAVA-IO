package Instruction4.Problem36;

import java.util.ArrayList;

public class Problem36 {
    /*
    Given the root to a binary search tree, find the second largest node in the tree.
    */
    public static BinaryTree createTree(ArrayList<Integer> list) {
        BinaryTree bt = new BinaryTree();
        for (int i = 0; i < list.size(); i++) {
            bt.add(list.get(i));
        }
        return bt;
    }

    public static Node[] largestPair(Node node){
        Node parent = null;
        while (node.right != null){
            parent = node;
            node = node.right;
        }
        Node[] a = {parent,node};
        return a;
    }

    public static int P036(BinaryTree tree){
        if(tree.root == null){
            return 0;
        }
        Node largest[] = largestPair(tree.root);
        if (largest[0].left != null) {
            Node secondLargest[] = largestPair(largest[0].left);
            return secondLargest[1].value;
        } else if (largest[0] == null) {
            return 0;
        }
        return largest[0].value;
    }
}


