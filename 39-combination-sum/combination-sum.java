class Solution {
    public ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(new ArrayList<Integer>(),candidates,target,0);
        return ans;
    }
    public  void solve(ArrayList<Integer> list, int [] candidates, int target,int index){
        if(target<0) return ;
        if(target==0){
            ArrayList<Integer> safe = new ArrayList<Integer>(list);
            Collections.sort(safe);
            ans.add(safe);
            return ;
        }
        for (int i=index; i<candidates.length; i++) {
            int nums=candidates[i];
            if(nums<=target){
                list.addLast(nums);
                solve(list,candidates,target-nums,i);
                list.removeLast();
            }
        }
    }
}