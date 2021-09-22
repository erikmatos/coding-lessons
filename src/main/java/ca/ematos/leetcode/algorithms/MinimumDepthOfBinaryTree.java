package ca.ematos.leetcode.algorithms;

public class MinimumDepthOfBinaryTree {

    public static void main(String[] args){

        //TreeNode nodeChildLeft = new TreeNode(9, null, null);
        //TreeNode nodeChildRight = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));

        //TreeNode root = new TreeNode(3, nodeChildLeft, nodeChildRight);

        /*
        TreeNode nodeChildRightSix = new TreeNode(6, null, null);
        TreeNode nodeChildRightFive = new TreeNode(5, null, nodeChildRightSix);
        TreeNode nodeChildRightFour = new TreeNode(4, null, nodeChildRightFive);
        TreeNode nodeChildRightThree = new TreeNode(3, null, nodeChildRightFour);

        TreeNode root = new TreeNode(2, null, nodeChildRightThree);
        */

        TreeNode nodeChildLeft = new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null));
        TreeNode nodeChildRight = new TreeNode(3, null, null);

        TreeNode root = new TreeNode(1, nodeChildLeft, nodeChildRight);
        System.out.println(minDepth(root));
    }

    public static int minDepth(TreeNode root) {

        // Null node has 0 depth.
        if (root == null){
            return 0;
        }

        // Leaf node reached.
        if (root.left == null && root.right == null){
            return 1;
        }

        // Current node has only right subtree.
        if (root.left == null)
        {
            return 1 + minDepth(root.right);
        }
        // Current node has only left subtree.
        else if (root.right == null)
        {
            return 1 + minDepth(root.left);
        }

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

}
