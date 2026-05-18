class Solution {
    private  void merge(int[] nums , int min,int mid ,int max ){

        int arr1[] = new int[mid-min+1];
        int arr2[] = new int[max -mid];


        for(int i = 0; i<arr1.length ; i++){
            arr1[i] = nums[min+i];
        }

        for(int i = 0; i<arr2.length ; i++){
            arr2[i] = nums[mid+i+1];
        }


        int i= 0,j=0,k=min;

        while(i<arr1.length&&j<arr2.length){
            
            if(arr1[i]<arr2[j]) {
                nums[k] = arr1[i];
                i++;
                k++;
            }else{
                nums[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            nums[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            nums[k] = arr2[j];
            j++;
            k++;
        }

    }


    private void divide(int nums[] , int min ,int max){
        int mid =min+ (max-min)/2;
        if(min>=max) return ;
        divide(nums,min,mid);
        divide(nums,mid+1,max);
        merge(nums,min ,mid,max);
    }
    public int[] sortArray(int[] nums) {

        divide(nums,0,nums.length-1);
        return nums;
        
    }
}
