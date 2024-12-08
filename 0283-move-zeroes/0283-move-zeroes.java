class Solution {
    public void moveZeroes(int[] nums) {
         movAllZeroTOENd(nums);
    }

     public static void movAllZeroTOENd(int[] arr) {
        int nonZeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}