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

 //New Concept of segment tree, to just index each level with a simple formula consider i as parent. Then left child = 2*i+1 and right
 //=2*i+2, but to avoid overflow always reset minus i to minimum of siblings eg batatahu

 // 1 ka i hai 0 toh 3 ka huya 1 aur 2 ka huya 2
 // but ab jab 3 ke baccho ko ke liye i chahiye toh 3 ke index 1 mei se min(1,2) minus karo matlab 1-1 = 0 and 2 ke liye 2-1 1

 //ab overflow nahi hoga aur level order se easy logic lagake ans aa gaya


//ab ek aur concept, queue mei Generic mei custom class daalo jisme node,index pair store hota hai easy
class Pair{
    public TreeNode node;
    public int index;
    Pair(TreeNode node, int index){
        this.node = node;
        this.index = index;
    }
}
class Solution {
    
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int mini = q.peek().index; // 2 siblings mei se chote ka index to minus later for overflow calc
            int n = q.size();
            int first = 0;
            int last = 0;
            for(int i = 0; i<n; i++){
                int curr = q.peek().index-mini;
                TreeNode node = q.peek().node;
                q.poll();
                
                if(node.left!=null)q.offer(new Pair(node.left,2*curr+1));
                if(node.right!=null)q.offer(new Pair(node.right,2*curr+2));

                if(i==0)first = curr;
                if(i==n-1)last = curr;
            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }
}