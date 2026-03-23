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
    int sum = -1000;
    public int maxPathSum(TreeNode root) {
        int total = helper(root);
        return sum;
    }
    public int helper(TreeNode root){
        if(root==null)return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        left = left<0?0:left;
        right = right<0?0:right;

        int pathsum = root.val + left + right;
        sum = Math.max(sum,pathsum);

        return root.val + Math.max(left,right);
    }
}