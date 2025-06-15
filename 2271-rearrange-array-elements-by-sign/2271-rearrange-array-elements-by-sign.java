class Solution {
    public int[] rearrangeArray(int[] nums) {
        int tempArr[] = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                tempArr[neg] = nums[i];
                neg += 2;
            } else {
                tempArr[pos] = nums[i];
                pos += 2;
            }
        }

        return tempArr;
    }
}