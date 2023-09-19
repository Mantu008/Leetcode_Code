class Solution {
    public int majorityElement(int[] nums) {
    Arrays.sort(nums); // for sort the given array
    return nums[nums.length/2];     // return the middle element of array
    }
}