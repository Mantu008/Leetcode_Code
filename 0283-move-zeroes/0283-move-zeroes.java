class Solution {
    public void moveZeroes(int[] nums) {
         int n=nums.length;
         remove(nums,n);
    }

     public static void remove(int arr[],int n){
          int j=0;
          for(int i=0;i<n;i++){
               if(arr[i]==0){
                   continue;
               }else{
                  arr[j]=arr[i];
                  j++;
               }
          }   

          for(int i=j;i<n;i++){
                      arr[i]=0;
          }
}
}