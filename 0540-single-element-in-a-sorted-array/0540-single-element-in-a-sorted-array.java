class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
         }
           return nums[n-1];  
    }
}