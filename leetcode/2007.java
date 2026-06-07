// leetcode 2007


import java.util.*;

class Solution {
    public int[] findOriginalArray(int[] changed) {

        if (changed.length % 2 != 0) {
            return new int[0];
        }


        Arrays.sort(changed);


        Queue<Integer> queue = new LinkedList<>();
        int[] out = new int[changed.length / 2];
        int index = 0;

        for (int num : changed) {

            if (!queue.isEmpty() && queue.peek() == num) {
                queue.poll();
            } else {

                if (index == out.length) return new int[0];

                out[index++] = num;
                queue.offer(num * 2);
            }
        }

        if (!queue.isEmpty()) {
            return new int[0];
        }

        return out;
    }
}
