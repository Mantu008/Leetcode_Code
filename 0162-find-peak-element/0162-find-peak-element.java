class Solution {
    public int findPeakElement(int[] nums) {

    if(nums.length==1) return 0;

    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        if (nums[i] > nums[i + 1]) {
           return i;
        }
      } else if (i == nums.length - 1) {
        if (nums[i] > nums[i - 1]) {
          return i;
        }
      } else if (nums[i] > nums[i + 1] && nums[i] > nums[i - 1]) {
        return i;
      }
    }

    return 0;

}

 public static int searchPeak(int arr[]){

   int start=0;
   int end=arr.length-1;

   if(arr.length==1) return 0;

   while (start<=end) {
      int mid=start+(end-start)/2;

      if (mid > 0 && mid<arr.length-1) {
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
         return mid;
      }else if(arr[mid-1]>arr[mid]){
          end=mid-1;
      }else if(arr[mid+1]>arr[mid]){
          start=mid+1;
      }

      }else if(mid==0){
        if(arr[0]>arr[1]){
            return 0;
        }else{
          return 1;
        }
      }else if(mid==arr.length-1){
          if(arr[arr.length-1]>arr[arr.length-2]){
                return arr.length-1;
          }else{
              return  arr.length-2; 
          }
      }
      
   }

   return -1;
 }
}