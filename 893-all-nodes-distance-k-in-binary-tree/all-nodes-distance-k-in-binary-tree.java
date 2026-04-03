/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void fillMap(TreeNode root, Map<TreeNode, TreeNode> map){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node.left!=null){
                q.offer(node.left);
                map.put(node.left,node);
            }
            if(node.right!=null){
                q.offer(node.right);
                map.put(node.right,node);
            }
        }

    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        fillMap(root, parent);
        Map<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(target);
        visited.put(target,true);
        int level = 0;
        while(!q.isEmpty()){
            if(level==k)break;
            level++;
            int n = q.size();
            for(int i = 0; i<n ; i++){
                TreeNode node = q.poll();
                if(parent.get(node)!=null && visited.get(parent.get(node))==null){
                    visited.put(parent.get(node),true);
                    q.offer(parent.get(node));
                }
                if(node.left!=null && visited.get(node.left)==null){
                    visited.put(node.left,true);
                    q.offer(node.left);
                }
                if(node.right!=null && visited.get(node.right)==null){
                    visited.put(node.right,true);
                    q.offer(node.right);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        return ans;
    }
}