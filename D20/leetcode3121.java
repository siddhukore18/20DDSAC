///leetcode   3121



import java.util.*;

class Solution {
    public int numberOfSpecialChars(String word) {

        int count = 0;

        Set<Character> lower = new HashSet<>();
        Set<Character> invalid = new HashSet<>();
        Set<Character> counted = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {

                lower.add(ch);

                // lowercase appeared after uppercase
                if (counted.contains(Character.toUpperCase(ch))) {
                    count--;
                    counted.remove(Character.toUpperCase(ch));
                    invalid.add(ch);
                }

            } else {

                char small = Character.toLowerCase(ch);

                if (lower.contains(small) &&
                    !invalid.contains(small) &&
                    !counted.contains(ch)) {

                    count++;
                    counted.add(ch);
                }
            }
        }

        return count;
    }
}
