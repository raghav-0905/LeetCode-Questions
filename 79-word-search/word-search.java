class Solution {
    public boolean exist(char[][] board, String word) {
        boolean ans = false;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                ans = ans || helper(board, word, i, j, word.length());
            }
        }
        return ans;
    }

    public boolean helper(char[][] board, String word, int r, int c, int count) {
        if(count == 0){
            return true;
        }

        if(board[r][c] == '0'){
            return false;
        }

        char ch = board[r][c];
        if(ch != word.charAt(0)){
            return false;
        }

        board[r][c] = '0';
        word = word.substring(1);
        count--; // ✅ critical fix

        boolean curr = count==0?true:false;

        if(r > 0){
            curr = curr || helper(board, word, r-1, c, count);
        }
        if(c > 0){
            curr = curr || helper(board, word, r, c-1, count);
        }
        if(r < board.length-1){
            curr = curr || helper(board, word, r+1, c, count);
        }
        if(c < board[0].length-1){
            curr = curr || helper(board, word, r, c+1, count);
        }

        board[r][c] = ch; 
        return curr;
    }
}
