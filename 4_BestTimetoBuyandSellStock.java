class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for(int i : prices)
        {
            int profit = i - minPrice;
            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, i);
        }

        return maxProfit;
    }

}