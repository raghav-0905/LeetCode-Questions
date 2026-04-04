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
    public void flatten(TreeNode root) {
        if(root==null)return;

        List<TreeNode> list = new ArrayList<>();
        fill(root,list);
        int size = list.size();
        for(int i = 1; i<size; i++){
            TreeNode prev = list.get(i-1);
            TreeNode curr = list.get(i);

            prev.left = null;
            prev.right = curr;
        }
        
    }
    public void fill(TreeNode root, List<TreeNode> list){
        if(root==null)return;

        list.add(root);
        fill(root.left,list);
        fill(root.right,list);
    }
}