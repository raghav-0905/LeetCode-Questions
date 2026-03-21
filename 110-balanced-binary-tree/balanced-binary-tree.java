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
        boolean[] ans = new boolean[1];
        ans[0] = true;
        int height_diff = helper(root,1,ans);
        return ans[0];
    }
    public int helper(TreeNode root, int level, boolean[] ans){
        if(root==null){
            return level-1;
        }
        int leftMax = helper(root.left,level+1,ans);
        int rightMax = helper(root.right,level+1,ans);
        int offset = leftMax-rightMax;
        if(offset!=0 && offset!=1 && offset!=-1)ans[0]=false;

        return Math.max(leftMax,rightMax);
    }
}