class Solution {
    //Har element ke liye uske left mei smaller aur right mei smaller nikalenge.
    // mtlb uss element ko includ karke kitne subarray hai right mei aur left mei example in
    // [3,1,2,4] nse = [1,4,4,4] basically store the index of the next smaller element, if not present store N
    // pse = [-1,-1,1,2]
    // anyways example mei 2 ke liye uska previous smaller element 1 hai matlab vo usse pehle ke subarrays mei min hoga
    // but uske right mei N hai matlab sab subarray mei hoga
    // basically left*right will give you total subarrays where 2 is min and just multiply this to 2..

    // for edge case [1,1] this method will count twice bass issilye ek mei condition mei = laga denge pse mei 
    public static int[] pse(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                int pop = stack.pop();
            }
            res[i] = stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return res;
    }
    public static int[] nse(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        for(int j = n-1; j>=0; j--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[j]){
                int pop = stack.pop();
            }
            res[j] = stack.isEmpty()?n:stack.peek();
            stack.push(j);
        }
        return res;
    }
    public static int sumSubarrayMins(int[] arr) {
        int[] nse = nse(arr);
        int[] pse = pse(arr);
        int n = arr.length;

        long sum = 0;
        long mod = (int)1e9 + 7;

        for(int i = 0; i<n; i++){
            int left = i - pse[i];
            int right = nse[i] - i;
            int total = left*right;

            sum = (sum + (long)total*arr[i])%mod;

        }
        return (int)sum;
    }
}