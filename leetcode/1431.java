// leetcode 1431


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < candies.length ; i ++){
            max = Math.max(candies[i],max);
        }
        
        List<Boolean> retArr = new ArrayList<>();
        for(int i = 0 ; i < candies.length ; i ++){
            if(candies[i]+extraCandies>=max) retArr.add(true) ;
            else retArr.add(false);
        }
        return retArr;


    }
}
