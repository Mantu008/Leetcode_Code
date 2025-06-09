class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for(int num:nums1){
            list.add(num);
        }    

        for(int num:nums2){
            if(list.contains(num) && !result.contains(num)){
              result.add(num);
            }
        }

        int resultArr[]=new int[result.size()];
        int i=0;
        for(int num:result){
           resultArr[i]=num; 
           i++;
        }

        return resultArr;
    }
}
