class Solution {
    public int maxProfit(int[] prices) {
        int minval = Integer.MAX_VALUE;
        int maxval = 0;
        for(int num : prices){
            if(num < minval){
                minval = num;
            }
            else{
                int profit = num - minval;
                if(profit > maxval){
                    maxval = profit;
                }
            }
        }
        return maxval;
    }
}
