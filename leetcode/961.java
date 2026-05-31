//leetcode 961


class Solution {
    public int repeatedNTimes(int[] nums) {

       Set<Integer> ht = new HashSet<>();

        for(int i = 0 ;i <nums.length;i++){
            if(ht.contains(nums[i]))  return nums[i];
            else ht.add(nums[i]);
        }
        return nums[0];

    }
}
