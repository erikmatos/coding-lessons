package ca.ematos.leetcode.algorithms;

public class TreeNode {
    int val;
    ca.ematos.leetcode.algorithms.TreeNode left;
    ca.ematos.leetcode.algorithms.TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, ca.ematos.leetcode.algorithms.TreeNode left, ca.ematos.leetcode.algorithms.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return Integer.valueOf(val).toString();
    }
}
