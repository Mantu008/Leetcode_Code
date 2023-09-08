class Solution {
    public void moveZeroes(int[] nums) {
         remove(nums);
    }

     public static void remove(int arr[]){
          int j=0,k=0;
          for(int i=0;i<arr.length;i++){
               if(arr[i]==0){
                   k++;
                   continue;
               }else{
                  arr[j]=arr[i];
                  j++;
               }
          }   

          for(int i=arr.length-k;i<arr.length;i++){
                      arr[i]=0;
          }
}
}