/// leetcode 43

class Solution {
    public int[] searchRange(int[] nums, int target) {


        if(nums.length==1&&nums[0]==target) return new int[]{0,0};

        int min=0,max=nums.length-1,mid;

        while(min<=max){
            mid = min+ (max-min)/2;


            if(nums[mid]==target){
                int i=mid,j=mid;

                while(i>0){
                    i--;
                    if(!(nums[i]==target)){
                        i++;
                        break;
                    }
                }

                while(j<nums.length-1){
                    j++;
                    if(!(nums[j]==target)){
                        j--;
                        break;
                    }
                }
                return new int[]{i,j};


            }else if(nums[mid]>target){
                max=mid-1;
            }else{
                min=mid+1;

            }
        }
        return new int[]{-1,-1};
    }
}
