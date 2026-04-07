package datastructures.treesandgraphs;
import java.util.*;

class TreeNode{
    int value;
    TreeNode left, right;

    TreeNode(int value){
        this.value = value;
    }

    static int findHeight(TreeNode root){
        if(root == null){
            return 0;
        }

        int lh = findHeight(root.left);
        int rh = findHeight(root.right);

        return 1 + Math.max(lh,rh);
    }
}

public class BinaryTreeHeight {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println("Height of the Binary Tree: " + TreeNode.findHeight(root));
    }
}