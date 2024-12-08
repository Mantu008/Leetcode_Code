class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicateElementList = new ArrayList<>();
        findDuplicateElement(nums, duplicateElementList);
        return duplicateElementList;
    }

    public static void findDuplicateElement(int arr[], List<Integer> duplicateElementList) {
        Set<Integer> seen = new HashSet<>(); // Use a HashSet for efficient lookups

        for (int num : arr) {
            if (seen.contains(num)) {
                duplicateElementList.add(num); // Add to duplicates list if already seen
            } else {
                seen.add(num); // Mark as seen
            }
        }
    }
}
