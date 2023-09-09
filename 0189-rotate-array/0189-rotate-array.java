class Solution {
    public void rotate(int[] nums, int k) {
      int arr[]=new int[nums.length];
        rotate(nums,arr,k);
    }

      public static void rotate(int nums[],int arr[],int k){
           int size=nums.length;
            k=k%size;
            k=size-k;
              
            int n=k;
            int j=0;
            for(int i=n;i<size;i++){
                arr[j]=nums[i];
                j++;    
            }

            n=k;

            for(int i=0;i<k;i++){
                arr[j]=nums[i];
                j++;
            }

            for(int i=0;i<size;i++){
                nums[i]=arr[i];
          }

     } 
}