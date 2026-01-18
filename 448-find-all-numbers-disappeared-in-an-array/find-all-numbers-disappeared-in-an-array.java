class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while(i<n){
            int correct = nums[i]-1;
            if(nums[correct]!=nums[i]){
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
        for(i = 0; i<n; i++){
            if(nums[i]!=i+1){
                list.add(i+1);
            }
        }
        return list;

    }
}