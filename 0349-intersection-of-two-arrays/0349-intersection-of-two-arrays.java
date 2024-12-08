class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> intersection = new ArrayList<>();
        find_Intersection(nums1, nums2, intersection);
         int[] intersectionArray = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            intersectionArray[i++] = num;
        }

        return intersectionArray;

    }

 public static void find_Intersection(int arr1[], int arr2[], List<Integer> intersection) {

        List<Integer> set = new ArrayList<>();

        for (int num : arr1) {
            if (!set.contains(num)) {
                set.add(num);
            }
        }

        for (int num : arr2) {
            if (set.contains(num) && !intersection.contains(num)) {
                intersection.add(num);
            }
        }

    }


}