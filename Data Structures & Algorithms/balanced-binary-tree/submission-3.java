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
    public boolean isBalanced(TreeNode root) {
        int res = Height(root);
        return res!=-1;

    }
 
    private int Height(TreeNode root){
        int left = 0;
        int right = 0;
        if(root == null) return 0;
        

        left = Height(root.left);
        right = Height(root.right);
        if(left == -1 || right == -1) return -1;
        if(Math.abs(left-right)>1) return -1;

        
        return Math.max(left,right)+1;
    }
}
