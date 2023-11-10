class Solution {
 public int findMin(int[] nums) {
  if(nums.length==1){
      return nums[0];
  }else if(nums.length==2){
    return Math.min(nums[0],nums[1]);
  }else if(nums[0]<nums[nums.length-1]){
      return nums[0];
  }
    int ans=search(nums);
    return ans;
}
public static int search(int arr[]){

 int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        // Check if mid is the minimum element
        if (mid > 0 && arr[mid] < arr[mid - 1]) {
            return arr[mid];
        }
        // Check if mid+1 is the minimum element
        else if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
            return arr[mid + 1];
        }
        // Adjust the search space
        else if (arr[start] <= arr[mid]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    // If the array is not rotated
    return arr[0];
}
}