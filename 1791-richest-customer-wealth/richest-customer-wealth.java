class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth = 0;
        for(int i=0; i<accounts.length;i++){
            int currwealth=0;
            for(int j=0; j<accounts[0].length;j++){
                currwealth+=accounts[i][j];
            }
            maxwealth = maxwealth>currwealth? maxwealth: currwealth;
        }
        return maxwealth;
    }
}