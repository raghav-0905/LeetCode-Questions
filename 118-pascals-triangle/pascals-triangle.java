class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        inner.add(1);
        ans.add(inner);
        for(int i = 1; i<numRows; i++){
            inner = new ArrayList<>();
            for(int j = 0; j<=i; j++){
                int left = j-1;
                int right = j;
                int leftElement = left<0?0:ans.get(i-1).get(left);
                int rightElement = right<=i-1?ans.get(i-1).get(right):0;
                inner.add(leftElement+rightElement);
            }
            ans.add(inner);
        }
        return ans;
    }
}