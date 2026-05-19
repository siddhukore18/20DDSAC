//leetcode 287

class Solution {
    public int findDuplicate(int[] nums) {
       int arr[]  = new int[nums.length];
       for(int i=0;i<nums.length;i++){
            arr[nums[i]-1]++;

       }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1) return i+1;
        }
         return 1;
    }

}
