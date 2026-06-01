//leetcode 268



class Solution {
    public int missingNumber(int[] nums) {

        int n=(nums.length*(nums.length+1))/2;
    int count =0;
        for(int i=0;i<nums.length;i++){
            count+=nums[i];
        }

        return n-count;


    }
}
