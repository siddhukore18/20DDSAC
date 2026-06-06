//leetcode 1539
class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();

       for(int i = 0 ; i < arr.length;i++){
            set.add(arr[i]);
       }

       int i =1;
       while(true){
            if(!set.contains(i)){
                k--;
                if(k==0) return i;
            }
            i++;

       }
    }
}
