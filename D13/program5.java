///leetcode 247



import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Hashtable<Integer, Integer> ht = new Hashtable<>();

        for(int i = 0; i < nums.length; i++) {

            if(ht.containsKey(nums[i])) {
                ht.put(nums[i], ht.get(nums[i]) + 1);
            } else {
                ht.put(nums[i], 1);
            }
        }

        int arr[][] = new int[ht.size()][2];
        int i = 0;
        for(Map.Entry<Integer, Integer> e : ht.entrySet()) {
            arr[i][0]=e.getKey();
            arr[i][1]=e.getValue();
            i++;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));

        int res[]= new int[k];
        for(int j = 0 ; j<k;j++){
            res[j]=arr[j][0];
        }
        return res;




    }
}
