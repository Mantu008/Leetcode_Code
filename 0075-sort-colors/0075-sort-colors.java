class Solution {
    public void sortColors(int[] nums) {
       sort(nums);
    }

    
    public static void sort(int arr[]) {
        int i = 0;
        int j = 0;
        int k = arr.length - 1;
        while (i < arr.length && i <= k) {
            if (arr[i] == 1) {
                i++;
            } else if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] == 2) {
                swap(arr, i, k);
                k--;
            }
        }
    }

    public static void swap(int arr[], int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}