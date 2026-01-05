class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int l = 0, r = -1, basket = 0;
        int maxfruit = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r<n-1){
            r++;
            if(basket<2){
                if(!map.containsKey(fruits[r]))basket++;
                map.put(fruits[r],r);
            }else{
                if(map.containsKey(fruits[r])){
                    map.put(fruits[r],r);
                }else{
                    int pos = map.get(fruits[l]);
                    while(basket!=1){
                        if(map.containsKey(fruits[l]) && map.get(fruits[l])==l){
                            map.remove(fruits[l]);
                            basket--;
                        }
                        l++;
                    }
                    map.put(fruits[r],r);
                    basket++;
                }
            }
            maxfruit = Math.max(maxfruit,r-l+1);
        }
        return maxfruit;
    }
}