package ca.ematos.leetcode.algorithms;



public class CountGoodNodesInBinaryTree {

    public static void main(String[] args){

        TreeNode nodeChildLeft = new TreeNode(1, new TreeNode(3, null, null), null);
        TreeNode nodeChildRight = new TreeNode(4, new TreeNode(1, null, null), new TreeNode(5, null, null));

        TreeNode root = new TreeNode(3, nodeChildLeft, nodeChildRight);

        System.out.println(goodNodes(root));
    }

    public static int goodNodes(TreeNode root) {

        if (root == null){
            return 0;
        }

        return goodNodes(root, root.val);
    }

    public static int goodNodes(TreeNode root, int base){

        if (root == null){
            return 0;
        }

        base = Math.max(root.val, base);

        int count = root.val >= base ? 1 : 0;
        count += goodNodes(root.left, base);
        count += goodNodes(root.right, base);

        return count;
    }

}
