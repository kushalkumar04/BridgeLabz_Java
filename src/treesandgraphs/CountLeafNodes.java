package datastructures.treesandgraphs;

public class CountLeafNodes {
    static int countLeaves(TreeNode root){
        if (root == null) return 0;

        if(root.left == null && root.right == null){
            return 1;
        }

        return countLeaves(root.left) + countLeaves(root.right);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println("Leaf Nodes: " + countLeaves(root));
    }
}