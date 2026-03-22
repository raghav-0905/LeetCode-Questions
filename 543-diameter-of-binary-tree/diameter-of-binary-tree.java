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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans = new int[1];
        int height = helper(root,0,ans);
        return ans[0];
    }
    public int helper(TreeNode root, int level,int[] ans){
        if(root==null)return level-1;
        int leftheight = helper(root.left,level+1,ans) - level;
        int rightheight = helper(root.right,level+1,ans) - level;
        int diameter = leftheight+rightheight;

        ans[0] = Math.max(diameter,ans[0]);

        return Math.max(leftheight+level,rightheight+level);
    }
}