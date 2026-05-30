//leetcode 121



class Solution {
    public int maxProfit(int[] prices) {
        int max = 0,minP=prices[0];;



        for(int i = 0 ; i< prices.length; i++){

            if(minP>prices[i]) minP= prices[i];
            
            max=Math.max(prices[i]-minP,max);
            
        }
        return max;
    }
}
