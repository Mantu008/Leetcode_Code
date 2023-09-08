class Solution {
    public void moveZeroes(int[] nums) {
         remove(nums);

          for(int i=0;i<nums.length;i++){
           System.out.print(nums[i]+" ");
        }
    }

     public static void remove(int arr[]){
          int j=0;
          int k=0;
          for(int i=0;i<arr.length;i++){
               if(arr[i]==0){
                   k++;
                   continue;
               }else{
                  arr[j]=arr[i];
                  j++;
               }
          }   
          
          System.out.println(k);

          for(int i=arr.length-k;i<arr.length;i++){
                      arr[i]=0;
          }
}
}