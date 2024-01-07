class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length-1;
        int max=prices[n];
        int ans =0;
        for(int i= n-1 ; i >=0 ; i--){
            max = Math.max(max,prices[i]);
            ans = Math.max(ans,max-prices[i]);
        }
        return ans;
    }
}