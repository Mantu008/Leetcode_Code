class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);
        int start=0;
        solve(resultList, new ArrayList<>(), nums, start);
        return resultList;
    }

    public static void solve(List<List<Integer>> resultSets, List<Integer> tempSet,int[] nums, int start){
        if(!resultSets.contains(tempSet)){
            resultSets.add(new ArrayList<>(tempSet)); 
        }
        for(int i=start;i<nums.length;i++){
            // Case of including the number
            tempSet.add(nums[i]);

          // Backtrack the new subset
           solve(resultSets, tempSet, nums,i+1);

         // Case of not-including the number
          tempSet.remove(tempSet.size() - 1);
        }
    }
}