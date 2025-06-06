class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = nums1.length;
        int n = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        while (i < m && j < n) {

            // Skip duplicates in nums1
            while (i > 0 && i < m && nums1[i] == nums1[i - 1]) {
                i++;
            }

            // Skip duplicates in nums2
            while (j > 0 && j < n && nums2[j] == nums2[j - 1]) {
                j++;
            }

            if (i >= m || j >= n) break;

            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }

        System.out.println(list);

        int arr[] = new int[list.size()];

        for (int p = 0; p < list.size(); p++) {
            arr[p] = list.get(p);
        }

        return arr;
    }
}
