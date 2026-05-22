//leetcode 229
import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {


        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            if(map.get(nums[i])==null ) map.put(nums[i],1);
            else map.put(nums[i],map.get(nums[i])+1);
        }

        List<Integer>  list = new ArrayList<>();


        for(Map.Entry<Integer, Integer> e : map.entrySet()){

            if(e.getValue()*3>nums.length){
                list.add(e.getKey());
            }
        }
        return list;

        
    }
}
