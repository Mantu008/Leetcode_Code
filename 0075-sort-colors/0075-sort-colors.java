class Solution {
    public void sortColors(int[] nums) {
        
        // Arrays.sort(nums);

    int n=nums.length;

          for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    int temp;
                    temp=nums[i];
                   nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}