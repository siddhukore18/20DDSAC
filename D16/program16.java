//leetcode 3



import java.util.*;

class Solution {

    int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // remove chars until duplicate removed
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    // public static void main(String[] args) {

    //     Solution sol = new Solution();

    //     String s = "pwwkew";

    //     int result = sol.lengthOfLongestSubstring(s);

    //     System.out.println(result); // 3
    // }
}
