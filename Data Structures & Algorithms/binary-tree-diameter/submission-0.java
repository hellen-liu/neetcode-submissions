/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter = diameter(root);
        return Math.max(max, diameter);
    }
    private int diameter(TreeNode root){
        if(root == null) return -1;
        int left =diameter(root.left)+1;
        int right = diameter(root.right)+1;
        max = (left+right>=max)?left+right:max;
        return Math.max(left,right);
    }
}
