//leetcode  128

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        Set<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }

        int max = 0; // Better to start at 0 than MIN_VALUE

        for (int num : hs) {
            // ONLY start counting if 'num' is the START of a sequence
            // This prevents the Time Limit Exceeded error
            if (!hs.contains(num - 1)) {
                int currentNum = num;
                int m = 1;

                while (hs.contains(currentNum + 1)) {
                    m++;
                    currentNum += 1;
                }
                max = Math.max(max, m);
            }
        }
        return max;
    }
}
