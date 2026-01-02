class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.replace(num, map.get(num) + 1);
            if (map.get(num) == nums.length / 2) return num;
        }
    return -1;
    }
    
}