//leetcode 2048



class Solution {
    public int nextBeautifulNumber(int n) {
        int num = n + 1;

        while (true) {
            if (isBeautiful(num)) {
                return num;
            }
            num++;
        }
    }

    private boolean isBeautiful(int num) {
        int[] freq = new int[10];
        int temp = num;

        while (temp > 0) {
            freq[temp % 10]++;
            temp /= 10;
        }

        for (int d = 0; d <= 9; d++) {
            if (freq[d] > 0 && freq[d] != d) {
                return false;
            }
        }

        return true;
    }
}
