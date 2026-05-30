//  leeetcode 122


class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0 ,buyP=0;

        boolean isB = false;
        for(int i =0; i<prices.length-1;i++){

            if(prices[i]<prices[i+1]&&!isB){

                isB =true;
                buyP = prices[i];

            }
            if(prices[i]>prices[i+1]&&isB){
                profit+=prices[i]-buyP;
                buyP=0;
                isB=false;
            }
        }
        if(isB) profit+=prices[prices.length-1]-buyP;
        return profit;

    }
}
