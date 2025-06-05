class Solution {
    public void moveZeroes(int[] nums) {
       moveZero(nums);
    }

    public static void moveZero(int arr[]){
        int nonZeroIdx=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
              arr[nonZeroIdx]=arr[i];
              nonZeroIdx++;
           }
        }

        for(int i=nonZeroIdx;i<arr.length;i++){
            arr[i]=0;
        }
    }
}