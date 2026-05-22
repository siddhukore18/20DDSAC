//leetcode 41 



// import java.util.HashSet;
class Solution {
    public int firstMissingPositive(int[] nums) {


        HashSet<Integer> s = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
            max=Math.max(max,nums[i]);
        }

        for(int i=1;i<=max;i++){
            if(!s.contains(i)) return i;

        }
        if(max<1) return 1;
        return max+1;

    }
    // public static void main(String[] args) {
    //     Solution sol = new Solution();
    //     int[] nums = {3,4,-1,1};
    //     System.out.println(sol.firstMissingPositive(nums)); // Output: 2
    // }
}
